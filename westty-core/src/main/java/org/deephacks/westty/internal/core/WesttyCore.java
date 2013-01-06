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
package org.deephacks.westty.internal.core;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.codehaus.jackson.map.DeserializationConfig;
import org.deephacks.westty.config.ServerConfig;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider;
import org.jboss.resteasy.spi.ResteasyDeployment;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Main class for starting and stopping Westty.
 */
public class WesttyCore {
    private static final WeldContainer container = new Weld().initialize();
    private static final Instance<WesttyEngine> instance = container.instance().select(
            WesttyEngine.class);
    private static final WesttyEngine westty = instance.get();

    public void start() {
        westty.start();
    }

    public void stop() {
        westty.stop();
    }

    private static class WesttyEngine {
        @Inject
        private ServerConfig config;
        @Inject
        private WesttyPipelineFactory coreFactory;
        @Inject
        private WesttyProtobufPipelineFactory protoFactory;
        @Inject
        private WesttyJaxrsApplication jaxrsApps;
        @Inject
        private ResteasyDeployment deployment;
        private Channel coreChannel;
        private Channel protoChannel;
        private ServerBootstrap coreBootstrap;
        private ServerBootstrap protoBootstrap;

        public void start() {
            deployment.setApplication(jaxrsApps);
            ResteasyJacksonProvider provider = new ResteasyJacksonProvider();
            provider.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            ResteasyProviderFactory resteasyFactory = ResteasyProviderFactory.getInstance();
            resteasyFactory.registerProviderInstance(provider);

            deployment.setProviderFactory(resteasyFactory);
            deployment.start();

            coreBootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(
                    Executors.newCachedThreadPool(), Executors.newCachedThreadPool(),
                    config.getIoWorkerCount()));
            coreBootstrap.setPipelineFactory(coreFactory);
            coreChannel = coreBootstrap.bind(new InetSocketAddress(config.getHttpPort()));

            protoBootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(
                    Executors.newCachedThreadPool(), Executors.newCachedThreadPool(),
                    config.getIoWorkerCount()));

            protoBootstrap.setPipelineFactory(protoFactory);
            protoChannel = protoBootstrap.bind(new InetSocketAddress(config.getProtobufPort()));

        }

        public void stop() {
            coreChannel.close().awaitUninterruptibly();
            coreBootstrap.releaseExternalResources();
            deployment.stop();

            protoChannel.close().awaitUninterruptibly();
            protoBootstrap.releaseExternalResources();
        }

        /**
         * ResteasyDeployment is not injectable. 
         */
        @SuppressWarnings("unused")
        @Produces
        @ApplicationScoped
        public ResteasyDeployment createResteasyDeployment() {
            return new ResteasyDeployment();
        }
    }
}
