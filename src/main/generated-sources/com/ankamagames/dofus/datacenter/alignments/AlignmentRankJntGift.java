package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentRankJntGift
    implements java.io.Serializable {
  public int id;
  public int[] gifts;
  public int[] parameters;
  public int[] levels;
  public AlignmentRankJntGift() {
  }
  public AlignmentRankJntGift(int id, int[] gifts, int[] parameters, int[] levels) {
    this.id = id;
    this.gifts = gifts;
    this.parameters = parameters;
    this.levels = levels;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int[] getGifts() {
    return this.gifts;
  }
  public void setGifts(int[] gifts) {
    this.gifts = gifts;
  }
  public int[] getParameters() {
    return this.parameters;
  }
  public void setParameters(int[] parameters) {
    this.parameters = parameters;
  }
  public int[] getLevels() {
    return this.levels;
  }
  public void setLevels(int[] levels) {
    this.levels = levels;
  }
}
