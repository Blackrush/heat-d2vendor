package com.ankamagames.dofus.datacenter.mounts;


public class RideFood
    implements java.io.Serializable {
  public int gid;
  public int typeId;
  public RideFood() {
  }
  public RideFood(int gid, int typeId) {
    this.gid = gid;
    this.typeId = typeId;
  }

  public int getGid() {
    return this.gid;
  }
  public void setGid(int gid) {
    this.gid = gid;
  }
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
}
