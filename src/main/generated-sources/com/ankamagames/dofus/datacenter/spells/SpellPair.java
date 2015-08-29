package com.ankamagames.dofus.datacenter.spells;


public class SpellPair
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descriptionId;
  public int iconId;
  public SpellPair() {
  }
  public SpellPair(int id, long nameId, long descriptionId, int iconId) {
    this.id = id;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.iconId = iconId;
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
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
}
