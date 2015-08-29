package com.ankamagames.dofus.datacenter.monsters;


public class MonsterDrop
    implements java.io.Serializable {
  public int dropId;
  public int monsterId;
  public int objectId;
  public double percentDropForGrade1;
  public double percentDropForGrade2;
  public double percentDropForGrade3;
  public double percentDropForGrade4;
  public double percentDropForGrade5;
  public int count;
  public int findCeil;
  public boolean hasCriteria;
  public MonsterDrop() {
  }
  public MonsterDrop(int dropId, int monsterId, int objectId, double percentDropForGrade1, double percentDropForGrade2, double percentDropForGrade3, double percentDropForGrade4, double percentDropForGrade5, int count, int findCeil, boolean hasCriteria) {
    this.dropId = dropId;
    this.monsterId = monsterId;
    this.objectId = objectId;
    this.percentDropForGrade1 = percentDropForGrade1;
    this.percentDropForGrade2 = percentDropForGrade2;
    this.percentDropForGrade3 = percentDropForGrade3;
    this.percentDropForGrade4 = percentDropForGrade4;
    this.percentDropForGrade5 = percentDropForGrade5;
    this.count = count;
    this.findCeil = findCeil;
    this.hasCriteria = hasCriteria;
  }

  public int getDropId() {
    return this.dropId;
  }
  public void setDropId(int dropId) {
    this.dropId = dropId;
  }
  public int getMonsterId() {
    return this.monsterId;
  }
  public void setMonsterId(int monsterId) {
    this.monsterId = monsterId;
  }
  public int getObjectId() {
    return this.objectId;
  }
  public void setObjectId(int objectId) {
    this.objectId = objectId;
  }
  public double getPercentDropForGrade1() {
    return this.percentDropForGrade1;
  }
  public void setPercentDropForGrade1(double percentDropForGrade1) {
    this.percentDropForGrade1 = percentDropForGrade1;
  }
  public double getPercentDropForGrade2() {
    return this.percentDropForGrade2;
  }
  public void setPercentDropForGrade2(double percentDropForGrade2) {
    this.percentDropForGrade2 = percentDropForGrade2;
  }
  public double getPercentDropForGrade3() {
    return this.percentDropForGrade3;
  }
  public void setPercentDropForGrade3(double percentDropForGrade3) {
    this.percentDropForGrade3 = percentDropForGrade3;
  }
  public double getPercentDropForGrade4() {
    return this.percentDropForGrade4;
  }
  public void setPercentDropForGrade4(double percentDropForGrade4) {
    this.percentDropForGrade4 = percentDropForGrade4;
  }
  public double getPercentDropForGrade5() {
    return this.percentDropForGrade5;
  }
  public void setPercentDropForGrade5(double percentDropForGrade5) {
    this.percentDropForGrade5 = percentDropForGrade5;
  }
  public int getCount() {
    return this.count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public int getFindCeil() {
    return this.findCeil;
  }
  public void setFindCeil(int findCeil) {
    this.findCeil = findCeil;
  }
  public boolean getHasCriteria() {
    return this.hasCriteria;
  }
  public void setHasCriteria(boolean hasCriteria) {
    this.hasCriteria = hasCriteria;
  }
}
