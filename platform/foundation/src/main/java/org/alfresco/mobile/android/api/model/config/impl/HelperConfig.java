/*******************************************************************************
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 * 
 * This file is part of the Alfresco Mobile SDK.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.api.model.config.impl;

import java.lang.ref.WeakReference;

/**
 * @author Jean Marie Pascal
 */
public class HelperConfig
{
    protected WeakReference<ConfigurationImpl> configurationRef;

    protected WeakReference<HelperStringConfig> HelperStringRef;

    // ///////////////////////////////////////////////////////////////////////////
    // CONSTRUCTORS
    // ///////////////////////////////////////////////////////////////////////////
    HelperConfig(ConfigurationImpl configuration, HelperStringConfig localHelper)
    {
        configurationRef = new WeakReference<ConfigurationImpl>(configuration);
        HelperStringRef = new WeakReference<HelperStringConfig>(localHelper);
    }

    // ///////////////////////////////////////////////////////////////////////////
    // UTILS
    // ///////////////////////////////////////////////////////////////////////////
    protected ConfigurationImpl getConfiguration()
    {
        if (configurationRef == null) { return null; }
        return configurationRef.get();
    }

    protected boolean hasConfiguration()
    {
        if (configurationRef == null) { return false; }
        return configurationRef.get() != null;
    }

    protected boolean hasEvaluatorHelper()
    {
        if (configurationRef == null) { return false; }
        return configurationRef.get().getEvaluatorHelper() != null;
    }

    protected HelperEvaluatorConfig getEvaluatorHelper()
    {
        if (configurationRef == null) { return null; }
        return configurationRef.get().getEvaluatorHelper();
    }

    protected HelperStringConfig getLocaleHelper()
    {
        if (HelperStringRef == null) { return null; }
        return HelperStringRef.get();
    }

}
