package com.ankamagames.dofus.datacenter.appearance;


public class SkinMapping
    implements java.io.Serializable {
  public int id;
  public int lowDefId;
  public SkinMapping() {
  }
  public SkinMapping(int id, int lowDefId) {
    this.id = id;
    this.lowDefId = lowDefId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getLowDefId() {
    return this.lowDefId;
  }
  public void setLowDefId(int lowDefId) {
    this.lowDefId = lowDefId;
  }
}
