package com.ankamagames.dofus.datacenter.quest;


public class QuestStepRewards
    implements java.io.Serializable {
  public int id;
  public int stepId;
  public int levelMin;
  public int levelMax;
  public long[][] itemsReward;
  public long[] emotesReward;
  public long[] jobsReward;
  public long[] spellsReward;
  public QuestStepRewards() {
  }
  public QuestStepRewards(int id, int stepId, int levelMin, int levelMax, long[][] itemsReward, long[] emotesReward, long[] jobsReward, long[] spellsReward) {
    this.id = id;
    this.stepId = stepId;
    this.levelMin = levelMin;
    this.levelMax = levelMax;
    this.itemsReward = itemsReward;
    this.emotesReward = emotesReward;
    this.jobsReward = jobsReward;
    this.spellsReward = spellsReward;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getStepId() {
    return this.stepId;
  }
  public void setStepId(int stepId) {
    this.stepId = stepId;
  }
  public int getLevelMin() {
    return this.levelMin;
  }
  public void setLevelMin(int levelMin) {
    this.levelMin = levelMin;
  }
  public int getLevelMax() {
    return this.levelMax;
  }
  public void setLevelMax(int levelMax) {
    this.levelMax = levelMax;
  }
  public long[][] getItemsReward() {
    return this.itemsReward;
  }
  public void setItemsReward(long[][] itemsReward) {
    this.itemsReward = itemsReward;
  }
  public long[] getEmotesReward() {
    return this.emotesReward;
  }
  public void setEmotesReward(long[] emotesReward) {
    this.emotesReward = emotesReward;
  }
  public long[] getJobsReward() {
    return this.jobsReward;
  }
  public void setJobsReward(long[] jobsReward) {
    this.jobsReward = jobsReward;
  }
  public long[] getSpellsReward() {
    return this.spellsReward;
  }
  public void setSpellsReward(long[] spellsReward) {
    this.spellsReward = spellsReward;
  }
}
