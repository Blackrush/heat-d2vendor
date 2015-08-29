package com.ankamagames.dofus.datacenter.items;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;
import com.ankamagames.dofus.datacenter.items.Item;

public class Weapon extends Item
    implements java.io.Serializable {
  public int range;
  public int criticalHitBonus;
  public int minRange;
  public int maxCastPerTurn;
  public boolean castTestLos;
  public int criticalFailureProbability;
  public int criticalHitProbability;
  public boolean castInDiagonal;
  public int apCost;
  public boolean castInLine;
  public Weapon() {
  }
  public Weapon(int favoriteSubAreasBonus, int range, boolean bonusIsSecret, int criticalHitBonus, String criteriaTarget, int minRange, int maxCastPerTurn, long descriptionId, long[] recipeIds, boolean secretRecipe, boolean etheral, int appearanceId, int id, long[] dropMonsterIds, boolean cursed, boolean exchangeable, int level, int realWeight, boolean castTestLos, long[] favoriteSubAreas, int criticalFailureProbability, boolean hideEffects, String criteria, boolean targetable, int criticalHitProbability, boolean twoHanded, boolean nonUsableOnAnother, int itemSetId, long nameId, boolean castInDiagonal, double price, boolean enhanceable, int apCost, boolean usable, boolean castInLine, EffectInstance[] possibleEffects, int useAnimationId, int iconId, int typeId, int recipeSlots) {
    super(id, nameId, typeId, descriptionId, iconId, level, realWeight, cursed, useAnimationId, usable, targetable, exchangeable, price, twoHanded, etheral, itemSetId, criteria, criteriaTarget, hideEffects, enhanceable, nonUsableOnAnother, appearanceId, secretRecipe, recipeSlots, recipeIds, dropMonsterIds, bonusIsSecret, possibleEffects, favoriteSubAreas, favoriteSubAreasBonus);

    this.range = range;
    this.criticalHitBonus = criticalHitBonus;
    this.minRange = minRange;
    this.maxCastPerTurn = maxCastPerTurn;
    this.castTestLos = castTestLos;
    this.criticalFailureProbability = criticalFailureProbability;
    this.criticalHitProbability = criticalHitProbability;
    this.castInDiagonal = castInDiagonal;
    this.apCost = apCost;
    this.castInLine = castInLine;
  }

  public int getRange() {
    return this.range;
  }
  public void setRange(int range) {
    this.range = range;
  }
  public int getCriticalHitBonus() {
    return this.criticalHitBonus;
  }
  public void setCriticalHitBonus(int criticalHitBonus) {
    this.criticalHitBonus = criticalHitBonus;
  }
  public int getMinRange() {
    return this.minRange;
  }
  public void setMinRange(int minRange) {
    this.minRange = minRange;
  }
  public int getMaxCastPerTurn() {
    return this.maxCastPerTurn;
  }
  public void setMaxCastPerTurn(int maxCastPerTurn) {
    this.maxCastPerTurn = maxCastPerTurn;
  }
  public boolean getCastTestLos() {
    return this.castTestLos;
  }
  public void setCastTestLos(boolean castTestLos) {
    this.castTestLos = castTestLos;
  }
  public int getCriticalFailureProbability() {
    return this.criticalFailureProbability;
  }
  public void setCriticalFailureProbability(int criticalFailureProbability) {
    this.criticalFailureProbability = criticalFailureProbability;
  }
  public int getCriticalHitProbability() {
    return this.criticalHitProbability;
  }
  public void setCriticalHitProbability(int criticalHitProbability) {
    this.criticalHitProbability = criticalHitProbability;
  }
  public boolean getCastInDiagonal() {
    return this.castInDiagonal;
  }
  public void setCastInDiagonal(boolean castInDiagonal) {
    this.castInDiagonal = castInDiagonal;
  }
  public int getApCost() {
    return this.apCost;
  }
  public void setApCost(int apCost) {
    this.apCost = apCost;
  }
  public boolean getCastInLine() {
    return this.castInLine;
  }
  public void setCastInLine(boolean castInLine) {
    this.castInLine = castInLine;
  }
}
