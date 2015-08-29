package com.ankamagames.dofus.datacenter.items;


public class Incarnation
    implements java.io.Serializable {
  public int id;
  public String lookMale;
  public String lookFemale;
  public Incarnation() {
  }
  public Incarnation(int id, String lookMale, String lookFemale) {
    this.id = id;
    this.lookMale = lookMale;
    this.lookFemale = lookFemale;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getLookMale() {
    return this.lookMale;
  }
  public void setLookMale(String lookMale) {
    this.lookMale = lookMale;
  }
  public String getLookFemale() {
    return this.lookFemale;
  }
  public void setLookFemale(String lookFemale) {
    this.lookFemale = lookFemale;
  }
}
