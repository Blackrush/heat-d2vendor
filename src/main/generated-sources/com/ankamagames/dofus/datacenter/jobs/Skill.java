package com.ankamagames.dofus.datacenter.jobs;


public class Skill
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int parentJobId;
  public boolean isForgemagus;
  public int modifiableItemType;
  public int gatheredRessourceItem;
  public int[] craftableItemIds;
  public int interactiveId;
  public String useAnimation;
  public boolean isRepair;
  public int cursor;
  public boolean availableInHouse;
  public int levelMin;
  public Skill() {
  }
  public Skill(int id, long nameId, int parentJobId, boolean isForgemagus, int modifiableItemType, int gatheredRessourceItem, int[] craftableItemIds, int interactiveId, String useAnimation, boolean isRepair, int cursor, boolean availableInHouse, int levelMin) {
    this.id = id;
    this.nameId = nameId;
    this.parentJobId = parentJobId;
    this.isForgemagus = isForgemagus;
    this.modifiableItemType = modifiableItemType;
    this.gatheredRessourceItem = gatheredRessourceItem;
    this.craftableItemIds = craftableItemIds;
    this.interactiveId = interactiveId;
    this.useAnimation = useAnimation;
    this.isRepair = isRepair;
    this.cursor = cursor;
    this.availableInHouse = availableInHouse;
    this.levelMin = levelMin;
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
  public int getParentJobId() {
    return this.parentJobId;
  }
  public void setParentJobId(int parentJobId) {
    this.parentJobId = parentJobId;
  }
  public boolean getIsForgemagus() {
    return this.isForgemagus;
  }
  public void setIsForgemagus(boolean isForgemagus) {
    this.isForgemagus = isForgemagus;
  }
  public int getModifiableItemType() {
    return this.modifiableItemType;
  }
  public void setModifiableItemType(int modifiableItemType) {
    this.modifiableItemType = modifiableItemType;
  }
  public int getGatheredRessourceItem() {
    return this.gatheredRessourceItem;
  }
  public void setGatheredRessourceItem(int gatheredRessourceItem) {
    this.gatheredRessourceItem = gatheredRessourceItem;
  }
  public int[] getCraftableItemIds() {
    return this.craftableItemIds;
  }
  public void setCraftableItemIds(int[] craftableItemIds) {
    this.craftableItemIds = craftableItemIds;
  }
  public int getInteractiveId() {
    return this.interactiveId;
  }
  public void setInteractiveId(int interactiveId) {
    this.interactiveId = interactiveId;
  }
  public String getUseAnimation() {
    return this.useAnimation;
  }
  public void setUseAnimation(String useAnimation) {
    this.useAnimation = useAnimation;
  }
  public boolean getIsRepair() {
    return this.isRepair;
  }
  public void setIsRepair(boolean isRepair) {
    this.isRepair = isRepair;
  }
  public int getCursor() {
    return this.cursor;
  }
  public void setCursor(int cursor) {
    this.cursor = cursor;
  }
  public boolean getAvailableInHouse() {
    return this.availableInHouse;
  }
  public void setAvailableInHouse(boolean availableInHouse) {
    this.availableInHouse = availableInHouse;
  }
  public int getLevelMin() {
    return this.levelMin;
  }
  public void setLevelMin(int levelMin) {
    this.levelMin = levelMin;
  }
}
