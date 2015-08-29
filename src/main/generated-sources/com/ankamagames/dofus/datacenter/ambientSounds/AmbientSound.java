package com.ankamagames.dofus.datacenter.ambientSounds;


public class AmbientSound
    implements java.io.Serializable {
  public int id;
  public int volume;
  public int criterionId;
  public int silenceMin;
  public int silenceMax;
  public int channel;
  public int typeid;
  public AmbientSound() {
  }
  public AmbientSound(int id, int volume, int criterionId, int silenceMin, int silenceMax, int channel, int typeid) {
    this.id = id;
    this.volume = volume;
    this.criterionId = criterionId;
    this.silenceMin = silenceMin;
    this.silenceMax = silenceMax;
    this.channel = channel;
    this.typeid = typeid;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getVolume() {
    return this.volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }
  public int getCriterionId() {
    return this.criterionId;
  }
  public void setCriterionId(int criterionId) {
    this.criterionId = criterionId;
  }
  public int getSilenceMin() {
    return this.silenceMin;
  }
  public void setSilenceMin(int silenceMin) {
    this.silenceMin = silenceMin;
  }
  public int getSilenceMax() {
    return this.silenceMax;
  }
  public void setSilenceMax(int silenceMax) {
    this.silenceMax = silenceMax;
  }
  public int getChannel() {
    return this.channel;
  }
  public void setChannel(int channel) {
    this.channel = channel;
  }
  public int getTypeid() {
    return this.typeid;
  }
  public void setTypeid(int typeid) {
    this.typeid = typeid;
  }
}
