package com.ankamagames.dofus.datacenter.spells;

import com.ankamagames.dofus.datacenter.effects.instances.EffectInstanceDice;

public class SpellLevel
    implements java.io.Serializable {
  public int id;
  public int spellId;
  public int grade;
  public int spellBreed;
  public int apCost;
  public int minRange;
  public int range;
  public boolean castInLine;
  public boolean castInDiagonal;
  public boolean castTestLos;
  public int criticalHitProbability;
  public int criticalFailureProbability;
  public boolean needFreeCell;
  public boolean needTakenCell;
  public boolean needFreeTrapCell;
  public boolean rangeCanBeBoosted;
  public int maxStack;
  public int maxCastPerTurn;
  public int maxCastPerTarget;
  public int minCastInterval;
  public int initialCooldown;
  public int globalCooldown;
  public int minPlayerLevel;
  public boolean criticalFailureEndsTurn;
  public boolean hideEffects;
  public boolean hidden;
  public int[] statesRequired;
  public int[] statesForbidden;
  public EffectInstanceDice[] effects;
  public EffectInstanceDice[] criticalEffect;
  public SpellLevel() {
  }
  public SpellLevel(int id, int spellId, int grade, int spellBreed, int apCost, int minRange, int range, boolean castInLine, boolean castInDiagonal, boolean castTestLos, int criticalHitProbability, int criticalFailureProbability, boolean needFreeCell, boolean needTakenCell, boolean needFreeTrapCell, boolean rangeCanBeBoosted, int maxStack, int maxCastPerTurn, int maxCastPerTarget, int minCastInterval, int initialCooldown, int globalCooldown, int minPlayerLevel, boolean criticalFailureEndsTurn, boolean hideEffects, boolean hidden, int[] statesRequired, int[] statesForbidden, EffectInstanceDice[] effects, EffectInstanceDice[] criticalEffect) {
    this.id = id;
    this.spellId = spellId;
    this.grade = grade;
    this.spellBreed = spellBreed;
    this.apCost = apCost;
    this.minRange = minRange;
    this.range = range;
    this.castInLine = castInLine;
    this.castInDiagonal = castInDiagonal;
    this.castTestLos = castTestLos;
    this.criticalHitProbability = criticalHitProbability;
    this.criticalFailureProbability = criticalFailureProbability;
    this.needFreeCell = needFreeCell;
    this.needTakenCell = needTakenCell;
    this.needFreeTrapCell = needFreeTrapCell;
    this.rangeCanBeBoosted = rangeCanBeBoosted;
    this.maxStack = maxStack;
    this.maxCastPerTurn = maxCastPerTurn;
    this.maxCastPerTarget = maxCastPerTarget;
    this.minCastInterval = minCastInterval;
    this.initialCooldown = initialCooldown;
    this.globalCooldown = globalCooldown;
    this.minPlayerLevel = minPlayerLevel;
    this.criticalFailureEndsTurn = criticalFailureEndsTurn;
    this.hideEffects = hideEffects;
    this.hidden = hidden;
    this.statesRequired = statesRequired;
    this.statesForbidden = statesForbidden;
    this.effects = effects;
    this.criticalEffect = criticalEffect;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getSpellId() {
    return this.spellId;
  }
  public void setSpellId(int spellId) {
    this.spellId = spellId;
  }
  public int getGrade() {
    return this.grade;
  }
  public void setGrade(int grade) {
    this.grade = grade;
  }
  public int getSpellBreed() {
    return this.spellBreed;
  }
  public void setSpellBreed(int spellBreed) {
    this.spellBreed = spellBreed;
  }
  public int getApCost() {
    return this.apCost;
  }
  public void setApCost(int apCost) {
    this.apCost = apCost;
  }
  public int getMinRange() {
    return this.minRange;
  }
  public void setMinRange(int minRange) {
    this.minRange = minRange;
  }
  public int getRange() {
    return this.range;
  }
  public void setRange(int range) {
    this.range = range;
  }
  public boolean getCastInLine() {
    return this.castInLine;
  }
  public void setCastInLine(boolean castInLine) {
    this.castInLine = castInLine;
  }
  public boolean getCastInDiagonal() {
    return this.castInDiagonal;
  }
  public void setCastInDiagonal(boolean castInDiagonal) {
    this.castInDiagonal = castInDiagonal;
  }
  public boolean getCastTestLos() {
    return this.castTestLos;
  }
  public void setCastTestLos(boolean castTestLos) {
    this.castTestLos = castTestLos;
  }
  public int getCriticalHitProbability() {
    return this.criticalHitProbability;
  }
  public void setCriticalHitProbability(int criticalHitProbability) {
    this.criticalHitProbability = criticalHitProbability;
  }
  public int getCriticalFailureProbability() {
    return this.criticalFailureProbability;
  }
  public void setCriticalFailureProbability(int criticalFailureProbability) {
    this.criticalFailureProbability = criticalFailureProbability;
  }
  public boolean getNeedFreeCell() {
    return this.needFreeCell;
  }
  public void setNeedFreeCell(boolean needFreeCell) {
    this.needFreeCell = needFreeCell;
  }
  public boolean getNeedTakenCell() {
    return this.needTakenCell;
  }
  public void setNeedTakenCell(boolean needTakenCell) {
    this.needTakenCell = needTakenCell;
  }
  public boolean getNeedFreeTrapCell() {
    return this.needFreeTrapCell;
  }
  public void setNeedFreeTrapCell(boolean needFreeTrapCell) {
    this.needFreeTrapCell = needFreeTrapCell;
  }
  public boolean getRangeCanBeBoosted() {
    return this.rangeCanBeBoosted;
  }
  public void setRangeCanBeBoosted(boolean rangeCanBeBoosted) {
    this.rangeCanBeBoosted = rangeCanBeBoosted;
  }
  public int getMaxStack() {
    return this.maxStack;
  }
  public void setMaxStack(int maxStack) {
    this.maxStack = maxStack;
  }
  public int getMaxCastPerTurn() {
    return this.maxCastPerTurn;
  }
  public void setMaxCastPerTurn(int maxCastPerTurn) {
    this.maxCastPerTurn = maxCastPerTurn;
  }
  public int getMaxCastPerTarget() {
    return this.maxCastPerTarget;
  }
  public void setMaxCastPerTarget(int maxCastPerTarget) {
    this.maxCastPerTarget = maxCastPerTarget;
  }
  public int getMinCastInterval() {
    return this.minCastInterval;
  }
  public void setMinCastInterval(int minCastInterval) {
    this.minCastInterval = minCastInterval;
  }
  public int getInitialCooldown() {
    return this.initialCooldown;
  }
  public void setInitialCooldown(int initialCooldown) {
    this.initialCooldown = initialCooldown;
  }
  public int getGlobalCooldown() {
    return this.globalCooldown;
  }
  public void setGlobalCooldown(int globalCooldown) {
    this.globalCooldown = globalCooldown;
  }
  public int getMinPlayerLevel() {
    return this.minPlayerLevel;
  }
  public void setMinPlayerLevel(int minPlayerLevel) {
    this.minPlayerLevel = minPlayerLevel;
  }
  public boolean getCriticalFailureEndsTurn() {
    return this.criticalFailureEndsTurn;
  }
  public void setCriticalFailureEndsTurn(boolean criticalFailureEndsTurn) {
    this.criticalFailureEndsTurn = criticalFailureEndsTurn;
  }
  public boolean getHideEffects() {
    return this.hideEffects;
  }
  public void setHideEffects(boolean hideEffects) {
    this.hideEffects = hideEffects;
  }
  public boolean getHidden() {
    return this.hidden;
  }
  public void setHidden(boolean hidden) {
    this.hidden = hidden;
  }
  public int[] getStatesRequired() {
    return this.statesRequired;
  }
  public void setStatesRequired(int[] statesRequired) {
    this.statesRequired = statesRequired;
  }
  public int[] getStatesForbidden() {
    return this.statesForbidden;
  }
  public void setStatesForbidden(int[] statesForbidden) {
    this.statesForbidden = statesForbidden;
  }
  public EffectInstanceDice[] getEffects() {
    return this.effects;
  }
  public void setEffects(EffectInstanceDice[] effects) {
    this.effects = effects;
  }
  public EffectInstanceDice[] getCriticalEffect() {
    return this.criticalEffect;
  }
  public void setCriticalEffect(EffectInstanceDice[] criticalEffect) {
    this.criticalEffect = criticalEffect;
  }
}
