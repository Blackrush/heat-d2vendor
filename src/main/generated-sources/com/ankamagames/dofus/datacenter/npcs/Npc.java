package com.ankamagames.dofus.datacenter.npcs;

import com.ankamagames.dofus.datacenter.npcs.AnimFunNpcData;

public class Npc
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int[][] dialogMessages;
  public int[][] dialogReplies;
  public long[] actions;
  public int gender;
  public String look;
  public AnimFunNpcData[] animFunList;
  public boolean fastAnimsFun;
  public Npc() {
  }
  public Npc(int id, long nameId, int[][] dialogMessages, int[][] dialogReplies, long[] actions, int gender, String look, AnimFunNpcData[] animFunList, boolean fastAnimsFun) {
    this.id = id;
    this.nameId = nameId;
    this.dialogMessages = dialogMessages;
    this.dialogReplies = dialogReplies;
    this.actions = actions;
    this.gender = gender;
    this.look = look;
    this.animFunList = animFunList;
    this.fastAnimsFun = fastAnimsFun;
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
  public int[][] getDialogMessages() {
    return this.dialogMessages;
  }
  public void setDialogMessages(int[][] dialogMessages) {
    this.dialogMessages = dialogMessages;
  }
  public int[][] getDialogReplies() {
    return this.dialogReplies;
  }
  public void setDialogReplies(int[][] dialogReplies) {
    this.dialogReplies = dialogReplies;
  }
  public long[] getActions() {
    return this.actions;
  }
  public void setActions(long[] actions) {
    this.actions = actions;
  }
  public int getGender() {
    return this.gender;
  }
  public void setGender(int gender) {
    this.gender = gender;
  }
  public String getLook() {
    return this.look;
  }
  public void setLook(String look) {
    this.look = look;
  }
  public AnimFunNpcData[] getAnimFunList() {
    return this.animFunList;
  }
  public void setAnimFunList(AnimFunNpcData[] animFunList) {
    this.animFunList = animFunList;
  }
  public boolean getFastAnimsFun() {
    return this.fastAnimsFun;
  }
  public void setFastAnimsFun(boolean fastAnimsFun) {
    this.fastAnimsFun = fastAnimsFun;
  }
}
