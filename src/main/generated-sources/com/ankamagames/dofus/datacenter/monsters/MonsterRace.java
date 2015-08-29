package com.ankamagames.dofus.datacenter.monsters;


public class MonsterRace
    implements java.io.Serializable {
  public int id;
  public int superRaceId;
  public long nameId;
  public long[] monsters;
  public MonsterRace() {
  }
  public MonsterRace(int id, int superRaceId, long nameId, long[] monsters) {
    this.id = id;
    this.superRaceId = superRaceId;
    this.nameId = nameId;
    this.monsters = monsters;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getSuperRaceId() {
    return this.superRaceId;
  }
  public void setSuperRaceId(int superRaceId) {
    this.superRaceId = superRaceId;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public long[] getMonsters() {
    return this.monsters;
  }
  public void setMonsters(long[] monsters) {
    this.monsters = monsters;
  }
}
