package com.ankamagames.dofus.datacenter.world;


public class Waypoint
    implements java.io.Serializable {
  public int id;
  public int mapId;
  public int subAreaId;
  public Waypoint() {
  }
  public Waypoint(int id, int mapId, int subAreaId) {
    this.id = id;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getMapId() {
    return this.mapId;
  }
  public void setMapId(int mapId) {
    this.mapId = mapId;
  }
  public int getSubAreaId() {
    return this.subAreaId;
  }
  public void setSubAreaId(int subAreaId) {
    this.subAreaId = subAreaId;
  }
}
