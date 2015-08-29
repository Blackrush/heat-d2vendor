package com.ankamagames.dofus.datacenter.monsters;


public class CompanionCharacteristic
    implements java.io.Serializable {
  public int id;
  public int caracId;
  public int companionId;
  public int order;
  public int initialValue;
  public int levelPerValue;
  public int valuePerLevel;
  public CompanionCharacteristic() {
  }
  public CompanionCharacteristic(int id, int caracId, int companionId, int order, int initialValue, int levelPerValue, int valuePerLevel) {
    this.id = id;
    this.caracId = caracId;
    this.companionId = companionId;
    this.order = order;
    this.initialValue = initialValue;
    this.levelPerValue = levelPerValue;
    this.valuePerLevel = valuePerLevel;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCaracId() {
    return this.caracId;
  }
  public void setCaracId(int caracId) {
    this.caracId = caracId;
  }
  public int getCompanionId() {
    return this.companionId;
  }
  public void setCompanionId(int companionId) {
    this.companionId = companionId;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public int getInitialValue() {
    return this.initialValue;
  }
  public void setInitialValue(int initialValue) {
    this.initialValue = initialValue;
  }
  public int getLevelPerValue() {
    return this.levelPerValue;
  }
  public void setLevelPerValue(int levelPerValue) {
    this.levelPerValue = levelPerValue;
  }
  public int getValuePerLevel() {
    return this.valuePerLevel;
  }
  public void setValuePerLevel(int valuePerLevel) {
    this.valuePerLevel = valuePerLevel;
  }
}

