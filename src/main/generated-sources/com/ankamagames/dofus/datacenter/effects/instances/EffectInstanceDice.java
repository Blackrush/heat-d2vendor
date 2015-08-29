package com.ankamagames.dofus.datacenter.effects.instances;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;

public class EffectInstanceDice extends EffectInstance
    implements java.io.Serializable {
  public int diceNum;
  public int diceSide;
  public int value;
  public EffectInstanceDice() {
  }
  public EffectInstanceDice(int random, String rawZone, int targetId, String targetMask, int effectId, int diceNum, int duration, int order, int effectUid, boolean hidden, int diceSide, int value, String triggers, int delay, int group) {
    super(effectUid, effectId, targetId, targetMask, duration, random, group, hidden, rawZone, delay, triggers, order);

    this.diceNum = diceNum;
    this.diceSide = diceSide;
    this.value = value;
  }

  public int getDiceNum() {
    return this.diceNum;
  }
  public void setDiceNum(int diceNum) {
    this.diceNum = diceNum;
  }
  public int getDiceSide() {
    return this.diceSide;
  }
  public void setDiceSide(int diceSide) {
    this.diceSide = diceSide;
  }
  public int getValue() {
    return this.value;
  }
  public void setValue(int value) {
    this.value = value;
  }
}
