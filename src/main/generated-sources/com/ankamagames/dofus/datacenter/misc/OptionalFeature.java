package com.ankamagames.dofus.datacenter.misc;


public class OptionalFeature
    implements java.io.Serializable {
  public int id;
  public String keyword;
  public OptionalFeature() {
  }
  public OptionalFeature(int id, String keyword) {
    this.id = id;
    this.keyword = keyword;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
}
