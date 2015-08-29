package com.ankamagames.dofus.datacenter.communication;


public class Emoticon
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long shortcutId;
  public long order;
  public String defaultAnim;
  public boolean persistancy;
  public boolean eightdirections;
  public boolean aura;
  public String[] anims;
  public long cooldown;
  public long duration;
  public long weight;
  public Emoticon() {
  }
  public Emoticon(int id, long nameId, long shortcutId, long order, String defaultAnim, boolean persistancy, boolean eightdirections, boolean aura, String[] anims, long cooldown, long duration, long weight) {
    this.id = id;
    this.nameId = nameId;
    this.shortcutId = shortcutId;
    this.order = order;
    this.defaultAnim = defaultAnim;
    this.persistancy = persistancy;
    this.eightdirections = eightdirections;
    this.aura = aura;
    this.anims = anims;
    this.cooldown = cooldown;
    this.duration = duration;
    this.weight = weight;
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
  public long getShortcutId() {
    return this.shortcutId;
  }
  public void setShortcutId(long shortcutId) {
    this.shortcutId = shortcutId;
  }
  public long getOrder() {
    return this.order;
  }
  public void setOrder(long order) {
    this.order = order;
  }
  public String getDefaultAnim() {
    return this.defaultAnim;
  }
  public void setDefaultAnim(String defaultAnim) {
    this.defaultAnim = defaultAnim;
  }
  public boolean getPersistancy() {
    return this.persistancy;
  }
  public void setPersistancy(boolean persistancy) {
    this.persistancy = persistancy;
  }
  public boolean getEightdirections() {
    return this.eightdirections;
  }
  public void setEightdirections(boolean eightdirections) {
    this.eightdirections = eightdirections;
  }
  public boolean getAura() {
    return this.aura;
  }
  public void setAura(boolean aura) {
    this.aura = aura;
  }
  public String[] getAnims() {
    return this.anims;
  }
  public void setAnims(String[] anims) {
    this.anims = anims;
  }
  public long getCooldown() {
    return this.cooldown;
  }
  public void setCooldown(long cooldown) {
    this.cooldown = cooldown;
  }
  public long getDuration() {
    return this.duration;
  }
  public void setDuration(long duration) {
    this.duration = duration;
  }
  public long getWeight() {
    return this.weight;
  }
  public void setWeight(long weight) {
    this.weight = weight;
  }
}
