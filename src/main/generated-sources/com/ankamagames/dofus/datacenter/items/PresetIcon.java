package com.ankamagames.dofus.datacenter.items;


public class PresetIcon
    implements java.io.Serializable {
  public int id;
  public int order;
  public PresetIcon() {
  }
  public PresetIcon(int id, int order) {
    this.id = id;
    this.order = order;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
