package com.ankamagames.dofus.datacenter.monsters;


public class MonsterGrade
    implements java.io.Serializable {
  public int grade;
  public int monsterId;
  public int level;
  public int lifePoints;
  public int actionPoints;
  public int movementPoints;
  public int paDodge;
  public int pmDodge;
  public int wisdom;
  public int earthResistance;
  public int airResistance;
  public int fireResistance;
  public int waterResistance;
  public int neutralResistance;
  public int gradeXp;
  public MonsterGrade() {
  }
  public MonsterGrade(int grade, int monsterId, int level, int lifePoints, int actionPoints, int movementPoints, int paDodge, int pmDodge, int wisdom, int earthResistance, int airResistance, int fireResistance, int waterResistance, int neutralResistance, int gradeXp) {
    this.grade = grade;
    this.monsterId = monsterId;
    this.level = level;
    this.lifePoints = lifePoints;
    this.actionPoints = actionPoints;
    this.movementPoints = movementPoints;
    this.paDodge = paDodge;
    this.pmDodge = pmDodge;
    this.wisdom = wisdom;
    this.earthResistance = earthResistance;
    this.airResistance = airResistance;
    this.fireResistance = fireResistance;
    this.waterResistance = waterResistance;
    this.neutralResistance = neutralResistance;
    this.gradeXp = gradeXp;
  }

  public int getGrade() {
    return this.grade;
  }
  public void setGrade(int grade) {
    this.grade = grade;
  }
  public int getMonsterId() {
    return this.monsterId;
  }
  public void setMonsterId(int monsterId) {
    this.monsterId = monsterId;
  }
  public int getLevel() {
    return this.level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public int getLifePoints() {
    return this.lifePoints;
  }
  public void setLifePoints(int lifePoints) {
    this.lifePoints = lifePoints;
  }
  public int getActionPoints() {
    return this.actionPoints;
  }
  public void setActionPoints(int actionPoints) {
    this.actionPoints = actionPoints;
  }
  public int getMovementPoints() {
    return this.movementPoints;
  }
  public void setMovementPoints(int movementPoints) {
    this.movementPoints = movementPoints;
  }
  public int getPaDodge() {
    return this.paDodge;
  }
  public void setPaDodge(int paDodge) {
    this.paDodge = paDodge;
  }
  public int getPmDodge() {
    return this.pmDodge;
  }
  public void setPmDodge(int pmDodge) {
    this.pmDodge = pmDodge;
  }
  public int getWisdom() {
    return this.wisdom;
  }
  public void setWisdom(int wisdom) {
    this.wisdom = wisdom;
  }
  public int getEarthResistance() {
    return this.earthResistance;
  }
  public void setEarthResistance(int earthResistance) {
    this.earthResistance = earthResistance;
  }
  public int getAirResistance() {
    return this.airResistance;
  }
  public void setAirResistance(int airResistance) {
    this.airResistance = airResistance;
  }
  public int getFireResistance() {
    return this.fireResistance;
  }
  public void setFireResistance(int fireResistance) {
    this.fireResistance = fireResistance;
  }
  public int getWaterResistance() {
    return this.waterResistance;
  }
  public void setWaterResistance(int waterResistance) {
    this.waterResistance = waterResistance;
  }
  public int getNeutralResistance() {
    return this.neutralResistance;
  }
  public void setNeutralResistance(int neutralResistance) {
    this.neutralResistance = neutralResistance;
  }
  public int getGradeXp() {
    return this.gradeXp;
  }
  public void setGradeXp(int gradeXp) {
    this.gradeXp = gradeXp;
  }
}
