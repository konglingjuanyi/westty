/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deephacks.westty.internal.core.http;

import org.deephacks.westty.config.ServerConfig;
import org.deephacks.westty.config.ServerSpecificConfigProxy;
import org.deephacks.westty.spi.HttpHandler;
import org.deephacks.westty.spi.ProviderShutdownEvent;
import org.deephacks.westty.spi.ProviderStartupEvent;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.http.HttpChunkAggregator;
import org.jboss.netty.handler.codec.http.HttpResponseEncoder;
import org.jboss.netty.handler.execution.ExecutionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static org.jboss.netty.channel.Channels.pipeline;

@Singleton
public class HttpPipelineFactory implements ChannelPipelineFactory {
    private static final Logger log = LoggerFactory.getLogger(HttpPipelineFactory.class);
    @Inject
    private Instance<HttpHandler> handlers;

    private List<HttpHandler> handlerList = new ArrayList<>();

    @Inject
    private HttpUpstreamHandler requestHandler;

    private ThreadPoolExecutor executor;

    private ServerConfig server;

    private ExecutionHandler executionHandler;

    private Channel standardChannel;
    private ServerBootstrap standardBootstrap;

    @Inject
    public HttpPipelineFactory(ServerSpecificConfigProxy<ServerConfig> server, ThreadPoolExecutor executor) {
        this.server = server.get();
        this.executor = executor;
        int ioWorkerCount = this.server.getIoWorkerCount();
        ExecutorService workers = Executors.newCachedThreadPool();
        ExecutorService boss = Executors.newCachedThreadPool();
        standardBootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(boss, workers,
                ioWorkerCount));
        standardBootstrap.setPipelineFactory(this);

    }

    public ChannelPipeline getPipeline() throws Exception {
        if (executionHandler == null) {
            this.executionHandler = new ExecutionHandler(executor);
            for (HttpHandler handler : handlers) {
                handlerList.add(handler);
            }
        }
        ChannelPipeline pipeline = pipeline();
        pipeline.addLast("westtyDecoder", new HttpDecoder(server.getHtmlDir(), handlerList));
        pipeline.addLast("aggregator", new HttpChunkAggregator(65536));
        pipeline.addLast("encoder", new HttpResponseEncoder());
        if (executionHandler != null) {
            pipeline.addLast("executionHandler", executionHandler);
        }
        pipeline.addLast("handler", requestHandler);

        return pipeline;
    }

    public void startup(@Observes ProviderStartupEvent event) {
        standardChannel = standardBootstrap.bind(new InetSocketAddress(server.getHttpPort()));
        log.info("Http listening on port {}.", server.getHttpPort());
    }

    public void shutdown(@Observes ProviderShutdownEvent event) {
        log.info("Closing channels.");
        requestHandler.getClientChannels().close();
        if (standardChannel != null) {
            standardChannel.close().awaitUninterruptibly(5000);
        }
        if (standardBootstrap != null) {
            standardBootstrap.releaseExternalResources();
        }
        log.info("All channels closed.");
    }
}
