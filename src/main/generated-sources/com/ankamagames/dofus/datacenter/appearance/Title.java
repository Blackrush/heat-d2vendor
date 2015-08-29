package com.ankamagames.dofus.datacenter.appearance;


public class Title
    implements java.io.Serializable {
  public int id;
  public long nameMaleId;
  public long nameFemaleId;
  public boolean visible;
  public int categoryId;
  public Title() {
  }
  public Title(int id, long nameMaleId, long nameFemaleId, boolean visible, int categoryId) {
    this.id = id;
    this.nameMaleId = nameMaleId;
    this.nameFemaleId = nameFemaleId;
    this.visible = visible;
    this.categoryId = categoryId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getNameMaleId() {
    return this.nameMaleId;
  }
  public void setNameMaleId(long nameMaleId) {
    this.nameMaleId = nameMaleId;
  }
  public long getNameFemaleId() {
    return this.nameFemaleId;
  }
  public void setNameFemaleId(long nameFemaleId) {
    this.nameFemaleId = nameFemaleId;
  }
  public boolean getVisible() {
    return this.visible;
  }
  public void setVisible(boolean visible) {
    this.visible = visible;
  }
  public int getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
}
