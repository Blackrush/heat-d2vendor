package com.ankamagames.dofus.datacenter.effects;


public class EffectInstance
    implements java.io.Serializable {
  public int effectUid;
  public int effectId;
  public int targetId;
  public String targetMask;
  public int duration;
  public int random;
  public int group;
  public boolean hidden;
  public String rawZone;
  public int delay;
  public String triggers;
  public int order;
  public EffectInstance() {
  }
  public EffectInstance(int effectUid, int effectId, int targetId, String targetMask, int duration, int random, int group, boolean hidden, String rawZone, int delay, String triggers, int order) {
    this.effectUid = effectUid;
    this.effectId = effectId;
    this.targetId = targetId;
    this.targetMask = targetMask;
    this.duration = duration;
    this.random = random;
    this.group = group;
    this.hidden = hidden;
    this.rawZone = rawZone;
    this.delay = delay;
    this.triggers = triggers;
    this.order = order;
  }

  public int getEffectUid() {
    return this.effectUid;
  }
  public void setEffectUid(int effectUid) {
    this.effectUid = effectUid;
  }
  public int getEffectId() {
    return this.effectId;
  }
  public void setEffectId(int effectId) {
    this.effectId = effectId;
  }
  public int getTargetId() {
    return this.targetId;
  }
  public void setTargetId(int targetId) {
    this.targetId = targetId;
  }
  public String getTargetMask() {
    return this.targetMask;
  }
  public void setTargetMask(String targetMask) {
    this.targetMask = targetMask;
  }
  public int getDuration() {
    return this.duration;
  }
  public void setDuration(int duration) {
    this.duration = duration;
  }
  public int getRandom() {
    return this.random;
  }
  public void setRandom(int random) {
    this.random = random;
  }
  public int getGroup() {
    return this.group;
  }
  public void setGroup(int group) {
    this.group = group;
  }
  public boolean getHidden() {
    return this.hidden;
  }
  public void setHidden(boolean hidden) {
    this.hidden = hidden;
  }
  public String getRawZone() {
    return this.rawZone;
  }
  public void setRawZone(String rawZone) {
    this.rawZone = rawZone;
  }
  public int getDelay() {
    return this.delay;
  }
  public void setDelay(int delay) {
    this.delay = delay;
  }
  public String getTriggers() {
    return this.triggers;
  }
  public void setTriggers(String triggers) {
    this.triggers = triggers;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
}
