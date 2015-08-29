package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentTitle
    implements java.io.Serializable {
  public int sideId;
  public long[] namesId;
  public long[] shortsId;
  public AlignmentTitle() {
  }
  public AlignmentTitle(int sideId, long[] namesId, long[] shortsId) {
    this.sideId = sideId;
    this.namesId = namesId;
    this.shortsId = shortsId;
  }

  public int getSideId() {
    return this.sideId;
  }
  public void setSideId(int sideId) {
    this.sideId = sideId;
  }
  public long[] getNamesId() {
    return this.namesId;
  }
  public void setNamesId(long[] namesId) {
    this.namesId = namesId;
  }
  public long[] getShortsId() {
    return this.shortsId;
  }
  public void setShortsId(long[] shortsId) {
    this.shortsId = shortsId;
  }
}
