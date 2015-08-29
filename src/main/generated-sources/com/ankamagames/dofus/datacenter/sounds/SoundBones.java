package com.ankamagames.dofus.datacenter.sounds;

import com.ankamagames.dofus.datacenter.sounds.SoundAnimation;

public class SoundBones
    implements java.io.Serializable {
  public int id;
  public String[] keys;
  public SoundAnimation[][] values;
  public SoundBones() {
  }
  public SoundBones(int id, String[] keys, SoundAnimation[][] values) {
    this.id = id;
    this.keys = keys;
    this.values = values;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String[] getKeys() {
    return this.keys;
  }
  public void setKeys(String[] keys) {
    this.keys = keys;
  }
  public SoundAnimation[][] getValues() {
    return this.values;
  }
  public void setValues(SoundAnimation[][] values) {
    this.values = values;
  }
}
