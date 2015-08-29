package com.ankamagames.dofus.datacenter.guild;


public class EmblemBackground
    implements java.io.Serializable {
  public int id;
  public int order;
  public EmblemBackground() {
  }
  public EmblemBackground(int id, int order) {
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
