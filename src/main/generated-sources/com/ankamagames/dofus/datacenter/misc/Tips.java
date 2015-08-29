package com.ankamagames.dofus.datacenter.misc;


public class Tips
    implements java.io.Serializable {
  public int id;
  public long descId;
  public Tips() {
  }
  public Tips(int id, long descId) {
    this.id = id;
    this.descId = descId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getDescId() {
    return this.descId;
  }
  public void setDescId(long descId) {
    this.descId = descId;
  }
}
