package com.ankamagames.dofus.datacenter.spells;


public class SpellType
    implements java.io.Serializable {
  public int id;
  public long longNameId;
  public long shortNameId;
  public SpellType() {
  }
  public SpellType(int id, long longNameId, long shortNameId) {
    this.id = id;
    this.longNameId = longNameId;
    this.shortNameId = shortNameId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getLongNameId() {
    return this.longNameId;
  }
  public void setLongNameId(long longNameId) {
    this.longNameId = longNameId;
  }
  public long getShortNameId() {
    return this.shortNameId;
  }
  public void setShortNameId(long shortNameId) {
    this.shortNameId = shortNameId;
  }
}
