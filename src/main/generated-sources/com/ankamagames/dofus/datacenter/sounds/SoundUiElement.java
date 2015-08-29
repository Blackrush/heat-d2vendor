package com.ankamagames.dofus.datacenter.sounds;


public class SoundUiElement
    implements java.io.Serializable {
  public int id;
  public String name;
  public int hookId;
  public String file;
  public SoundUiElement() {
  }
  public SoundUiElement(int id, String name, int hookId, String file) {
    this.id = id;
    this.name = name;
    this.hookId = hookId;
    this.file = file;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHookId() {
    return this.hookId;
  }
  public void setHookId(int hookId) {
    this.hookId = hookId;
  }
  public String getFile() {
    return this.file;
  }
  public void setFile(String file) {
    this.file = file;
  }
}
