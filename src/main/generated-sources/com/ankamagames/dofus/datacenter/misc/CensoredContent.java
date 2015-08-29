package com.ankamagames.dofus.datacenter.misc;


public class CensoredContent
    implements java.io.Serializable {
  public String lang;
  public int type;
  public int oldValue;
  public int newValue;
  public CensoredContent() {
  }
  public CensoredContent(String lang, int type, int oldValue, int newValue) {
    this.lang = lang;
    this.type = type;
    this.oldValue = oldValue;
    this.newValue = newValue;
  }

  public String getLang() {
    return this.lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }
  public int getType() {
    return this.type;
  }
  public void setType(int type) {
    this.type = type;
  }
  public int getOldValue() {
    return this.oldValue;
  }
  public void setOldValue(int oldValue) {
    this.oldValue = oldValue;
  }
  public int getNewValue() {
    return this.newValue;
  }
  public void setNewValue(int newValue) {
    this.newValue = newValue;
  }
}
