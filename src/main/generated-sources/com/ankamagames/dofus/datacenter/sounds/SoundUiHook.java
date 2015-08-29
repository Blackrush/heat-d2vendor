package com.ankamagames.dofus.datacenter.sounds;


public class SoundUiHook
    implements java.io.Serializable {
  public int id;
  public String name;
  public SoundUiHook() {
  }
  public SoundUiHook(int id, String name) {
    this.id = id;
    this.name = name;
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
}
