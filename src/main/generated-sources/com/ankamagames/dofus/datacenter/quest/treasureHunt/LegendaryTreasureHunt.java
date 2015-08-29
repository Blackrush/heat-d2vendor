package com.ankamagames.dofus.datacenter.quest.treasureHunt;


public class LegendaryTreasureHunt
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int level;
  public long chestId;
  public long monsterId;
  public long mapItemId;
  public double xpRatio;
  public LegendaryTreasureHunt() {
  }
  public LegendaryTreasureHunt(int id, long nameId, int level, long chestId, long monsterId, long mapItemId, double xpRatio) {
    this.id = id;
    this.nameId = nameId;
    this.level = level;
    this.chestId = chestId;
    this.monsterId = monsterId;
    this.mapItemId = mapItemId;
    this.xpRatio = xpRatio;
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
  public int getLevel() {
    return this.level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public long getChestId() {
    return this.chestId;
  }
  public void setChestId(long chestId) {
    this.chestId = chestId;
  }
  public long getMonsterId() {
    return this.monsterId;
  }
  public void setMonsterId(long monsterId) {
    this.monsterId = monsterId;
  }
  public long getMapItemId() {
    return this.mapItemId;
  }
  public void setMapItemId(long mapItemId) {
    this.mapItemId = mapItemId;
  }
  public double getXpRatio() {
    return this.xpRatio;
  }
  public void setXpRatio(double xpRatio) {
    this.xpRatio = xpRatio;
  }
}
