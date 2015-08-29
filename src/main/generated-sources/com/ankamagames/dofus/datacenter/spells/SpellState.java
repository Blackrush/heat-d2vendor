package com.ankamagames.dofus.datacenter.spells;


public class SpellState
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public boolean preventsSpellCast;
  public boolean preventsFight;
  public boolean isSilent;
  public int[] effectsIds;
  public SpellState() {
  }
  public SpellState(int id, long nameId, boolean preventsSpellCast, boolean preventsFight, boolean isSilent, int[] effectsIds) {
    this.id = id;
    this.nameId = nameId;
    this.preventsSpellCast = preventsSpellCast;
    this.preventsFight = preventsFight;
    this.isSilent = isSilent;
    this.effectsIds = effectsIds;
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
  public boolean getPreventsSpellCast() {
    return this.preventsSpellCast;
  }
  public void setPreventsSpellCast(boolean preventsSpellCast) {
    this.preventsSpellCast = preventsSpellCast;
  }
  public boolean getPreventsFight() {
    return this.preventsFight;
  }
  public void setPreventsFight(boolean preventsFight) {
    this.preventsFight = preventsFight;
  }
  public boolean getIsSilent() {
    return this.isSilent;
  }
  public void setIsSilent(boolean isSilent) {
    this.isSilent = isSilent;
  }
  public int[] getEffectsIds() {
    return this.effectsIds;
  }
  public void setEffectsIds(int[] effectsIds) {
    this.effectsIds = effectsIds;
  }
}
