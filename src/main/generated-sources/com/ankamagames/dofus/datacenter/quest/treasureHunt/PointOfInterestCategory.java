package com.ankamagames.dofus.datacenter.quest.treasureHunt;


public class PointOfInterestCategory
    implements java.io.Serializable {
  public int id;
  public long actionLabelId;
  public PointOfInterestCategory() {
  }
  public PointOfInterestCategory(int id, long actionLabelId) {
    this.id = id;
    this.actionLabelId = actionLabelId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getActionLabelId() {
    return this.actionLabelId;
  }
  public void setActionLabelId(long actionLabelId) {
    this.actionLabelId = actionLabelId;
  }
}
