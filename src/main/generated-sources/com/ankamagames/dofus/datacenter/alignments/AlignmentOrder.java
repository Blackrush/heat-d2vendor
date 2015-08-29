package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentOrder
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int sideId;
  public AlignmentOrder() {
  }
  public AlignmentOrder(int id, long nameId, int sideId) {
    this.id = id;
    this.nameId = nameId;
    this.sideId = sideId;
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
  public int getSideId() {
    return this.sideId;
  }
  public void setSideId(int sideId) {
    this.sideId = sideId;
  }
}
