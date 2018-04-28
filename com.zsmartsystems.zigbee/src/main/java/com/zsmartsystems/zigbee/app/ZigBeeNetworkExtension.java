/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.app;

import com.zsmartsystems.zigbee.ZigBeeNetworkManager;

/**
 * Defines the interface for a ZigBee Extension
 * <p>
 * Extensions provide specific functionality in the framework and can be instantiated and registered with the network
 * manager. An extension is registered with the {@link ZigBeeNetworkManager}, and the endpoint will take care of
 * starting and stopping the extension.
 *
 * @author Chris Jackson
 *
 */
public interface ZigBeeNetworkExtension {

    /**
     * Starts an extension. The extension should perform any initialisation. This gets called when
     * the extension is registered.
     *
     * @param networkManager The {@link ZigBeeNetworkManager} of the network
     * @return true if the extension started successfully
     */
    public boolean extensionStartup(final ZigBeeNetworkManager networkManager);

    /**
     * Shuts down an extension. The extension should perform any shutdown and cleanup as required.
     */
    public void extensionShutdown();
}