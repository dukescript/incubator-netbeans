/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.html.angular.navigate;

import junit.framework.Test;
import org.netbeans.jellytools.JellyTestCase;

/**
 *
 * @author vriha
 */
public class NavigationAsSuite {

    public static Test suite() {
        return JellyTestCase.emptyConfiguration().
                addTest(CtrlAsGlobalTest.class, CtrlAsGlobalTest.tests).
                addTest(CtrlAsModuleNav2Test.class, CtrlAsModuleNav2Test.tests).
                addTest(CtrlAsModuleNavTest.class, CtrlAsModuleNavTest.tests).
                addTest(NavigationAsTest.class, NavigationAsTest.tests).
                suite();
    }

}
