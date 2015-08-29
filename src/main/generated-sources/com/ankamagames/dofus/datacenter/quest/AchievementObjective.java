package com.ankamagames.dofus.datacenter.quest;


public class AchievementObjective
    implements java.io.Serializable {
  public int id;
  public int achievementId;
  public long nameId;
  public String criterion;
  public AchievementObjective() {
  }
  public AchievementObjective(int id, int achievementId, long nameId, String criterion) {
    this.id = id;
    this.achievementId = achievementId;
    this.nameId = nameId;
    this.criterion = criterion;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getAchievementId() {
    return this.achievementId;
  }
  public void setAchievementId(int achievementId) {
    this.achievementId = achievementId;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public String getCriterion() {
    return this.criterion;
  }
  public void setCriterion(String criterion) {
    this.criterion = criterion;
  }
}
