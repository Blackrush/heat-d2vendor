package com.ankamagames.dofus.datacenter.breeds;

import com.ankamagames.dofus.datacenter.breeds.BreedRoleByBreed;

public class Breed
    implements java.io.Serializable {
  public int id;
  public long shortNameId;
  public long longNameId;
  public long descriptionId;
  public long gameplayDescriptionId;
  public String maleLook;
  public String femaleLook;
  public int creatureBonesId;
  public int maleArtwork;
  public int femaleArtwork;
  public long[][] statsPointsForStrength;
  public long[][] statsPointsForIntelligence;
  public long[][] statsPointsForChance;
  public long[][] statsPointsForAgility;
  public long[][] statsPointsForVitality;
  public long[][] statsPointsForWisdom;
  public long[] breedSpellsId;
  public BreedRoleByBreed[] breedRoles;
  public long[] maleColors;
  public long[] femaleColors;
  public int spawnMap;
  public Breed() {
  }
  public Breed(int id, long shortNameId, long longNameId, long descriptionId, long gameplayDescriptionId, String maleLook, String femaleLook, int creatureBonesId, int maleArtwork, int femaleArtwork, long[][] statsPointsForStrength, long[][] statsPointsForIntelligence, long[][] statsPointsForChance, long[][] statsPointsForAgility, long[][] statsPointsForVitality, long[][] statsPointsForWisdom, long[] breedSpellsId, BreedRoleByBreed[] breedRoles, long[] maleColors, long[] femaleColors, int spawnMap) {
    this.id = id;
    this.shortNameId = shortNameId;
    this.longNameId = longNameId;
    this.descriptionId = descriptionId;
    this.gameplayDescriptionId = gameplayDescriptionId;
    this.maleLook = maleLook;
    this.femaleLook = femaleLook;
    this.creatureBonesId = creatureBonesId;
    this.maleArtwork = maleArtwork;
    this.femaleArtwork = femaleArtwork;
    this.statsPointsForStrength = statsPointsForStrength;
    this.statsPointsForIntelligence = statsPointsForIntelligence;
    this.statsPointsForChance = statsPointsForChance;
    this.statsPointsForAgility = statsPointsForAgility;
    this.statsPointsForVitality = statsPointsForVitality;
    this.statsPointsForWisdom = statsPointsForWisdom;
    this.breedSpellsId = breedSpellsId;
    this.breedRoles = breedRoles;
    this.maleColors = maleColors;
    this.femaleColors = femaleColors;
    this.spawnMap = spawnMap;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getShortNameId() {
    return this.shortNameId;
  }
  public void setShortNameId(long shortNameId) {
    this.shortNameId = shortNameId;
  }
  public long getLongNameId() {
    return this.longNameId;
  }
  public void setLongNameId(long longNameId) {
    this.longNameId = longNameId;
  }
  public long getDescriptionId() {
    return this.descriptionId;
  }
  public void setDescriptionId(long descriptionId) {
    this.descriptionId = descriptionId;
  }
  public long getGameplayDescriptionId() {
    return this.gameplayDescriptionId;
  }
  public void setGameplayDescriptionId(long gameplayDescriptionId) {
    this.gameplayDescriptionId = gameplayDescriptionId;
  }
  public String getMaleLook() {
    return this.maleLook;
  }
  public void setMaleLook(String maleLook) {
    this.maleLook = maleLook;
  }
  public String getFemaleLook() {
    return this.femaleLook;
  }
  public void setFemaleLook(String femaleLook) {
    this.femaleLook = femaleLook;
  }
  public int getCreatureBonesId() {
    return this.creatureBonesId;
  }
  public void setCreatureBonesId(int creatureBonesId) {
    this.creatureBonesId = creatureBonesId;
  }
  public int getMaleArtwork() {
    return this.maleArtwork;
  }
  public void setMaleArtwork(int maleArtwork) {
    this.maleArtwork = maleArtwork;
  }
  public int getFemaleArtwork() {
    return this.femaleArtwork;
  }
  public void setFemaleArtwork(int femaleArtwork) {
    this.femaleArtwork = femaleArtwork;
  }
  public long[][] getStatsPointsForStrength() {
    return this.statsPointsForStrength;
  }
  public void setStatsPointsForStrength(long[][] statsPointsForStrength) {
    this.statsPointsForStrength = statsPointsForStrength;
  }
  public long[][] getStatsPointsForIntelligence() {
    return this.statsPointsForIntelligence;
  }
  public void setStatsPointsForIntelligence(long[][] statsPointsForIntelligence) {
    this.statsPointsForIntelligence = statsPointsForIntelligence;
  }
  public long[][] getStatsPointsForChance() {
    return this.statsPointsForChance;
  }
  public void setStatsPointsForChance(long[][] statsPointsForChance) {
    this.statsPointsForChance = statsPointsForChance;
  }
  public long[][] getStatsPointsForAgility() {
    return this.statsPointsForAgility;
  }
  public void setStatsPointsForAgility(long[][] statsPointsForAgility) {
    this.statsPointsForAgility = statsPointsForAgility;
  }
  public long[][] getStatsPointsForVitality() {
    return this.statsPointsForVitality;
  }
  public void setStatsPointsForVitality(long[][] statsPointsForVitality) {
    this.statsPointsForVitality = statsPointsForVitality;
  }
  public long[][] getStatsPointsForWisdom() {
    return this.statsPointsForWisdom;
  }
  public void setStatsPointsForWisdom(long[][] statsPointsForWisdom) {
    this.statsPointsForWisdom = statsPointsForWisdom;
  }
  public long[] getBreedSpellsId() {
    return this.breedSpellsId;
  }
  public void setBreedSpellsId(long[] breedSpellsId) {
    this.breedSpellsId = breedSpellsId;
  }
  public BreedRoleByBreed[] getBreedRoles() {
    return this.breedRoles;
  }
  public void setBreedRoles(BreedRoleByBreed[] breedRoles) {
    this.breedRoles = breedRoles;
  }
  public long[] getMaleColors() {
    return this.maleColors;
  }
  public void setMaleColors(long[] maleColors) {
    this.maleColors = maleColors;
  }
  public long[] getFemaleColors() {
    return this.femaleColors;
  }
  public void setFemaleColors(long[] femaleColors) {
    this.femaleColors = femaleColors;
  }
  public int getSpawnMap() {
    return this.spawnMap;
  }
  public void setSpawnMap(int spawnMap) {
    this.spawnMap = spawnMap;
  }
}
