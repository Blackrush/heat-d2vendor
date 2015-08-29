package com.ankamagames.dofus.datacenter.sounds;

import com.ankamagames.dofus.datacenter.sounds.SoundUi;

public class SoundUi
    implements java.io.Serializable {
  public int id;
  public String uiName;
  public String openFile;
  public String closeFile;
  public SoundUi[][] subElements;
  public SoundUi() {
  }
  public SoundUi(int id, String uiName, String openFile, String closeFile, SoundUi[][] subElements) {
    this.id = id;
    this.uiName = uiName;
    this.openFile = openFile;
    this.closeFile = closeFile;
    this.subElements = subElements;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getUiName() {
    return this.uiName;
  }
  public void setUiName(String uiName) {
    this.uiName = uiName;
  }
  public String getOpenFile() {
    return this.openFile;
  }
  public void setOpenFile(String openFile) {
    this.openFile = openFile;
  }
  public String getCloseFile() {
    return this.closeFile;
  }
  public void setCloseFile(String closeFile) {
    this.closeFile = closeFile;
  }
  public SoundUi[][] getSubElements() {
    return this.subElements;
  }
  public void setSubElements(SoundUi[][] subElements) {
    this.subElements = subElements;
  }
}
