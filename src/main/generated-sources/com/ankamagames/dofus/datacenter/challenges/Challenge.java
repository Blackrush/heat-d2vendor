package com.ankamagames.dofus.datacenter.challenges;


public class Challenge
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descriptionId;
  public Challenge() {
  }
  public Challenge(int id, long nameId, long descriptionId) {
    this.id = id;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
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
}
