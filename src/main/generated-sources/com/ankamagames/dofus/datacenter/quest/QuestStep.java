package com.ankamagames.dofus.datacenter.quest;


public class QuestStep
    implements java.io.Serializable {
  public int id;
  public int questId;
  public long nameId;
  public long descriptionId;
  public int dialogId;
  public int optimalLevel;
  public double duration;
  public boolean kamasScaleWithPlayerLevel;
  public double kamasRatio;
  public double xpRatio;
  public long[] objectiveIds;
  public long[] rewardsIds;
  public QuestStep() {
  }
  public QuestStep(int id, int questId, long nameId, long descriptionId, int dialogId, int optimalLevel, double duration, boolean kamasScaleWithPlayerLevel, double kamasRatio, double xpRatio, long[] objectiveIds, long[] rewardsIds) {
    this.id = id;
    this.questId = questId;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.dialogId = dialogId;
    this.optimalLevel = optimalLevel;
    this.duration = duration;
    this.kamasScaleWithPlayerLevel = kamasScaleWithPlayerLevel;
    this.kamasRatio = kamasRatio;
    this.xpRatio = xpRatio;
    this.objectiveIds = objectiveIds;
    this.rewardsIds = rewardsIds;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getQuestId() {
    return this.questId;
  }
  public void setQuestId(int questId) {
    this.questId = questId;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getDialogId() {
    return this.dialogId;
  }
  public void setDialogId(int dialogId) {
    this.dialogId = dialogId;
  }
  public int getOptimalLevel() {
    return this.optimalLevel;
  }
  public void setOptimalLevel(int optimalLevel) {
    this.optimalLevel = optimalLevel;
  }
  public double getDuration() {
    return this.duration;
  }
  public void setDuration(double duration) {
    this.duration = duration;
  }
  public boolean getKamasScaleWithPlayerLevel() {
    return this.kamasScaleWithPlayerLevel;
  }
  public void setKamasScaleWithPlayerLevel(boolean kamasScaleWithPlayerLevel) {
    this.kamasScaleWithPlayerLevel = kamasScaleWithPlayerLevel;
  }
  public double getKamasRatio() {
    return this.kamasRatio;
  }
  public void setKamasRatio(double kamasRatio) {
    this.kamasRatio = kamasRatio;
  }
  public double getXpRatio() {
    return this.xpRatio;
  }
  public void setXpRatio(double xpRatio) {
    this.xpRatio = xpRatio;
  }
  public long[] getObjectiveIds() {
    return this.objectiveIds;
  }
  public void setObjectiveIds(long[] objectiveIds) {
    this.objectiveIds = objectiveIds;
  }
  public long[] getRewardsIds() {
    return this.rewardsIds;
  }
  public void setRewardsIds(long[] rewardsIds) {
    this.rewardsIds = rewardsIds;
  }
}
