package com.ankamagames.dofus.datacenter.characteristics;


public class Characteristic
    implements java.io.Serializable {
  public int id;
  public String keyword;
  public long nameId;
  public String asset;
  public int categoryId;
  public boolean visible;
  public int order;
  public boolean upgradable;
  public Characteristic() {
  }
  public Characteristic(int id, String keyword, long nameId, String asset, int categoryId, boolean visible, int order, boolean upgradable) {
    this.id = id;
    this.keyword = keyword;
    this.nameId = nameId;
    this.asset = asset;
    this.categoryId = categoryId;
    this.visible = visible;
    this.order = order;
    this.upgradable = upgradable;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public String getAsset() {
    return this.asset;
  }
  public void setAsset(String asset) {
    this.asset = asset;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public boolean getVisible() {
    return this.visible;
  }
  public void setVisible(boolean visible) {
    this.visible = visible;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public boolean getUpgradable() {
    return this.upgradable;
  }
  public void setUpgradable(boolean upgradable) {
    this.upgradable = upgradable;
  }
}
