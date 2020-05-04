/*
 *  Copyright 2020 Bloomreach, Inc.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.bloomreach.forge.iframeperspective;

import org.hippoecm.frontend.plugin.IPluginContext;
import org.hippoecm.frontend.plugin.config.IPluginConfig;

/**
 * Convenient class providing the same functionality as {@link GenericIFramePerspective} when configuring the
 * third {@link GenericIFramePerspective} based extension perspective only through configuration.
 */
@SuppressWarnings("serial")
public class GenericIFramePerspective3 extends GenericIFramePerspective {

    public GenericIFramePerspective3(IPluginContext context, IPluginConfig config) {
        super(context, config);
    }

}