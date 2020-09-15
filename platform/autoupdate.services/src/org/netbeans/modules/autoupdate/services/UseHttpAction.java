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
package org.netbeans.modules.autoupdate.services;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.spi.autoupdate.UseHttpSpi;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "System",
        id = "org.netbeans.modules.autoupdate.services.UseHttpAction"
)
@ActionRegistration(
        displayName = "#CTL_UseHttpAction"
)
@ActionReference(path = "Menu/Tools", position = 1400)
@Messages("CTL_UseHttpAction=Use HTTP API from JDK11")
public final class UseHttpAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UseHttpSpi service = Lookup.getDefault().lookup(UseHttpSpi.class);
            if (service != null) {
                    service.demo();
            } else {
                throw new IllegalStateException("HttpClient not available on " + System.getProperty("java.version"));
            }
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
