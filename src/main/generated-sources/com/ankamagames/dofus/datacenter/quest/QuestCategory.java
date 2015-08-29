package com.ankamagames.dofus.datacenter.quest;


public class QuestCategory
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int order;
  public long[] questIds;
  public QuestCategory() {
  }
  public QuestCategory(int id, long nameId, int order, long[] questIds) {
    this.id = id;
    this.nameId = nameId;
    this.order = order;
    this.questIds = questIds;
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
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public long[] getQuestIds() {
    return this.questIds;
  }
  public void setQuestIds(long[] questIds) {
    this.questIds = questIds;
  }
}
