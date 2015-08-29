package com.ankamagames.dofus.datacenter.spells;


public class Spell
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descriptionId;
  public int typeId;
  public String scriptParams;
  public String scriptParamsCritical;
  public int scriptId;
  public int scriptIdCritical;
  public int iconId;
  public long[] spellLevels;
  public boolean verbosecast;
  public Spell() {
  }
  public Spell(int id, long nameId, long descriptionId, int typeId, String scriptParams, String scriptParamsCritical, int scriptId, int scriptIdCritical, int iconId, long[] spellLevels, boolean verbosecast) {
    this.id = id;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.typeId = typeId;
    this.scriptParams = scriptParams;
    this.scriptParamsCritical = scriptParamsCritical;
    this.scriptId = scriptId;
    this.scriptIdCritical = scriptIdCritical;
    this.iconId = iconId;
    this.spellLevels = spellLevels;
    this.verbosecast = verbosecast;
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
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public String getScriptParams() {
    return this.scriptParams;
  }
  public void setScriptParams(String scriptParams) {
    this.scriptParams = scriptParams;
  }
  public String getScriptParamsCritical() {
    return this.scriptParamsCritical;
  }
  public void setScriptParamsCritical(String scriptParamsCritical) {
    this.scriptParamsCritical = scriptParamsCritical;
  }
  public int getScriptId() {
    return this.scriptId;
  }
  public void setScriptId(int scriptId) {
    this.scriptId = scriptId;
  }
  public int getScriptIdCritical() {
    return this.scriptIdCritical;
  }
  public void setScriptIdCritical(int scriptIdCritical) {
    this.scriptIdCritical = scriptIdCritical;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public long[] getSpellLevels() {
    return this.spellLevels;
  }
  public void setSpellLevels(long[] spellLevels) {
    this.spellLevels = spellLevels;
  }
  public boolean getVerbosecast() {
    return this.verbosecast;
  }
  public void setVerbosecast(boolean verbosecast) {
    this.verbosecast = verbosecast;
  }
}
