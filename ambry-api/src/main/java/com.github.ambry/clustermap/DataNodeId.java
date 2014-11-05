package com.github.ambry.clustermap;

/**
 * A DataNodeId has many devices. A DataNodeId stores one or more {@link ReplicaId}s upon each device.
 */
public abstract class DataNodeId implements Comparable<DataNodeId> {

  /**
   * Gets the hostname of this DataNodeId.
   *
   * @return fully qualified domain name of the DataNodeId.
   */
  public abstract String getHostname();

  /**
   * Gets the DataNodeId's connection port.
   *
   * @return port upon which to establish a connection with the DataNodeId.
   */
  public abstract int getPort();

  /**
   * Gets the state of the DataNodeId.
   *
   * @return state of the DataNodeId.
   */
  public abstract HardwareState getState();

  /**
   * Gets the DataNodeId's datacenter
   *
   * @return name of the Datacenter
   */
  public abstract String getDatacenterName();

  /**
   * Performs the required action when the associated DataNode becomes unreachable.
   */
  public abstract void onNodeTimeout();
}

