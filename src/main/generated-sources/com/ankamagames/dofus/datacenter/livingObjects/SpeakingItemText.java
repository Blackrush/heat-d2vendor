package com.ankamagames.dofus.datacenter.livingObjects;


public class SpeakingItemText
    implements java.io.Serializable {
  public int textId;
  public double textProba;
  public long textStringId;
  public int textLevel;
  public int textSound;
  public String textRestriction;
  public SpeakingItemText() {
  }
  public SpeakingItemText(int textId, double textProba, long textStringId, int textLevel, int textSound, String textRestriction) {
    this.textId = textId;
    this.textProba = textProba;
    this.textStringId = textStringId;
    this.textLevel = textLevel;
    this.textSound = textSound;
    this.textRestriction = textRestriction;
  }

  public int getTextId() {
    return this.textId;
  }
  public void setTextId(int textId) {
    this.textId = textId;
  }
  public double getTextProba() {
    return this.textProba;
  }
  public void setTextProba(double textProba) {
    this.textProba = textProba;
  }
  public long getTextStringId() {
    return this.textStringId;
  }
  public void setTextStringId(long textStringId) {
    this.textStringId = textStringId;
  }
  public int getTextLevel() {
    return this.textLevel;
  }
  public void setTextLevel(int textLevel) {
    this.textLevel = textLevel;
  }
  public int getTextSound() {
    return this.textSound;
  }
  public void setTextSound(int textSound) {
    this.textSound = textSound;
  }
  public String getTextRestriction() {
    return this.textRestriction;
  }
  public void setTextRestriction(String textRestriction) {
    this.textRestriction = textRestriction;
  }
}
