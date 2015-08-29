package com.ankamagames.dofus.datacenter.items;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;

public class ItemSet
    implements java.io.Serializable {
  public int id;
  public long[] items;
  public long nameId;
  public boolean bonusIsSecret;
  public EffectInstance[][] effects;
  public ItemSet() {
  }
  public ItemSet(int id, long[] items, long nameId, boolean bonusIsSecret, EffectInstance[][] effects) {
    this.id = id;
    this.items = items;
    this.nameId = nameId;
    this.bonusIsSecret = bonusIsSecret;
    this.effects = effects;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long[] getItems() {
    return this.items;
  }
  public void setItems(long[] items) {
    this.items = items;
  }
  public long getNameId() {
    return this.nameId;
  }
  public void setNameId(long nameId) {
    this.nameId = nameId;
  }
  public boolean getBonusIsSecret() {
    return this.bonusIsSecret;
  }
  public void setBonusIsSecret(boolean bonusIsSecret) {
    this.bonusIsSecret = bonusIsSecret;
  }
  public EffectInstance[][] getEffects() {
    return this.effects;
  }
  public void setEffects(EffectInstance[][] effects) {
    this.effects = effects;
  }
}
