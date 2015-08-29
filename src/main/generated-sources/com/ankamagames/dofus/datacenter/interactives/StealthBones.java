package com.ankamagames.dofus.datacenter.interactives;


public class StealthBones
    implements java.io.Serializable {
  public int id;
  public StealthBones() {
  }
  public StealthBones(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
}
