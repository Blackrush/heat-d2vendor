package com.ankamagames.dofus.datacenter.sounds;


public class SoundAnimation
    implements java.io.Serializable {
  public int id;
  public String label;
  public String name;
  public String filename;
  public int volume;
  public int rolloff;
  public int automationDuration;
  public int automationVolume;
  public int automationFadeIn;
  public int automationFadeOut;
  public boolean noCutSilence;
  public int startFrame;
  public SoundAnimation() {
  }
  public SoundAnimation(int id, String label, String name, String filename, int volume, int rolloff, int automationDuration, int automationVolume, int automationFadeIn, int automationFadeOut, boolean noCutSilence, int startFrame) {
    this.id = id;
    this.label = label;
    this.name = name;
    this.filename = filename;
    this.volume = volume;
    this.rolloff = rolloff;
    this.automationDuration = automationDuration;
    this.automationVolume = automationVolume;
    this.automationFadeIn = automationFadeIn;
    this.automationFadeOut = automationFadeOut;
    this.noCutSilence = noCutSilence;
    this.startFrame = startFrame;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getLabel() {
    return this.label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }
  public int getVolume() {
    return this.volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }
  public int getRolloff() {
    return this.rolloff;
  }
  public void setRolloff(int rolloff) {
    this.rolloff = rolloff;
  }
  public int getAutomationDuration() {
    return this.automationDuration;
  }
  public void setAutomationDuration(int automationDuration) {
    this.automationDuration = automationDuration;
  }
  public int getAutomationVolume() {
    return this.automationVolume;
  }
  public void setAutomationVolume(int automationVolume) {
    this.automationVolume = automationVolume;
  }
  public int getAutomationFadeIn() {
    return this.automationFadeIn;
  }
  public void setAutomationFadeIn(int automationFadeIn) {
    this.automationFadeIn = automationFadeIn;
  }
  public int getAutomationFadeOut() {
    return this.automationFadeOut;
  }
  public void setAutomationFadeOut(int automationFadeOut) {
    this.automationFadeOut = automationFadeOut;
  }
  public boolean getNoCutSilence() {
    return this.noCutSilence;
  }
  public void setNoCutSilence(boolean noCutSilence) {
    this.noCutSilence = noCutSilence;
  }
  public int getStartFrame() {
    return this.startFrame;
  }
  public void setStartFrame(int startFrame) {
    this.startFrame = startFrame;
  }
}
