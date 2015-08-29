package com.ankamagames.dofus.datacenter.world;


public class Phoenix
    implements java.io.Serializable {
  public int mapId;
  public Phoenix() {
  }
  public Phoenix(int mapId) {
    this.mapId = mapId;
  }

  public int getMapId() {
    return this.mapId;
  }
  public void setMapId(int mapId) {
    this.mapId = mapId;
  }
}
