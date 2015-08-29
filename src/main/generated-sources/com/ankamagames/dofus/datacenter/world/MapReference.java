package com.ankamagames.dofus.datacenter.world;


public class MapReference
    implements java.io.Serializable {
  public int id;
  public int mapId;
  public int cellId;
  public MapReference() {
  }
  public MapReference(int id, int mapId, int cellId) {
    this.id = id;
    this.mapId = mapId;
    this.cellId = cellId;
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
  public int getCellId() {
    return this.cellId;
  }
  public void setCellId(int cellId) {
    this.cellId = cellId;
  }
}
