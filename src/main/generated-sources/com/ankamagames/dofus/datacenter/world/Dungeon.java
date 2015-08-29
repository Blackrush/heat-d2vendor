package com.ankamagames.dofus.datacenter.world;


public class Dungeon
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int optimalPlayerLevel;
  public int[] mapIds;
  public int entranceMapId;
  public int exitMapId;
  public Dungeon() {
  }
  public Dungeon(int id, long nameId, int optimalPlayerLevel, int[] mapIds, int entranceMapId, int exitMapId) {
    this.id = id;
    this.nameId = nameId;
    this.optimalPlayerLevel = optimalPlayerLevel;
    this.mapIds = mapIds;
    this.entranceMapId = entranceMapId;
    this.exitMapId = exitMapId;
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
  public int getOptimalPlayerLevel() {
    return this.optimalPlayerLevel;
  }
  public void setOptimalPlayerLevel(int optimalPlayerLevel) {
    this.optimalPlayerLevel = optimalPlayerLevel;
  }
  public int[] getMapIds() {
    return this.mapIds;
  }
  public void setMapIds(int[] mapIds) {
    this.mapIds = mapIds;
  }
  public int getEntranceMapId() {
    return this.entranceMapId;
  }
  public void setEntranceMapId(int entranceMapId) {
    this.entranceMapId = entranceMapId;
  }
  public int getExitMapId() {
    return this.exitMapId;
  }
  public void setExitMapId(int exitMapId) {
    this.exitMapId = exitMapId;
  }
}
