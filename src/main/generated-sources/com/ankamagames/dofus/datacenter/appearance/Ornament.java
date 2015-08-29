package com.ankamagames.dofus.datacenter.appearance;


public class Ornament
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public boolean visible;
  public int assetId;
  public int iconId;
  public int rarity;
  public int order;
  public Ornament() {
  }
  public Ornament(int id, long nameId, boolean visible, int assetId, int iconId, int rarity, int order) {
    this.id = id;
    this.nameId = nameId;
    this.visible = visible;
    this.assetId = assetId;
    this.iconId = iconId;
    this.rarity = rarity;
    this.order = order;
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
  public boolean getVisible() {
    return this.visible;
  }
  public void setVisible(boolean visible) {
    this.visible = visible;
  }
  public int getAssetId() {
    return this.assetId;
  }
  public void setAssetId(int assetId) {
    this.assetId = assetId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getRarity() {
    return this.rarity;
  }
  public void setRarity(int rarity) {
    this.rarity = rarity;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
