package com.ankamagames.dofus.datacenter.appearance;

import com.ankamagames.tiphon.types.TransformData;

public class SkinPosition
    implements java.io.Serializable {
  public int id;
  public TransformData[] transformation;
  public String[] clip;
  public long[] skin;
  public SkinPosition() {
  }
  public SkinPosition(int id, TransformData[] transformation, String[] clip, long[] skin) {
    this.id = id;
    this.transformation = transformation;
    this.clip = clip;
    this.skin = skin;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public TransformData[] getTransformation() {
    return this.transformation;
  }
  public void setTransformation(TransformData[] transformation) {
    this.transformation = transformation;
  }
  public String[] getClip() {
    return this.clip;
  }
  public void setClip(String[] clip) {
    this.clip = clip;
  }
  public long[] getSkin() {
    return this.skin;
  }
  public void setSkin(long[] skin) {
    this.skin = skin;
  }
}
