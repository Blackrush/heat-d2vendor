package com.ankamagames.dofus.datacenter.characteristics;


public class CharacteristicCategory
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int order;
  public long[] characteristicIds;
  public CharacteristicCategory() {
  }
  public CharacteristicCategory(int id, long nameId, int order, long[] characteristicIds) {
    this.id = id;
    this.nameId = nameId;
    this.order = order;
    this.characteristicIds = characteristicIds;
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
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public long[] getCharacteristicIds() {
    return this.characteristicIds;
  }
  public void setCharacteristicIds(long[] characteristicIds) {
    this.characteristicIds = characteristicIds;
  }
}
