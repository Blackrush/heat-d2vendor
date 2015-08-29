package com.ankamagames.dofus.datacenter.guild;


public class EmblemSymbol
    implements java.io.Serializable {
  public int id;
  public int skinId;
  public int iconId;
  public int order;
  public int categoryId;
  public boolean colorizable;
  public EmblemSymbol() {
  }
  public EmblemSymbol(int id, int skinId, int iconId, int order, int categoryId, boolean colorizable) {
    this.id = id;
    this.skinId = skinId;
    this.iconId = iconId;
    this.order = order;
    this.categoryId = categoryId;
    this.colorizable = colorizable;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getSkinId() {
    return this.skinId;
  }
  public void setSkinId(int skinId) {
    this.skinId = skinId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public boolean getColorizable() {
    return this.colorizable;
  }
  public void setColorizable(boolean colorizable) {
    this.colorizable = colorizable;
  }
}
