package com.ankamagames.dofus.datacenter.items;

import com.ankamagames.dofus.datacenter.effects.EffectInstance;

public class Item
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int typeId;
  public long descriptionId;
  public int iconId;
  public int level;
  public int realWeight;
  public boolean cursed;
  public int useAnimationId;
  public boolean usable;
  public boolean targetable;
  public boolean exchangeable;
  public double price;
  public boolean twoHanded;
  public boolean etheral;
  public int itemSetId;
  public String criteria;
  public String criteriaTarget;
  public boolean hideEffects;
  public boolean enhanceable;
  public boolean nonUsableOnAnother;
  public int appearanceId;
  public boolean secretRecipe;
  public int recipeSlots;
  public long[] recipeIds;
  public long[] dropMonsterIds;
  public boolean bonusIsSecret;
  public EffectInstance[] possibleEffects;
  public long[] favoriteSubAreas;
  public int favoriteSubAreasBonus;
  public Item() {
  }
  public Item(int id, long nameId, int typeId, long descriptionId, int iconId, int level, int realWeight, boolean cursed, int useAnimationId, boolean usable, boolean targetable, boolean exchangeable, double price, boolean twoHanded, boolean etheral, int itemSetId, String criteria, String criteriaTarget, boolean hideEffects, boolean enhanceable, boolean nonUsableOnAnother, int appearanceId, boolean secretRecipe, int recipeSlots, long[] recipeIds, long[] dropMonsterIds, boolean bonusIsSecret, EffectInstance[] possibleEffects, long[] favoriteSubAreas, int favoriteSubAreasBonus) {
    this.id = id;
    this.nameId = nameId;
    this.typeId = typeId;
    this.descriptionId = descriptionId;
    this.iconId = iconId;
    this.level = level;
    this.realWeight = realWeight;
    this.cursed = cursed;
    this.useAnimationId = useAnimationId;
    this.usable = usable;
    this.targetable = targetable;
    this.exchangeable = exchangeable;
    this.price = price;
    this.twoHanded = twoHanded;
    this.etheral = etheral;
    this.itemSetId = itemSetId;
    this.criteria = criteria;
    this.criteriaTarget = criteriaTarget;
    this.hideEffects = hideEffects;
    this.enhanceable = enhanceable;
    this.nonUsableOnAnother = nonUsableOnAnother;
    this.appearanceId = appearanceId;
    this.secretRecipe = secretRecipe;
    this.recipeSlots = recipeSlots;
    this.recipeIds = recipeIds;
    this.dropMonsterIds = dropMonsterIds;
    this.bonusIsSecret = bonusIsSecret;
    this.possibleEffects = possibleEffects;
    this.favoriteSubAreas = favoriteSubAreas;
    this.favoriteSubAreasBonus = favoriteSubAreasBonus;
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
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
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
  public int getLevel() {
    return this.level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public int getRealWeight() {
    return this.realWeight;
  }
  public void setRealWeight(int realWeight) {
    this.realWeight = realWeight;
  }
  public boolean getCursed() {
    return this.cursed;
  }
  public void setCursed(boolean cursed) {
    this.cursed = cursed;
  }
  public int getUseAnimationId() {
    return this.useAnimationId;
  }
  public void setUseAnimationId(int useAnimationId) {
    this.useAnimationId = useAnimationId;
  }
  public boolean getUsable() {
    return this.usable;
  }
  public void setUsable(boolean usable) {
    this.usable = usable;
  }
  public boolean getTargetable() {
    return this.targetable;
  }
  public void setTargetable(boolean targetable) {
    this.targetable = targetable;
  }
  public boolean getExchangeable() {
    return this.exchangeable;
  }
  public void setExchangeable(boolean exchangeable) {
    this.exchangeable = exchangeable;
  }
  public double getPrice() {
    return this.price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public boolean getTwoHanded() {
    return this.twoHanded;
  }
  public void setTwoHanded(boolean twoHanded) {
    this.twoHanded = twoHanded;
  }
  public boolean getEtheral() {
    return this.etheral;
  }
  public void setEtheral(boolean etheral) {
    this.etheral = etheral;
  }
  public int getItemSetId() {
    return this.itemSetId;
  }
  public void setItemSetId(int itemSetId) {
    this.itemSetId = itemSetId;
  }
  public String getCriteria() {
    return this.criteria;
  }
  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }
  public String getCriteriaTarget() {
    return this.criteriaTarget;
  }
  public void setCriteriaTarget(String criteriaTarget) {
    this.criteriaTarget = criteriaTarget;
  }
  public boolean getHideEffects() {
    return this.hideEffects;
  }
  public void setHideEffects(boolean hideEffects) {
    this.hideEffects = hideEffects;
  }
  public boolean getEnhanceable() {
    return this.enhanceable;
  }
  public void setEnhanceable(boolean enhanceable) {
    this.enhanceable = enhanceable;
  }
  public boolean getNonUsableOnAnother() {
    return this.nonUsableOnAnother;
  }
  public void setNonUsableOnAnother(boolean nonUsableOnAnother) {
    this.nonUsableOnAnother = nonUsableOnAnother;
  }
  public int getAppearanceId() {
    return this.appearanceId;
  }
  public void setAppearanceId(int appearanceId) {
    this.appearanceId = appearanceId;
  }
  public boolean getSecretRecipe() {
    return this.secretRecipe;
  }
  public void setSecretRecipe(boolean secretRecipe) {
    this.secretRecipe = secretRecipe;
  }
  public int getRecipeSlots() {
    return this.recipeSlots;
  }
  public void setRecipeSlots(int recipeSlots) {
    this.recipeSlots = recipeSlots;
  }
  public long[] getRecipeIds() {
    return this.recipeIds;
  }
  public void setRecipeIds(long[] recipeIds) {
    this.recipeIds = recipeIds;
  }
  public long[] getDropMonsterIds() {
    return this.dropMonsterIds;
  }
  public void setDropMonsterIds(long[] dropMonsterIds) {
    this.dropMonsterIds = dropMonsterIds;
  }
  public boolean getBonusIsSecret() {
    return this.bonusIsSecret;
  }
  public void setBonusIsSecret(boolean bonusIsSecret) {
    this.bonusIsSecret = bonusIsSecret;
  }
  public EffectInstance[] getPossibleEffects() {
    return this.possibleEffects;
  }
  public void setPossibleEffects(EffectInstance[] possibleEffects) {
    this.possibleEffects = possibleEffects;
  }
  public long[] getFavoriteSubAreas() {
    return this.favoriteSubAreas;
  }
  public void setFavoriteSubAreas(long[] favoriteSubAreas) {
    this.favoriteSubAreas = favoriteSubAreas;
  }
  public int getFavoriteSubAreasBonus() {
    return this.favoriteSubAreasBonus;
  }
  public void setFavoriteSubAreasBonus(int favoriteSubAreasBonus) {
    this.favoriteSubAreasBonus = favoriteSubAreasBonus;
  }
}
