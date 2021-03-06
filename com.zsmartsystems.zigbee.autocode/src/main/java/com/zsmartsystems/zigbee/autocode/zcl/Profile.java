/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.autocode.zcl;

import java.util.TreeMap;

/**
 * Created by tlaukkan on 4/10/2016.
 */
public class Profile {
    public int profileId;
    public String profileName;
    public String profileAbbreviation;
    public String profileType;
    public TreeMap<Integer, Cluster> clusters = new TreeMap<Integer, Cluster>();
}
