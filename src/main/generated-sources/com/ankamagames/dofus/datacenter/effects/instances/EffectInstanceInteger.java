package com.ankamagames.dofus.datacenter.effects.instances;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;

public class EffectInstanceInteger extends EffectInstance
    implements java.io.Serializable {
  public int value;
  public EffectInstanceInteger() {
  }
  public EffectInstanceInteger(int random, String rawZone, int targetId, String targetMask, int effectId, int duration, int order, int effectUid, boolean hidden, int value, int delay, String triggers, int group) {
    super(effectUid, effectId, targetId, targetMask, duration, random, group, hidden, rawZone, delay, triggers, order);

    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
  public void setValue(int value) {
    this.value = value;
  }
}
