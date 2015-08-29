package com.ankamagames.dofus.datacenter.appearance;


public class CreatureBoneType
    implements java.io.Serializable {
  public int id;
  public int creatureBoneId;
  public CreatureBoneType() {
  }
  public CreatureBoneType(int id, int creatureBoneId) {
    this.id = id;
    this.creatureBoneId = creatureBoneId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCreatureBoneId() {
    return this.creatureBoneId;
  }
  public void setCreatureBoneId(int creatureBoneId) {
    this.creatureBoneId = creatureBoneId;
  }
}
