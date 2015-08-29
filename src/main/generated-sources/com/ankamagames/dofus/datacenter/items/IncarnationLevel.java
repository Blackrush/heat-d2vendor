package com.ankamagames.dofus.datacenter.items;


public class IncarnationLevel
    implements java.io.Serializable {
  public int id;
  public int incarnationId;
  public int level;
  public int requiredXp;
  public IncarnationLevel() {
  }
  public IncarnationLevel(int id, int incarnationId, int level, int requiredXp) {
    this.id = id;
    this.incarnationId = incarnationId;
    this.level = level;
    this.requiredXp = requiredXp;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getIncarnationId() {
    return this.incarnationId;
  }
  public void setIncarnationId(int incarnationId) {
    this.incarnationId = incarnationId;
  }
  public int getLevel() {
    return this.level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public int getRequiredXp() {
    return this.requiredXp;
  }
  public void setRequiredXp(int requiredXp) {
    this.requiredXp = requiredXp;
  }
}
