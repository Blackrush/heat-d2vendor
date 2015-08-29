package com.ankamagames.dofus.datacenter.world;

import flash.geom.Rectangle;

public class Area
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int superAreaId;
  public boolean containHouses;
  public boolean containPaddocks;
  public Rectangle bounds;
  public int worldmapId;
  public boolean hasWorldMap;
  public Area() {
  }
  public Area(int id, long nameId, int superAreaId, boolean containHouses, boolean containPaddocks, Rectangle bounds, int worldmapId, boolean hasWorldMap) {
    this.id = id;
    this.nameId = nameId;
    this.superAreaId = superAreaId;
    this.containHouses = containHouses;
    this.containPaddocks = containPaddocks;
    this.bounds = bounds;
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
  public int getSuperAreaId() {
    return this.superAreaId;
  }
  public void setSuperAreaId(int superAreaId) {
    this.superAreaId = superAreaId;
  }
  public boolean getContainHouses() {
    return this.containHouses;
  }
  public void setContainHouses(boolean containHouses) {
    this.containHouses = containHouses;
  }
  public boolean getContainPaddocks() {
    return this.containPaddocks;
  }
  public void setContainPaddocks(boolean containPaddocks) {
    this.containPaddocks = containPaddocks;
  }
  public Rectangle getBounds() {
    return this.bounds;
  }
  public void setBounds(Rectangle bounds) {
    this.bounds = bounds;
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
