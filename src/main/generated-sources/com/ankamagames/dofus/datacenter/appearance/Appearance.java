package com.ankamagames.dofus.datacenter.appearance;


public class Appearance
    implements java.io.Serializable {
  public int id;
  public int type;
  public String data;
  public Appearance() {
  }
  public Appearance(int id, int type, String data) {
    this.id = id;
    this.type = type;
    this.data = data;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getType() {
    return this.type;
  }
  public void setType(int type) {
    this.type = type;
  }
  public String getData() {
    return this.data;
  }
  public void setData(String data) {
    this.data = data;
  }
}
