package com.ankamagames.dofus.datacenter.interactives;


public class SkillName
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public SkillName() {
  }
  public SkillName(int id, long nameId) {
    this.id = id;
    this.nameId = nameId;
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
}
