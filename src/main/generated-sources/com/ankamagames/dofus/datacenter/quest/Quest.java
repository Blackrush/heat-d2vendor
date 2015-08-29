package com.ankamagames.dofus.datacenter.quest;


public class Quest
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int categoryId;
  public boolean isRepeatable;
  public int repeatType;
  public int repeatLimit;
  public boolean isDungeonQuest;
  public int levelMin;
  public int levelMax;
  public long[] stepIds;
  public boolean isPartyQuest;
  public Quest() {
  }
  public Quest(int id, long nameId, int categoryId, boolean isRepeatable, int repeatType, int repeatLimit, boolean isDungeonQuest, int levelMin, int levelMax, long[] stepIds, boolean isPartyQuest) {
    this.id = id;
    this.nameId = nameId;
    this.categoryId = categoryId;
    this.isRepeatable = isRepeatable;
    this.repeatType = repeatType;
    this.repeatLimit = repeatLimit;
    this.isDungeonQuest = isDungeonQuest;
    this.levelMin = levelMin;
    this.levelMax = levelMax;
    this.stepIds = stepIds;
    this.isPartyQuest = isPartyQuest;
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
  public boolean getIsRepeatable() {
    return this.isRepeatable;
  }
  public void setIsRepeatable(boolean isRepeatable) {
    this.isRepeatable = isRepeatable;
  }
  public int getRepeatType() {
    return this.repeatType;
  }
  public void setRepeatType(int repeatType) {
    this.repeatType = repeatType;
  }
  public int getRepeatLimit() {
    return this.repeatLimit;
  }
  public void setRepeatLimit(int repeatLimit) {
    this.repeatLimit = repeatLimit;
  }
  public boolean getIsDungeonQuest() {
    return this.isDungeonQuest;
  }
  public void setIsDungeonQuest(boolean isDungeonQuest) {
    this.isDungeonQuest = isDungeonQuest;
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
  public long[] getStepIds() {
    return this.stepIds;
  }
  public void setStepIds(long[] stepIds) {
    this.stepIds = stepIds;
  }
  public boolean getIsPartyQuest() {
    return this.isPartyQuest;
  }
  public void setIsPartyQuest(boolean isPartyQuest) {
    this.isPartyQuest = isPartyQuest;
  }
}
