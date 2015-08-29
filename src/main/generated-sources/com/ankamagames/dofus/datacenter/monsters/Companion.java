package com.ankamagames.dofus.datacenter.monsters;


public class Companion
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public String look;
  public boolean webDisplay;
  public long descriptionId;
  public int startingSpellLevelId;
  public int assetId;
  public long[] characteristics;
  public long[] spells;
  public int creatureBoneId;
  public Companion() {
  }
  public Companion(int id, long nameId, String look, boolean webDisplay, long descriptionId, int startingSpellLevelId, int assetId, long[] characteristics, long[] spells, int creatureBoneId) {
    this.id = id;
    this.nameId = nameId;
    this.look = look;
    this.webDisplay = webDisplay;
    this.descriptionId = descriptionId;
    this.startingSpellLevelId = startingSpellLevelId;
    this.assetId = assetId;
    this.characteristics = characteristics;
    this.spells = spells;
    this.creatureBoneId = creatureBoneId;
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
  public String getLook() {
    return this.look;
  }
  public void setLook(String look) {
    this.look = look;
  }
  public boolean getWebDisplay() {
    return this.webDisplay;
  }
  public void setWebDisplay(boolean webDisplay) {
    this.webDisplay = webDisplay;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getStartingSpellLevelId() {
    return this.startingSpellLevelId;
  }
  public void setStartingSpellLevelId(int startingSpellLevelId) {
    this.startingSpellLevelId = startingSpellLevelId;
  }
  public int getAssetId() {
    return this.assetId;
  }
  public void setAssetId(int assetId) {
    this.assetId = assetId;
  }
  public long[] getCharacteristics() {
    return this.characteristics;
  }
  public void setCharacteristics(long[] characteristics) {
    this.characteristics = characteristics;
  }
  public long[] getSpells() {
    return this.spells;
  }
  public void setSpells(long[] spells) {
    this.spells = spells;
  }
  public int getCreatureBoneId() {
    return this.creatureBoneId;
  }
  public void setCreatureBoneId(int creatureBoneId) {
    this.creatureBoneId = creatureBoneId;
  }
}
