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

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(WesttyJaxrsApplication.JAXRS_CONTEXT_URI)
public class WesttyJaxrsApplication extends Application {
	/** relative uri for jaxrs endpoint for "see other" and "redirects" */
	public static final String JAXRS_CONTEXT_URI = "/";
    @Inject
    private WesttyJaxrsExtension jaxrsExtension;
    @Inject
    private BeanManager bm;

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Set<Object> getSingletons() {
        HashSet<Object> instances = new HashSet<Object>();
        for (Class<?> cls : jaxrsExtension.getJaxrsClasses()) {
            Set<Bean<?>> beans = bm.getBeans(cls);
            for (Bean<?> bean : beans) {
                CreationalContext cc = bm.createCreationalContext(null);
                Object jaxrs = bean.create(cc);
                instances.add(jaxrs);
            }
        }
        return instances;
    }
}
