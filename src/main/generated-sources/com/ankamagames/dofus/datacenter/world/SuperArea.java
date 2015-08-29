package com.ankamagames.dofus.datacenter.world;


public class SuperArea
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int worldmapId;
  public boolean hasWorldMap;
  public SuperArea() {
  }
  public SuperArea(int id, long nameId, int worldmapId, boolean hasWorldMap) {
    this.id = id;
    this.nameId = nameId;
    this.worldmapId = worldmapId;
    this.hasWorldMap = hasWorldMap;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public int getWorldmapId() {
    return this.worldmapId;
  }
  public void setWorldmapId(int worldmapId) {
    this.worldmapId = worldmapId;
  }
  public boolean getHasWorldMap() {
    return this.hasWorldMap;
  }
  public void setHasWorldMap(boolean hasWorldMap) {
    this.hasWorldMap = hasWorldMap;
  }
}
