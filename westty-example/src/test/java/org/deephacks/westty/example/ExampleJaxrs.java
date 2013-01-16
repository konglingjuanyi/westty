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
package org.deephacks.westty.example;

import java.io.File;

import org.deephacks.tools4j.config.admin.JaxrsConfigClient;
import org.deephacks.westty.Westty;
import org.deephacks.westty.config.JpaConfig;
import org.deephacks.westty.config.WebConfig;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class ExampleJaxrs {
    public static void main(String[] args) {

        Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);
        new JpaConfig().dropInstall();

        Westty westty = new Westty();
        westty.startup();
        File file = new File("./src/main/resources");
        JaxrsConfigClient client = new JaxrsConfigClient("localhost", 8080, "/jaxrs");
        WebConfig config = new WebConfig();
        config.setStaticRoot(file.getAbsolutePath());
        client.merge(config);

    }
}
