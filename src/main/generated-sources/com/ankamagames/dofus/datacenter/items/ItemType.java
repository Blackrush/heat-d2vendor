package com.ankamagames.dofus.datacenter.items;


public class ItemType
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int superTypeId;
  public boolean plural;
  public int gender;
  public String rawZone;
  public boolean needUseConfirm;
  public boolean mimickable;
  public ItemType() {
  }
  public ItemType(int id, long nameId, int superTypeId, boolean plural, int gender, String rawZone, boolean needUseConfirm, boolean mimickable) {
    this.id = id;
    this.nameId = nameId;
    this.superTypeId = superTypeId;
    this.plural = plural;
    this.gender = gender;
    this.rawZone = rawZone;
    this.needUseConfirm = needUseConfirm;
    this.mimickable = mimickable;
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
  public int getSuperTypeId() {
    return this.superTypeId;
  }
  public void setSuperTypeId(int superTypeId) {
    this.superTypeId = superTypeId;
  }
  public boolean getPlural() {
    return this.plural;
  }
  public void setPlural(boolean plural) {
    this.plural = plural;
  }
  public int getGender() {
    return this.gender;
  }
  public void setGender(int gender) {
    this.gender = gender;
  }
  public String getRawZone() {
    return this.rawZone;
  }
  public void setRawZone(String rawZone) {
    this.rawZone = rawZone;
  }
  public boolean getNeedUseConfirm() {
    return this.needUseConfirm;
  }
  public void setNeedUseConfirm(boolean needUseConfirm) {
    this.needUseConfirm = needUseConfirm;
  }
  public boolean getMimickable() {
    return this.mimickable;
  }
  public void setMimickable(boolean mimickable) {
    this.mimickable = mimickable;
  }
}
