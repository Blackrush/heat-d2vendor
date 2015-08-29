package com.ankamagames.dofus.datacenter.notifications;


public class Notification
    implements java.io.Serializable {
  public int id;
  public long titleId;
  public long messageId;
  public int iconId;
  public int typeId;
  public String trigger;
  public Notification() {
  }
  public Notification(int id, long titleId, long messageId, int iconId, int typeId, String trigger) {
    this.id = id;
    this.titleId = titleId;
    this.messageId = messageId;
    this.iconId = iconId;
    this.typeId = typeId;
    this.trigger = trigger;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getTitleId() {
    return this.titleId;
  }
  public void setTitleId(long titleId) {
    this.titleId = titleId;
  }
  public long getMessageId() {
    return this.messageId;
  }
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public String getTrigger() {
    return this.trigger;
  }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }
}
