package com.ankamagames.dofus.datacenter.world;

import com.ankamagames.dofus.datacenter.ambientSounds.AmbientSound;
import flash.geom.Rectangle;

public class SubArea
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int areaId;
  public AmbientSound[] ambientSounds;
  public long[] mapIds;
  public Rectangle bounds;
  public int[] shape;
  public long[] customWorldMap;
  public long packId;
  public long level;
  public boolean isConquestVillage;
  public boolean basicAccountAllowed;
  public boolean displayOnWorldMap;
  public long[] monsters;
  public long[] entranceMapIds;
  public long[] exitMapIds;
  public boolean capturable;
  public SubArea() {
  }
  public SubArea(int id, long nameId, int areaId, AmbientSound[] ambientSounds, long[] mapIds, Rectangle bounds, int[] shape, long[] customWorldMap, long packId, long level, boolean isConquestVillage, boolean basicAccountAllowed, boolean displayOnWorldMap, long[] monsters, long[] entranceMapIds, long[] exitMapIds, boolean capturable) {
    this.id = id;
    this.nameId = nameId;
    this.areaId = areaId;
    this.ambientSounds = ambientSounds;
    this.mapIds = mapIds;
    this.bounds = bounds;
    this.shape = shape;
    this.customWorldMap = customWorldMap;
    this.packId = packId;
    this.level = level;
    this.isConquestVillage = isConquestVillage;
    this.basicAccountAllowed = basicAccountAllowed;
    this.displayOnWorldMap = displayOnWorldMap;
    this.monsters = monsters;
    this.entranceMapIds = entranceMapIds;
    this.exitMapIds = exitMapIds;
    this.capturable = capturable;
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
  public int getAreaId() {
    return this.areaId;
  }
  public void setAreaId(int areaId) {
    this.areaId = areaId;
  }
  public AmbientSound[] getAmbientSounds() {
    return this.ambientSounds;
  }
  public void setAmbientSounds(AmbientSound[] ambientSounds) {
    this.ambientSounds = ambientSounds;
  }
  public long[] getMapIds() {
    return this.mapIds;
  }
  public void setMapIds(long[] mapIds) {
    this.mapIds = mapIds;
  }
  public Rectangle getBounds() {
    return this.bounds;
  }
  public void setBounds(Rectangle bounds) {
    this.bounds = bounds;
  }
  public int[] getShape() {
    return this.shape;
  }
  public void setShape(int[] shape) {
    this.shape = shape;
  }
  public long[] getCustomWorldMap() {
    return this.customWorldMap;
  }
  public void setCustomWorldMap(long[] customWorldMap) {
    this.customWorldMap = customWorldMap;
  }
  public long getPackId() {
    return this.packId;
  }
  public void setPackId(long packId) {
    this.packId = packId;
  }
  public long getLevel() {
    return this.level;
  }
  public void setLevel(long level) {
    this.level = level;
  }
  public boolean getIsConquestVillage() {
    return this.isConquestVillage;
  }
  public void setIsConquestVillage(boolean isConquestVillage) {
    this.isConquestVillage = isConquestVillage;
  }
  public boolean getBasicAccountAllowed() {
    return this.basicAccountAllowed;
  }
  public void setBasicAccountAllowed(boolean basicAccountAllowed) {
    this.basicAccountAllowed = basicAccountAllowed;
  }
  public boolean getDisplayOnWorldMap() {
    return this.displayOnWorldMap;
  }
  public void setDisplayOnWorldMap(boolean displayOnWorldMap) {
    this.displayOnWorldMap = displayOnWorldMap;
  }
  public long[] getMonsters() {
    return this.monsters;
  }
  public void setMonsters(long[] monsters) {
    this.monsters = monsters;
  }
  public long[] getEntranceMapIds() {
    return this.entranceMapIds;
  }
  public void setEntranceMapIds(long[] entranceMapIds) {
    this.entranceMapIds = entranceMapIds;
  }
  public long[] getExitMapIds() {
    return this.exitMapIds;
  }
  public void setExitMapIds(long[] exitMapIds) {
    this.exitMapIds = exitMapIds;
  }
  public boolean getCapturable() {
    return this.capturable;
  }
  public void setCapturable(boolean capturable) {
    this.capturable = capturable;
  }
}
