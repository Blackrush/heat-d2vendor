package com.ankamagames.dofus.datacenter.mounts;


public class Mount
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public String look;
  public Mount() {
  }
  public Mount(int id, long nameId, String look) {
    this.id = id;
    this.nameId = nameId;
    this.look = look;
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
  public String getLook() {
    return this.look;
  }
  public void setLook(String look) {
    this.look = look;
  }
}
