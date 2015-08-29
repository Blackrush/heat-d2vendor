package com.ankamagames.dofus.datacenter.monsters;


public class CompanionSpell
    implements java.io.Serializable {
  public int id;
  public int spellId;
  public int companionId;
  public String gradeByLevel;
  public CompanionSpell() {
  }
  public CompanionSpell(int id, int spellId, int companionId, String gradeByLevel) {
    this.id = id;
    this.spellId = spellId;
    this.companionId = companionId;
    this.gradeByLevel = gradeByLevel;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getSpellId() {
    return this.spellId;
  }
  public void setSpellId(int spellId) {
    this.spellId = spellId;
  }
  public int getCompanionId() {
    return this.companionId;
  }
  public void setCompanionId(int companionId) {
    this.companionId = companionId;
  }
  public String getGradeByLevel() {
    return this.gradeByLevel;
  }
  public void setGradeByLevel(String gradeByLevel) {
    this.gradeByLevel = gradeByLevel;
  }
}
