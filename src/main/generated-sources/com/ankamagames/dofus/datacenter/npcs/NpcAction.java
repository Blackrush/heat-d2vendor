package com.ankamagames.dofus.datacenter.npcs;


public class NpcAction
    implements java.io.Serializable {
  public int id;
  public int realId;
  public long nameId;
  public NpcAction() {
  }
  public NpcAction(int id, int realId, long nameId) {
    this.id = id;
    this.realId = realId;
    this.nameId = nameId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getRealId() {
    return this.realId;
  }
  public void setRealId(int realId) {
    this.realId = realId;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
}
