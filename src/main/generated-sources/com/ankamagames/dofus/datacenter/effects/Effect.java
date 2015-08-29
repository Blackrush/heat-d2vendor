package com.ankamagames.dofus.datacenter.effects;


public class Effect
    implements java.io.Serializable {
  public int id;
  public long descriptionId;
  public int iconId;
  public int characteristic;
  public int category;
  public String operator;
  public boolean showInTooltip;
  public boolean useDice;
  public boolean forceMinMax;
  public boolean boost;
  public boolean active;
  public long theoreticalDescriptionId;
  public int theoreticalPattern;
  public boolean showInSet;
  public int bonusType;
  public boolean useInFight;
  public int effectPriority;
  public int elementId;
  public Effect() {
  }
  public Effect(int id, long descriptionId, int iconId, int characteristic, int category, String operator, boolean showInTooltip, boolean useDice, boolean forceMinMax, boolean boost, boolean active, long theoreticalDescriptionId, int theoreticalPattern, boolean showInSet, int bonusType, boolean useInFight, int effectPriority, int elementId) {
    this.id = id;
    this.descriptionId = descriptionId;
    this.iconId = iconId;
    this.characteristic = characteristic;
    this.category = category;
    this.operator = operator;
    this.showInTooltip = showInTooltip;
    this.useDice = useDice;
    this.forceMinMax = forceMinMax;
    this.boost = boost;
    this.active = active;
    this.theoreticalDescriptionId = theoreticalDescriptionId;
    this.theoreticalPattern = theoreticalPattern;
    this.showInSet = showInSet;
    this.bonusType = bonusType;
    this.useInFight = useInFight;
    this.effectPriority = effectPriority;
    this.elementId = elementId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public int getIconId() {
    return this.iconId;
  }
  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
  public int getCharacteristic() {
    return this.characteristic;
  }
  public void setCharacteristic(int characteristic) {
    this.characteristic = characteristic;
  }
  public int getCategory() {
    return this.category;
  }
  public void setCategory(int category) {
    this.category = category;
  }
  public String getOperator() {
    return this.operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }
  public boolean getShowInTooltip() {
    return this.showInTooltip;
  }
  public void setShowInTooltip(boolean showInTooltip) {
    this.showInTooltip = showInTooltip;
  }
  public boolean getUseDice() {
    return this.useDice;
  }
  public void setUseDice(boolean useDice) {
    this.useDice = useDice;
  }
  public boolean getForceMinMax() {
    return this.forceMinMax;
  }
  public void setForceMinMax(boolean forceMinMax) {
    this.forceMinMax = forceMinMax;
  }
  public boolean getBoost() {
    return this.boost;
  }
  public void setBoost(boolean boost) {
    this.boost = boost;
  }
  public boolean getActive() {
    return this.active;
  }
  public void setActive(boolean active) {
    this.active = active;
  }
  public long getTheoreticalDescriptionId() {
    return this.theoreticalDescriptionId;
  }
  public void setTheoreticalDescriptionId(long theoreticalDescriptionId) {
    this.theoreticalDescriptionId = theoreticalDescriptionId;
  }
  public int getTheoreticalPattern() {
    return this.theoreticalPattern;
  }
  public void setTheoreticalPattern(int theoreticalPattern) {
    this.theoreticalPattern = theoreticalPattern;
  }
  public boolean getShowInSet() {
    return this.showInSet;
  }
  public void setShowInSet(boolean showInSet) {
    this.showInSet = showInSet;
  }
  public int getBonusType() {
    return this.bonusType;
  }
  public void setBonusType(int bonusType) {
    this.bonusType = bonusType;
  }
  public boolean getUseInFight() {
    return this.useInFight;
  }
  public void setUseInFight(boolean useInFight) {
    this.useInFight = useInFight;
  }
  public int getEffectPriority() {
    return this.effectPriority;
  }
  public void setEffectPriority(int effectPriority) {
    this.effectPriority = effectPriority;
  }
  public int getElementId() {
    return this.elementId;
  }
  public void setElementId(int elementId) {
    this.elementId = elementId;
  }
}
