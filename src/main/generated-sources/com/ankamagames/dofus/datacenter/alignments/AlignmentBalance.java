package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentBalance
    implements java.io.Serializable {
  public int id;
  public int startValue;
  public int endValue;
  public long nameId;
  public long descriptionId;
  public AlignmentBalance() {
  }
  public AlignmentBalance(int id, int startValue, int endValue, long nameId, long descriptionId) {
    this.id = id;
    this.startValue = startValue;
    this.endValue = endValue;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getStartValue() {
    return this.startValue;
  }
  public void setStartValue(int startValue) {
    this.startValue = startValue;
  }
  public int getEndValue() {
    return this.endValue;
  }
  public void setEndValue(int endValue) {
    this.endValue = endValue;
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
}
