package com.ankamagames.tiphon.types;


public class TransformData
    implements java.io.Serializable {
  public double x;
  public double y;
  public double scaleX;
  public double scaleY;
  public int rotation;
  public String originalClip;
  public String overrideClip;
  public TransformData() {
  }
  public TransformData(double x, double y, double scaleX, double scaleY, int rotation, String originalClip, String overrideClip) {
    this.x = x;
    this.y = y;
    this.scaleX = scaleX;
    this.scaleY = scaleY;
    this.rotation = rotation;
    this.originalClip = originalClip;
    this.overrideClip = overrideClip;
  }

  public double getX() {
    return this.x;
  }
  public void setX(double x) {
    this.x = x;
  }
  public double getY() {
    return this.y;
  }
  public void setY(double y) {
    this.y = y;
  }
  public double getScaleX() {
    return this.scaleX;
  }
  public void setScaleX(double scaleX) {
    this.scaleX = scaleX;
  }
  public double getScaleY() {
    return this.scaleY;
  }
  public void setScaleY(double scaleY) {
    this.scaleY = scaleY;
  }
  public int getRotation() {
    return this.rotation;
  }
  public void setRotation(int rotation) {
    this.rotation = rotation;
  }
  public String getOriginalClip() {
    return this.originalClip;
  }
  public void setOriginalClip(String originalClip) {
    this.originalClip = originalClip;
  }
  public String getOverrideClip() {
    return this.overrideClip;
  }
  public void setOverrideClip(String overrideClip) {
    this.overrideClip = overrideClip;
  }
}
