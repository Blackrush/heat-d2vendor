package com.ankamagames.dofus.datacenter.documents;


public class Comic
    implements java.io.Serializable {
  public int id;
  public String remoteId;
  public Comic() {
  }
  public Comic(int id, String remoteId) {
    this.id = id;
    this.remoteId = remoteId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getRemoteId() {
    return this.remoteId;
  }
  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }
}
