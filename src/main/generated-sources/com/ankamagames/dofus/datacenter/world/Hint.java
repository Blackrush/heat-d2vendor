package com.ankamagames.dofus.datacenter.world;


public class Hint
    implements java.io.Serializable {
  public int id;
  public int categoryId;
  public int gfx;
  public long nameId;
  public int mapId;
  public int realMapId;
  public int x;
  public int y;
  public boolean outdoor;
  public int subareaId;
  public int worldMapId;
  public Hint() {
  }
  public Hint(int id, int categoryId, int gfx, long nameId, int mapId, int realMapId, int x, int y, boolean outdoor, int subareaId, int worldMapId) {
    this.id = id;
    this.categoryId = categoryId;
    this.gfx = gfx;
    this.nameId = nameId;
    this.mapId = mapId;
    this.realMapId = realMapId;
    this.x = x;
    this.y = y;
    this.outdoor = outdoor;
    this.subareaId = subareaId;
    this.worldMapId = worldMapId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public int getGfx() {
    return this.gfx;
  }
  public void setGfx(int gfx) {
    this.gfx = gfx;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public int getMapId() {
    return this.mapId;
  }
  public void setMapId(int mapId) {
    this.mapId = mapId;
  }
  public int getRealMapId() {
    return this.realMapId;
  }
  public void setRealMapId(int realMapId) {
    this.realMapId = realMapId;
  }
  public int getX() {
    return this.x;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getY() {
    return this.y;
  }
  public void setY(int y) {
    this.y = y;
  }
  public boolean getOutdoor() {
    return this.outdoor;
  }
  public void setOutdoor(boolean outdoor) {
    this.outdoor = outdoor;
  }
  public int getSubareaId() {
    return this.subareaId;
  }
  public void setSubareaId(int subareaId) {
    this.subareaId = subareaId;
  }
  public int getWorldMapId() {
    return this.worldMapId;
  }
  public void setWorldMapId(int worldMapId) {
    this.worldMapId = worldMapId;
  }
}
