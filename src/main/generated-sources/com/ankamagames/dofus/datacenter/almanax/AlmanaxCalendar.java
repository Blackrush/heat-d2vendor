package com.ankamagames.dofus.datacenter.almanax;


public class AlmanaxCalendar
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descId;
  public int npcId;
  public AlmanaxCalendar() {
  }
  public AlmanaxCalendar(int id, long nameId, long descId, int npcId) {
    this.id = id;
    this.nameId = nameId;
    this.descId = descId;
    this.npcId = npcId;
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
  public long getDescId() {
    return this.descId;
  }
  public void setDescId(long descId) {
    this.descId = descId;
  }
  public int getNpcId() {
    return this.npcId;
  }
  public void setNpcId(int npcId) {
    this.npcId = npcId;
  }
}
