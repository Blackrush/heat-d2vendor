package com.ankamagames.dofus.datacenter.monsters;


public class AnimFunMonsterData
    implements java.io.Serializable {
  public String animName;
  public int animWeight;
  public AnimFunMonsterData() {
  }
  public AnimFunMonsterData(String animName, int animWeight) {
    this.animName = animName;
    this.animWeight = animWeight;
  }

  public String getAnimName() {
    return this.animName;
  }
  public void setAnimName(String animName) {
    this.animName = animName;
  }
  public int getAnimWeight() {
    return this.animWeight;
  }
  public void setAnimWeight(int animWeight) {
    this.animWeight = animWeight;
  }
}
