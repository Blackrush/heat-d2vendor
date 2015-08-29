package com.ankamagames.dofus.datacenter.monsters;

import com.ankamagames.dofus.datacenter.monsters.AnimFunMonsterData;
import com.ankamagames.dofus.datacenter.monsters.MonsterDrop;
import com.ankamagames.dofus.datacenter.monsters.MonsterGrade;

public class Monster
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int gfxId;
  public int race;
  public MonsterGrade[] grades;
  public String look;
  public boolean useSummonSlot;
  public boolean useBombSlot;
  public boolean canPlay;
  public AnimFunMonsterData[] animFunList;
  public boolean canTackle;
  public boolean isBoss;
  public MonsterDrop[] drops;
  public long[] subareas;
  public long[] spells;
  public int favoriteSubareaId;
  public boolean isMiniBoss;
  public boolean isQuestMonster;
  public int correspondingMiniBossId;
  public int speedAdjust;
  public int creatureBoneId;
  public boolean canBePushed;
  public boolean fastAnimsFun;
  public boolean canSwitchPos;
  public Monster() {
  }
  public Monster(int id, long nameId, int gfxId, int race, MonsterGrade[] grades, String look, boolean useSummonSlot, boolean useBombSlot, boolean canPlay, AnimFunMonsterData[] animFunList, boolean canTackle, boolean isBoss, MonsterDrop[] drops, long[] subareas, long[] spells, int favoriteSubareaId, boolean isMiniBoss, boolean isQuestMonster, int correspondingMiniBossId, int speedAdjust, int creatureBoneId, boolean canBePushed, boolean fastAnimsFun, boolean canSwitchPos) {
    this.id = id;
    this.nameId = nameId;
    this.gfxId = gfxId;
    this.race = race;
    this.grades = grades;
    this.look = look;
    this.useSummonSlot = useSummonSlot;
    this.useBombSlot = useBombSlot;
    this.canPlay = canPlay;
    this.animFunList = animFunList;
    this.canTackle = canTackle;
    this.isBoss = isBoss;
    this.drops = drops;
    this.subareas = subareas;
    this.spells = spells;
    this.favoriteSubareaId = favoriteSubareaId;
    this.isMiniBoss = isMiniBoss;
    this.isQuestMonster = isQuestMonster;
    this.correspondingMiniBossId = correspondingMiniBossId;
    this.speedAdjust = speedAdjust;
    this.creatureBoneId = creatureBoneId;
    this.canBePushed = canBePushed;
    this.fastAnimsFun = fastAnimsFun;
    this.canSwitchPos = canSwitchPos;
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
  public int getGfxId() {
    return this.gfxId;
  }
  public void setGfxId(int gfxId) {
    this.gfxId = gfxId;
  }
  public int getRace() {
    return this.race;
  }
  public void setRace(int race) {
    this.race = race;
  }
  public MonsterGrade[] getGrades() {
    return this.grades;
  }
  public void setGrades(MonsterGrade[] grades) {
    this.grades = grades;
  }
  public String getLook() {
    return this.look;
  }
  public void setLook(String look) {
    this.look = look;
  }
  public boolean getUseSummonSlot() {
    return this.useSummonSlot;
  }
  public void setUseSummonSlot(boolean useSummonSlot) {
    this.useSummonSlot = useSummonSlot;
  }
  public boolean getUseBombSlot() {
    return this.useBombSlot;
  }
  public void setUseBombSlot(boolean useBombSlot) {
    this.useBombSlot = useBombSlot;
  }
  public boolean getCanPlay() {
    return this.canPlay;
  }
  public void setCanPlay(boolean canPlay) {
    this.canPlay = canPlay;
  }
  public AnimFunMonsterData[] getAnimFunList() {
    return this.animFunList;
  }
  public void setAnimFunList(AnimFunMonsterData[] animFunList) {
    this.animFunList = animFunList;
  }
  public boolean getCanTackle() {
    return this.canTackle;
  }
  public void setCanTackle(boolean canTackle) {
    this.canTackle = canTackle;
  }
  public boolean getIsBoss() {
    return this.isBoss;
  }
  public void setIsBoss(boolean isBoss) {
    this.isBoss = isBoss;
  }
  public MonsterDrop[] getDrops() {
    return this.drops;
  }
  public void setDrops(MonsterDrop[] drops) {
    this.drops = drops;
  }
  public long[] getSubareas() {
    return this.subareas;
  }
  public void setSubareas(long[] subareas) {
    this.subareas = subareas;
  }
  public long[] getSpells() {
    return this.spells;
  }
  public void setSpells(long[] spells) {
    this.spells = spells;
  }
  public int getFavoriteSubareaId() {
    return this.favoriteSubareaId;
  }
  public void setFavoriteSubareaId(int favoriteSubareaId) {
    this.favoriteSubareaId = favoriteSubareaId;
  }
  public boolean getIsMiniBoss() {
    return this.isMiniBoss;
  }
  public void setIsMiniBoss(boolean isMiniBoss) {
    this.isMiniBoss = isMiniBoss;
  }
  public boolean getIsQuestMonster() {
    return this.isQuestMonster;
  }
  public void setIsQuestMonster(boolean isQuestMonster) {
    this.isQuestMonster = isQuestMonster;
  }
  public int getCorrespondingMiniBossId() {
    return this.correspondingMiniBossId;
  }
  public void setCorrespondingMiniBossId(int correspondingMiniBossId) {
    this.correspondingMiniBossId = correspondingMiniBossId;
  }
  public int getSpeedAdjust() {
    return this.speedAdjust;
  }
  public void setSpeedAdjust(int speedAdjust) {
    this.speedAdjust = speedAdjust;
  }
  public int getCreatureBoneId() {
    return this.creatureBoneId;
  }
  public void setCreatureBoneId(int creatureBoneId) {
    this.creatureBoneId = creatureBoneId;
  }
  public boolean getCanBePushed() {
    return this.canBePushed;
  }
  public void setCanBePushed(boolean canBePushed) {
    this.canBePushed = canBePushed;
  }
  public boolean getFastAnimsFun() {
    return this.fastAnimsFun;
  }
  public void setFastAnimsFun(boolean fastAnimsFun) {
    this.fastAnimsFun = fastAnimsFun;
  }
  public boolean getCanSwitchPos() {
    return this.canSwitchPos;
  }
  public void setCanSwitchPos(boolean canSwitchPos) {
    this.canSwitchPos = canSwitchPos;
  }
}
