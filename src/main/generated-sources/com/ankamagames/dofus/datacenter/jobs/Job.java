package com.ankamagames.dofus.datacenter.jobs;


public class Job
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int specializationOfId;
  public int iconId;
  public int[] toolIds;
  public Job() {
  }
  public Job(int id, long nameId, int specializationOfId, int iconId, int[] toolIds) {
    this.id = id;
    this.nameId = nameId;
    this.specializationOfId = specializationOfId;
    this.iconId = iconId;
    this.toolIds = toolIds;
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
  public int getSpecializationOfId() {
    return this.specializationOfId;
  }
  public void setSpecializationOfId(int specializationOfId) {
    this.specializationOfId = specializationOfId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int[] getToolIds() {
    return this.toolIds;
  }
  public void setToolIds(int[] toolIds) {
    this.toolIds = toolIds;
  }
}
