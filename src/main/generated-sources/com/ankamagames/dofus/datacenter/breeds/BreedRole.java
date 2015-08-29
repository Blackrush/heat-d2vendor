package com.ankamagames.dofus.datacenter.breeds;


public class BreedRole
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descriptionId;
  public int assetId;
  public int color;
  public BreedRole() {
  }
  public BreedRole(int id, long nameId, long descriptionId, int assetId, int color) {
    this.id = id;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.assetId = assetId;
    this.color = color;
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
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getAssetId() {
    return this.assetId;
  }
  public void setAssetId(int assetId) {
    this.assetId = assetId;
  }
  public int getColor() {
    return this.color;
  }
  public void setColor(int color) {
    this.color = color;
  }
}
