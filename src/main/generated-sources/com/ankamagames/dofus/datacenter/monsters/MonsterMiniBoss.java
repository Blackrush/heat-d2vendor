package com.ankamagames.dofus.datacenter.monsters;


public class MonsterMiniBoss
    implements java.io.Serializable {
  public int id;
  public int monsterReplacingId;
  public MonsterMiniBoss() {
  }
  public MonsterMiniBoss(int id, int monsterReplacingId) {
    this.id = id;
    this.monsterReplacingId = monsterReplacingId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getMonsterReplacingId() {
    return this.monsterReplacingId;
  }
  public void setMonsterReplacingId(int monsterReplacingId) {
    this.monsterReplacingId = monsterReplacingId;
  }
}
