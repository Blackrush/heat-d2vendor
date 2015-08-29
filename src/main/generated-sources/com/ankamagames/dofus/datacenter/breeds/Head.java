package com.ankamagames.dofus.datacenter.breeds;


public class Head
    implements java.io.Serializable {
  public int id;
  public String skins;
  public String assetId;
  public int breed;
  public int gender;
  public String label;
  public int order;
  public Head() {
  }
  public Head(int id, String skins, String assetId, int breed, int gender, String label, int order) {
    this.id = id;
    this.skins = skins;
    this.assetId = assetId;
    this.breed = breed;
    this.gender = gender;
    this.label = label;
    this.order = order;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getSkins() {
    return this.skins;
  }
  public void setSkins(String skins) {
    this.skins = skins;
  }
  public String getAssetId() {
    return this.assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }
  public int getBreed() {
    return this.breed;
  }
  public void setBreed(int breed) {
    this.breed = breed;
  }
  public int getGender() {
    return this.gender;
  }
  public void setGender(int gender) {
    this.gender = gender;
  }
  public String getLabel() {
    return this.label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
