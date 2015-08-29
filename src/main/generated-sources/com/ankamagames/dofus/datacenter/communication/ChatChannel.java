package com.ankamagames.dofus.datacenter.communication;


public class ChatChannel
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long descriptionId;
  public String shortcut;
  public String shortcutKey;
  public boolean isPrivate;
  public boolean allowObjects;
  public ChatChannel() {
  }
  public ChatChannel(int id, long nameId, long descriptionId, String shortcut, String shortcutKey, boolean isPrivate, boolean allowObjects) {
    this.id = id;
    this.nameId = nameId;
    this.descriptionId = descriptionId;
    this.shortcut = shortcut;
    this.shortcutKey = shortcutKey;
    this.isPrivate = isPrivate;
    this.allowObjects = allowObjects;
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
  public String getShortcut() {
    return this.shortcut;
  }
  public void setShortcut(String shortcut) {
    this.shortcut = shortcut;
  }
  public String getShortcutKey() {
    return this.shortcutKey;
  }
  public void setShortcutKey(String shortcutKey) {
    this.shortcutKey = shortcutKey;
  }
  public boolean getIsPrivate() {
    return this.isPrivate;
  }
  public void setIsPrivate(boolean isPrivate) {
    this.isPrivate = isPrivate;
  }
  public boolean getAllowObjects() {
    return this.allowObjects;
  }
  public void setAllowObjects(boolean allowObjects) {
    this.allowObjects = allowObjects;
  }
}
