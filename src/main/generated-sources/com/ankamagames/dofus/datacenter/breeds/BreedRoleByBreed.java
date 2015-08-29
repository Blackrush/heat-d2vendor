package com.ankamagames.dofus.datacenter.breeds;


public class BreedRoleByBreed
    implements java.io.Serializable {
  public int breedId;
  public int roleId;
  public long descriptionId;
  public int value;
  public int order;
  public BreedRoleByBreed() {
  }
  public BreedRoleByBreed(int breedId, int roleId, long descriptionId, int value, int order) {
    this.breedId = breedId;
    this.roleId = roleId;
    this.descriptionId = descriptionId;
    this.value = value;
    this.order = order;
  }

  public int getBreedId() {
    return this.breedId;
  }
  public void setBreedId(int breedId) {
    this.breedId = breedId;
  }
  public int getRoleId() {
    return this.roleId;
  }
  public void setRoleId(int roleId) {
    this.roleId = roleId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getValue() {
    return this.value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
