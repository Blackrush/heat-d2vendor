package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentRank
    implements java.io.Serializable {
  public int id;
  public int orderId;
  public long nameId;
  public long descriptionId;
  public int minimumAlignment;
  public int objectsStolen;
  public int[] gifts;
  public AlignmentRank() {
  }
  public AlignmentRank(int id, int orderId, long nameId, long descriptionId, int minimumAlignment, int objectsStolen, int[] gifts) {
    this.id = id;
    this.orderId = orderId;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.minimumAlignment = minimumAlignment;
    this.objectsStolen = objectsStolen;
    this.gifts = gifts;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getOrderId() {
    return this.orderId;
  }
  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getMinimumAlignment() {
    return this.minimumAlignment;
  }
  public void setMinimumAlignment(int minimumAlignment) {
    this.minimumAlignment = minimumAlignment;
  }
  public int getObjectsStolen() {
    return this.objectsStolen;
  }
  public void setObjectsStolen(int objectsStolen) {
    this.objectsStolen = objectsStolen;
  }
  public int[] getGifts() {
    return this.gifts;
  }
  public void setGifts(int[] gifts) {
    this.gifts = gifts;
  }
}
