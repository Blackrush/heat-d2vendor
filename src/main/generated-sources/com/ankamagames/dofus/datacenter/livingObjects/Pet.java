package com.ankamagames.dofus.datacenter.livingObjects;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;

public class Pet
    implements java.io.Serializable {
  public int id;
  public int[] foodItems;
  public int[] foodTypes;
  public int minDurationBeforeMeal;
  public int maxDurationBeforeMeal;
  public EffectInstance[] possibleEffects;
  public Pet() {
  }
  public Pet(int id, int[] foodItems, int[] foodTypes, int minDurationBeforeMeal, int maxDurationBeforeMeal, EffectInstance[] possibleEffects) {
    this.id = id;
    this.foodItems = foodItems;
    this.foodTypes = foodTypes;
    this.minDurationBeforeMeal = minDurationBeforeMeal;
    this.maxDurationBeforeMeal = maxDurationBeforeMeal;
    this.possibleEffects = possibleEffects;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int[] getFoodItems() {
    return this.foodItems;
  }
  public void setFoodItems(int[] foodItems) {
    this.foodItems = foodItems;
  }
  public int[] getFoodTypes() {
    return this.foodTypes;
  }
  public void setFoodTypes(int[] foodTypes) {
    this.foodTypes = foodTypes;
  }
  public int getMinDurationBeforeMeal() {
    return this.minDurationBeforeMeal;
  }
  public void setMinDurationBeforeMeal(int minDurationBeforeMeal) {
    this.minDurationBeforeMeal = minDurationBeforeMeal;
  }
  public int getMaxDurationBeforeMeal() {
    return this.maxDurationBeforeMeal;
  }
  public void setMaxDurationBeforeMeal(int maxDurationBeforeMeal) {
    this.maxDurationBeforeMeal = maxDurationBeforeMeal;
  }
  public EffectInstance[] getPossibleEffects() {
    return this.possibleEffects;
  }
  public void setPossibleEffects(EffectInstance[] possibleEffects) {
    this.possibleEffects = possibleEffects;
  }
}
