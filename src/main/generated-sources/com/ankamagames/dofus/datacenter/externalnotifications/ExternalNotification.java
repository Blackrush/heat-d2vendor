package com.ankamagames.dofus.datacenter.externalnotifications;


public class ExternalNotification
    implements java.io.Serializable {
  public int id;
  public int categoryId;
  public int iconId;
  public int colorId;
  public long descriptionId;
  public boolean defaultEnable;
  public boolean defaultSound;
  public boolean defaultMultiAccount;
  public boolean defaultNotify;
  public String name;
  public long messageId;
  public ExternalNotification() {
  }
  public ExternalNotification(int id, int categoryId, int iconId, int colorId, long descriptionId, boolean defaultEnable, boolean defaultSound, boolean defaultMultiAccount, boolean defaultNotify, String name, long messageId) {
    this.id = id;
    this.categoryId = categoryId;
    this.iconId = iconId;
    this.colorId = colorId;
    this.descriptionId = descriptionId;
    this.defaultEnable = defaultEnable;
    this.defaultSound = defaultSound;
    this.defaultMultiAccount = defaultMultiAccount;
    this.defaultNotify = defaultNotify;
    this.name = name;
    this.messageId = messageId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getColorId() {
    return this.colorId;
  }
  public void setColorId(int colorId) {
    this.colorId = colorId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public boolean getDefaultEnable() {
    return this.defaultEnable;
  }
  public void setDefaultEnable(boolean defaultEnable) {
    this.defaultEnable = defaultEnable;
  }
  public boolean getDefaultSound() {
    return this.defaultSound;
  }
  public void setDefaultSound(boolean defaultSound) {
    this.defaultSound = defaultSound;
  }
  public boolean getDefaultMultiAccount() {
    return this.defaultMultiAccount;
  }
  public void setDefaultMultiAccount(boolean defaultMultiAccount) {
    this.defaultMultiAccount = defaultMultiAccount;
  }
  public boolean getDefaultNotify() {
    return this.defaultNotify;
  }
  public void setDefaultNotify(boolean defaultNotify) {
    this.defaultNotify = defaultNotify;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getMessageId() {
    return this.messageId;
  }
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }
}
