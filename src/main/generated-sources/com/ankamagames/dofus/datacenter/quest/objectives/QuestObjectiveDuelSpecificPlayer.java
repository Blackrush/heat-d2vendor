package com.ankamagames.dofus.datacenter.quest.objectives;

import com.ankamagames.dofus.datacenter.quest.QuestObjective;
import flash.geom.Point;

public class QuestObjectiveDuelSpecificPlayer extends QuestObjective
    implements java.io.Serializable {
  public QuestObjectiveDuelSpecificPlayer() {
  }
  public QuestObjectiveDuelSpecificPlayer(int id, int mapId, Point coords, long[] parameters, int stepId, int dialogId, int typeId) {
    super(id, stepId, typeId, dialogId, parameters, coords, mapId);

  }

}
