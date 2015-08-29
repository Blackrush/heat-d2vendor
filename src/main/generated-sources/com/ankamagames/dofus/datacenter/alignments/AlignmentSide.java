package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentSide
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public boolean canConquest;
  public AlignmentSide() {
  }
  public AlignmentSide(int id, long nameId, boolean canConquest) {
    this.id = id;
    this.nameId = nameId;
    this.canConquest = canConquest;
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
  public boolean getCanConquest() {
    return this.canConquest;
  }
  public void setCanConquest(boolean canConquest) {
    this.canConquest = canConquest;
  }
}
