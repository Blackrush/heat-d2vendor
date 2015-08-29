package com.ankamagames.dofus.datacenter.quest;


public class AchievementCategory
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int parentId;
  public String icon;
  public int order;
  public String color;
  public long[] achievementIds;
  public AchievementCategory() {
  }
  public AchievementCategory(int id, long nameId, int parentId, String icon, int order, String color, long[] achievementIds) {
    this.id = id;
    this.nameId = nameId;
    this.parentId = parentId;
    this.icon = icon;
    this.order = order;
    this.color = color;
    this.achievementIds = achievementIds;
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
  public int getParentId() {
    return this.parentId;
  }
  public void setParentId(int parentId) {
    this.parentId = parentId;
  }
  public String getIcon() {
    return this.icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public String getColor() {
    return this.color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public long[] getAchievementIds() {
    return this.achievementIds;
  }
  public void setAchievementIds(long[] achievementIds) {
    this.achievementIds = achievementIds;
  }
}
