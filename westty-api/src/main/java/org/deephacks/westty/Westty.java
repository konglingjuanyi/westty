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
package org.deephacks.westty;

public class Westty {
    private static final String WESTTY_CORE = "org.deephacks.westty.internal.core.WesttyCore";
    private final static Object WESTTY;
    static {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        try {
            WESTTY = cl.loadClass(WESTTY_CORE).newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Westty() {
    }

    public void start() {
        try {
            WESTTY.getClass().getMethod("start").invoke(WESTTY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        try {
            WESTTY.getClass().getMethod("stop").invoke(WESTTY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
