package com.ankamagames.dofus.datacenter.items;


public class VeteranReward
    implements java.io.Serializable {
  public int id;
  public long requiredSubDays;
  public long itemGID;
  public long itemQuantity;
  public VeteranReward() {
  }
  public VeteranReward(int id, long requiredSubDays, long itemGID, long itemQuantity) {
    this.id = id;
    this.requiredSubDays = requiredSubDays;
    this.itemGID = itemGID;
    this.itemQuantity = itemQuantity;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getRequiredSubDays() {
    return this.requiredSubDays;
  }
  public void setRequiredSubDays(long requiredSubDays) {
    this.requiredSubDays = requiredSubDays;
  }
  public long getItemGID() {
    return this.itemGID;
  }
  public void setItemGID(long itemGID) {
    this.itemGID = itemGID;
  }
  public long getItemQuantity() {
    return this.itemQuantity;
  }
  public void setItemQuantity(long itemQuantity) {
    this.itemQuantity = itemQuantity;
  }
}
