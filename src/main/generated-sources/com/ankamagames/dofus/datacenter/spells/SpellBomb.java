package com.ankamagames.dofus.datacenter.spells;


public class SpellBomb
    implements java.io.Serializable {
  public int id;
  public int chainReactionSpellId;
  public int explodSpellId;
  public int wallId;
  public int instantSpellId;
  public int comboCoeff;
  public SpellBomb() {
  }
  public SpellBomb(int id, int chainReactionSpellId, int explodSpellId, int wallId, int instantSpellId, int comboCoeff) {
    this.id = id;
    this.chainReactionSpellId = chainReactionSpellId;
    this.explodSpellId = explodSpellId;
    this.wallId = wallId;
    this.instantSpellId = instantSpellId;
    this.comboCoeff = comboCoeff;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getChainReactionSpellId() {
    return this.chainReactionSpellId;
  }
  public void setChainReactionSpellId(int chainReactionSpellId) {
    this.chainReactionSpellId = chainReactionSpellId;
  }
  public int getExplodSpellId() {
    return this.explodSpellId;
  }
  public void setExplodSpellId(int explodSpellId) {
    this.explodSpellId = explodSpellId;
  }
  public int getWallId() {
    return this.wallId;
  }
  public void setWallId(int wallId) {
    this.wallId = wallId;
  }
  public int getInstantSpellId() {
    return this.instantSpellId;
  }
  public void setInstantSpellId(int instantSpellId) {
    this.instantSpellId = instantSpellId;
  }
  public int getComboCoeff() {
    return this.comboCoeff;
  }
  public void setComboCoeff(int comboCoeff) {
    this.comboCoeff = comboCoeff;
  }
}
