package com.ankamagames.dofus.datacenter.npcs;


public class TaxCollectorFirstname
    implements java.io.Serializable {
  public int id;
  public long firstnameId;
  public TaxCollectorFirstname() {
  }
  public TaxCollectorFirstname(int id, long firstnameId) {
    this.id = id;
    this.firstnameId = firstnameId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getFirstnameId() {
    return this.firstnameId;
  }
  public void setFirstnameId(long firstnameId) {
    this.firstnameId = firstnameId;
  }
}
