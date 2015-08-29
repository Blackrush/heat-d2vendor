package com.ankamagames.dofus.datacenter.interactives;


public class Interactive
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int actionId;
  public boolean displayTooltip;
  public Interactive() {
  }
  public Interactive(int id, long nameId, int actionId, boolean displayTooltip) {
    this.id = id;
    this.nameId = nameId;
    this.actionId = actionId;
    this.displayTooltip = displayTooltip;
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
  public int getActionId() {
    return this.actionId;
  }
  public void setActionId(int actionId) {
    this.actionId = actionId;
  }
  public boolean getDisplayTooltip() {
    return this.displayTooltip;
  }
  public void setDisplayTooltip(boolean displayTooltip) {
    this.displayTooltip = displayTooltip;
  }
}
