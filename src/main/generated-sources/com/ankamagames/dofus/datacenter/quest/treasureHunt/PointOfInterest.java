package com.ankamagames.dofus.datacenter.quest.treasureHunt;


public class PointOfInterest
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int categoryId;
  public PointOfInterest() {
  }
  public PointOfInterest(int id, long nameId, int categoryId) {
    this.id = id;
    this.nameId = nameId;
    this.categoryId = categoryId;
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
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
}
