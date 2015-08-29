package com.ankamagames.dofus.datacenter.livingObjects;


public class LivingObjectSkinJntMood
    implements java.io.Serializable {
  public int skinId;
  public int[][] moods;
  public LivingObjectSkinJntMood() {
  }
  public LivingObjectSkinJntMood(int skinId, int[][] moods) {
    this.skinId = skinId;
    this.moods = moods;
  }

  public int getSkinId() {
    return this.skinId;
  }
  public void setSkinId(int skinId) {
    this.skinId = skinId;
  }
  public int[][] getMoods() {
    return this.moods;
  }
  public void setMoods(int[][] moods) {
    this.moods = moods;
  }
}
