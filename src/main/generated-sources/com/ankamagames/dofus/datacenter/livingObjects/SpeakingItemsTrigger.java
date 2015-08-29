package com.ankamagames.dofus.datacenter.livingObjects;


public class SpeakingItemsTrigger
    implements java.io.Serializable {
  public int triggersId;
  public int[] textIds;
  public int[] states;
  public SpeakingItemsTrigger() {
  }
  public SpeakingItemsTrigger(int triggersId, int[] textIds, int[] states) {
    this.triggersId = triggersId;
    this.textIds = textIds;
    this.states = states;
  }

  public int getTriggersId() {
    return this.triggersId;
  }
  public void setTriggersId(int triggersId) {
    this.triggersId = triggersId;
  }
  public int[] getTextIds() {
    return this.textIds;
  }
  public void setTextIds(int[] textIds) {
    this.textIds = textIds;
  }
  public int[] getStates() {
    return this.states;
  }
  public void setStates(int[] states) {
    this.states = states;
  }
}
