/**
 * Copyright 2016 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.github.ambry.clustermap;

import com.github.ambry.network.Port;


/**
 * A DataNodeId has many devices. A DataNodeId stores one or more {@link ReplicaId}s upon each device.
 */
public interface DataNodeId extends Resource, Comparable<DataNodeId> {

  /**
   * Gets the hostname of this DataNodeId.
   *
   * @return fully qualified domain name of the DataNodeId.
   */
  String getHostname();

  /**
   * Gets the DataNodeId's connection port number.
   *
   * @return Port number upon which to establish a connection with the DataNodeId.
   */
  int getPort();

  /**
   * Gets the DataNodeId's SSL connection port number.
   *
   * @return Port number upon which to establish an SSL encrypted connection with the DataNodeId.
   */
  int getSSLPort();

  /**
   * Returns true if SSL port exists for the DataNodeId.
   *
   * @return true if SSL port exists for the datanode, false otherwise.
   */
  boolean hasSSLPort();

  /**
   * Returns the {@link Port} of this node to connect to.
   *
   * @return {@link Port} to which the caller can connect to.
   */
  Port getPortToConnectTo();

  /**
   * Gets the state of the DataNodeId.
   *
   * @return state of the DataNodeId.
   */
  HardwareState getState();

  /**
   * Gets the DataNodeId's datacenter
   *
   * @return name of the Datacenter
   */
  String getDatacenterName();

  /**
   * Get the DataNodeId's server rack ID.  This is a unique identifier for a failure zone. If there is no rack ID for
   * this node, null will be returned, so the caller must check that the returned value is non-null
   *
   * @return a valid rack ID, or null if no rack ID is assigned
   */
  String getRackId();
}
