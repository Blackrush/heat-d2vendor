package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentGift
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int effectId;
  public int gfxId;
  public AlignmentGift() {
  }
  public AlignmentGift(int id, long nameId, int effectId, int gfxId) {
    this.id = id;
    this.nameId = nameId;
    this.effectId = effectId;
    this.gfxId = gfxId;
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
  public int getEffectId() {
    return this.effectId;
  }
  public void setEffectId(int effectId) {
    this.effectId = effectId;
  }
  public int getGfxId() {
    return this.gfxId;
  }
  public void setGfxId(int gfxId) {
    this.gfxId = gfxId;
  }
}
