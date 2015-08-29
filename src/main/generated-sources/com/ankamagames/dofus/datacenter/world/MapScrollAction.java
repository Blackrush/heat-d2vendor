package com.ankamagames.dofus.datacenter.world;


public class MapScrollAction
    implements java.io.Serializable {
  public int id;
  public boolean rightExists;
  public boolean bottomExists;
  public boolean leftExists;
  public boolean topExists;
  public int rightMapId;
  public int bottomMapId;
  public int leftMapId;
  public int topMapId;
  public MapScrollAction() {
  }
  public MapScrollAction(int id, boolean rightExists, boolean bottomExists, boolean leftExists, boolean topExists, int rightMapId, int bottomMapId, int leftMapId, int topMapId) {
    this.id = id;
    this.rightExists = rightExists;
    this.bottomExists = bottomExists;
    this.leftExists = leftExists;
    this.topExists = topExists;
    this.rightMapId = rightMapId;
    this.bottomMapId = bottomMapId;
    this.leftMapId = leftMapId;
    this.topMapId = topMapId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public boolean getRightExists() {
    return this.rightExists;
  }
  public void setRightExists(boolean rightExists) {
    this.rightExists = rightExists;
  }
  public boolean getBottomExists() {
    return this.bottomExists;
  }
  public void setBottomExists(boolean bottomExists) {
    this.bottomExists = bottomExists;
  }
  public boolean getLeftExists() {
    return this.leftExists;
  }
  public void setLeftExists(boolean leftExists) {
    this.leftExists = leftExists;
  }
  public boolean getTopExists() {
    return this.topExists;
  }
  public void setTopExists(boolean topExists) {
    this.topExists = topExists;
  }
  public int getRightMapId() {
    return this.rightMapId;
  }
  public void setRightMapId(int rightMapId) {
    this.rightMapId = rightMapId;
  }
  public int getBottomMapId() {
    return this.bottomMapId;
  }
  public void setBottomMapId(int bottomMapId) {
    this.bottomMapId = bottomMapId;
  }
  public int getLeftMapId() {
    return this.leftMapId;
  }
  public void setLeftMapId(int leftMapId) {
    this.leftMapId = leftMapId;
  }
  public int getTopMapId() {
    return this.topMapId;
  }
  public void setTopMapId(int topMapId) {
    this.topMapId = topMapId;
  }
}
