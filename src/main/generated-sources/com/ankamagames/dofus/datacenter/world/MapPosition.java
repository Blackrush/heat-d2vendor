package com.ankamagames.dofus.datacenter.world;

import com.ankamagames.dofus.datacenter.ambientSounds.AmbientSound;

public class MapPosition
    implements java.io.Serializable {
  public int id;
  public int posX;
  public int posY;
  public boolean outdoor;
  public int capabilities;
  public long nameId;
  public boolean showNameOnFingerpost;
  public AmbientSound[] sounds;
  public int subAreaId;
  public int worldMap;
  public boolean hasPriorityOnWorldmap;
  public MapPosition() {
  }
  public MapPosition(int id, int posX, int posY, boolean outdoor, int capabilities, long nameId, boolean showNameOnFingerpost, AmbientSound[] sounds, int subAreaId, int worldMap, boolean hasPriorityOnWorldmap) {
    this.id = id;
    this.posX = posX;
    this.posY = posY;
    this.outdoor = outdoor;
    this.capabilities = capabilities;
    this.nameId = nameId;
    this.showNameOnFingerpost = showNameOnFingerpost;
    this.sounds = sounds;
    this.subAreaId = subAreaId;
    this.worldMap = worldMap;
    this.hasPriorityOnWorldmap = hasPriorityOnWorldmap;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getPosX() {
    return this.posX;
  }
  public void setPosX(int posX) {
    this.posX = posX;
  }
  public int getPosY() {
    return this.posY;
  }
  public void setPosY(int posY) {
    this.posY = posY;
  }
  public boolean getOutdoor() {
    return this.outdoor;
  }
  public void setOutdoor(boolean outdoor) {
    this.outdoor = outdoor;
  }
  public int getCapabilities() {
    return this.capabilities;
  }
  public void setCapabilities(int capabilities) {
    this.capabilities = capabilities;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public boolean getShowNameOnFingerpost() {
    return this.showNameOnFingerpost;
  }
  public void setShowNameOnFingerpost(boolean showNameOnFingerpost) {
    this.showNameOnFingerpost = showNameOnFingerpost;
  }
  public AmbientSound[] getSounds() {
    return this.sounds;
  }
  public void setSounds(AmbientSound[] sounds) {
    this.sounds = sounds;
  }
  public int getSubAreaId() {
    return this.subAreaId;
  }
  public void setSubAreaId(int subAreaId) {
    this.subAreaId = subAreaId;
  }
  public int getWorldMap() {
    return this.worldMap;
  }
  public void setWorldMap(int worldMap) {
    this.worldMap = worldMap;
  }
  public boolean getHasPriorityOnWorldmap() {
    return this.hasPriorityOnWorldmap;
  }
  public void setHasPriorityOnWorldmap(boolean hasPriorityOnWorldmap) {
    this.hasPriorityOnWorldmap = hasPriorityOnWorldmap;
  }
}
