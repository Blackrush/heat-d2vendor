package com.ankamagames.dofus.datacenter.misc;


public class Pack
    implements java.io.Serializable {
  public int id;
  public String name;
  public boolean hasSubAreas;
  public Pack() {
  }
  public Pack(int id, String name, boolean hasSubAreas) {
    this.id = id;
    this.name = name;
    this.hasSubAreas = hasSubAreas;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public boolean getHasSubAreas() {
    return this.hasSubAreas;
  }
  public void setHasSubAreas(boolean hasSubAreas) {
    this.hasSubAreas = hasSubAreas;
  }
}
