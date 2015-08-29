package com.ankamagames.dofus.datacenter.quest;

import flash.geom.Point;

public class QuestObjective
    implements java.io.Serializable {
  public int id;
  public int stepId;
  public int typeId;
  public int dialogId;
  public long[] parameters;
  public Point coords;
  public int mapId;
  public QuestObjective() {
  }
  public QuestObjective(int id, int stepId, int typeId, int dialogId, long[] parameters, Point coords, int mapId) {
    this.id = id;
    this.stepId = stepId;
    this.typeId = typeId;
    this.dialogId = dialogId;
    this.parameters = parameters;
    this.coords = coords;
    this.mapId = mapId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getStepId() {
    return this.stepId;
  }
  public void setStepId(int stepId) {
    this.stepId = stepId;
  }
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public int getDialogId() {
    return this.dialogId;
  }
  public void setDialogId(int dialogId) {
    this.dialogId = dialogId;
  }
  public long[] getParameters() {
    return this.parameters;
  }
  public void setParameters(long[] parameters) {
    this.parameters = parameters;
  }
  public Point getCoords() {
    return this.coords;
  }
  public void setCoords(Point coords) {
    this.coords = coords;
  }
  public int getMapId() {
    return this.mapId;
  }
  public void setMapId(int mapId) {
    this.mapId = mapId;
  }
}
