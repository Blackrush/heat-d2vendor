package com.ankamagames.dofus.datacenter.servers;


public class ServerPopulation
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int weight;
  public ServerPopulation() {
  }
  public ServerPopulation(int id, long nameId, int weight) {
    this.id = id;
    this.nameId = nameId;
    this.weight = weight;
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
  public int getWeight() {
    return this.weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
}
