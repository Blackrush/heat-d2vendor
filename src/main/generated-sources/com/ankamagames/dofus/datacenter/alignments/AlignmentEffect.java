package com.ankamagames.dofus.datacenter.alignments;


public class AlignmentEffect
    implements java.io.Serializable {
  public int id;
  public int characteristicId;
  public long descriptionId;
  public AlignmentEffect() {
  }
  public AlignmentEffect(int id, int characteristicId, long descriptionId) {
    this.id = id;
    this.characteristicId = characteristicId;
    this.descriptionId = descriptionId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCharacteristicId() {
    return this.characteristicId;
  }
  public void setCharacteristicId(int characteristicId) {
    this.characteristicId = characteristicId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
}
