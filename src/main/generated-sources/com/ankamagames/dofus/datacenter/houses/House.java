package com.ankamagames.dofus.datacenter.houses;


public class House
    implements java.io.Serializable {
  public int typeId;
  public int defaultPrice;
  public long nameId;
  public long descriptionId;
  public int gfxId;
  public House() {
  }
  public House(int typeId, int defaultPrice, long nameId, long descriptionId, int gfxId) {
    this.typeId = typeId;
    this.defaultPrice = defaultPrice;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.gfxId = gfxId;
  }

  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public int getDefaultPrice() {
    return this.defaultPrice;
  }
  public void setDefaultPrice(int defaultPrice) {
    this.defaultPrice = defaultPrice;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getGfxId() {
    return this.gfxId;
  }
  public void setGfxId(int gfxId) {
    this.gfxId = gfxId;
  }
}
