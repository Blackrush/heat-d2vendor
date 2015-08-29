package com.ankamagames.dofus.datacenter.appearance;


public class CreatureBoneOverride
    implements java.io.Serializable {
  public int boneId;
  public int creatureBoneId;
  public CreatureBoneOverride() {
  }
  public CreatureBoneOverride(int boneId, int creatureBoneId) {
    this.boneId = boneId;
    this.creatureBoneId = creatureBoneId;
  }

  public int getBoneId() {
    return this.boneId;
  }
  public void setBoneId(int boneId) {
    this.boneId = boneId;
  }
  public int getCreatureBoneId() {
    return this.creatureBoneId;
  }
  public void setCreatureBoneId(int creatureBoneId) {
    this.creatureBoneId = creatureBoneId;
  }
}
