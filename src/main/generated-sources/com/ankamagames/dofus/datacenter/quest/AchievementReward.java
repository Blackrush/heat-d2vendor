package com.ankamagames.dofus.datacenter.quest;


public class AchievementReward
    implements java.io.Serializable {
  public int id;
  public int achievementId;
  public int levelMin;
  public int levelMax;
  public long[] itemsReward;
  public long[] itemsQuantityReward;
  public long[] emotesReward;
  public long[] spellsReward;
  public long[] titlesReward;
  public long[] ornamentsReward;
  public AchievementReward() {
  }
  public AchievementReward(int id, int achievementId, int levelMin, int levelMax, long[] itemsReward, long[] itemsQuantityReward, long[] emotesReward, long[] spellsReward, long[] titlesReward, long[] ornamentsReward) {
    this.id = id;
    this.achievementId = achievementId;
    this.levelMin = levelMin;
    this.levelMax = levelMax;
    this.itemsReward = itemsReward;
    this.itemsQuantityReward = itemsQuantityReward;
    this.emotesReward = emotesReward;
    this.spellsReward = spellsReward;
    this.titlesReward = titlesReward;
    this.ornamentsReward = ornamentsReward;
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
  public long[] getItemsReward() {
    return this.itemsReward;
  }
  public void setItemsReward(long[] itemsReward) {
    this.itemsReward = itemsReward;
  }
  public long[] getItemsQuantityReward() {
    return this.itemsQuantityReward;
  }
  public void setItemsQuantityReward(long[] itemsQuantityReward) {
    this.itemsQuantityReward = itemsQuantityReward;
  }
  public long[] getEmotesReward() {
    return this.emotesReward;
  }
  public void setEmotesReward(long[] emotesReward) {
    this.emotesReward = emotesReward;
  }
  public long[] getSpellsReward() {
    return this.spellsReward;
  }
  public void setSpellsReward(long[] spellsReward) {
    this.spellsReward = spellsReward;
  }
  public long[] getTitlesReward() {
    return this.titlesReward;
  }
  public void setTitlesReward(long[] titlesReward) {
    this.titlesReward = titlesReward;
  }
  public long[] getOrnamentsReward() {
    return this.ornamentsReward;
  }
  public void setOrnamentsReward(long[] ornamentsReward) {
    this.ornamentsReward = ornamentsReward;
  }
}
