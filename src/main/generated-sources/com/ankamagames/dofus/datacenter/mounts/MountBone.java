package com.ankamagames.dofus.datacenter.mounts;


public class MountBone
    implements java.io.Serializable {
  public int id;
  public MountBone() {
  }
  public MountBone(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
}
