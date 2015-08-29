package com.ankamagames.dofus.datacenter.guild;


public class RankName
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int order;
  public RankName() {
  }
  public RankName(int id, long nameId, int order) {
    this.id = id;
    this.nameId = nameId;
    this.order = order;
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
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
