package com.ankamagames.dofus.datacenter.quest;


public class Achievement
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int categoryId;
  public long descriptionId;
  public int iconId;
  public int points;
  public int level;
  public int order;
  public double kamasRatio;
  public double experienceRatio;
  public boolean kamasScaleWithPlayerLevel;
  public int[] objectiveIds;
  public int[] rewardIds;
  public Achievement() {
  }
  public Achievement(int id, long nameId, int categoryId, long descriptionId, int iconId, int points, int level, int order, double kamasRatio, double experienceRatio, boolean kamasScaleWithPlayerLevel, int[] objectiveIds, int[] rewardIds) {
    this.id = id;
    this.nameId = nameId;
    this.categoryId = categoryId;
    this.descriptionId = descriptionId;
    this.iconId = iconId;
    this.points = points;
    this.level = level;
    this.order = order;
    this.kamasRatio = kamasRatio;
    this.experienceRatio = experienceRatio;
    this.kamasScaleWithPlayerLevel = kamasScaleWithPlayerLevel;
    this.objectiveIds = objectiveIds;
    this.rewardIds = rewardIds;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getPoints() {
    return this.points;
  }
  public void setPoints(int points) {
    this.points = points;
  }
  public int getLevel() {
    return this.level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public double getKamasRatio() {
    return this.kamasRatio;
  }
  public void setKamasRatio(double kamasRatio) {
    this.kamasRatio = kamasRatio;
  }
  public double getExperienceRatio() {
    return this.experienceRatio;
  }
  public void setExperienceRatio(double experienceRatio) {
    this.experienceRatio = experienceRatio;
  }
  public boolean getKamasScaleWithPlayerLevel() {
    return this.kamasScaleWithPlayerLevel;
  }
  public void setKamasScaleWithPlayerLevel(boolean kamasScaleWithPlayerLevel) {
    this.kamasScaleWithPlayerLevel = kamasScaleWithPlayerLevel;
  }
  public int[] getObjectiveIds() {
    return this.objectiveIds;
  }
  public void setObjectiveIds(int[] objectiveIds) {
    this.objectiveIds = objectiveIds;
  }
  public int[] getRewardIds() {
    return this.rewardIds;
  }
  public void setRewardIds(int[] rewardIds) {
    this.rewardIds = rewardIds;
  }
}
