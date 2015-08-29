package com.ankamagames.dofus.datacenter.servers;


public class Server
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public long commentId;
  public double openingDate;
  public String language;
  public int populationId;
  public int gameTypeId;
  public int communityId;
  public String[] restrictedToLanguages;
  public Server() {
  }
  public Server(int id, long nameId, long commentId, double openingDate, String language, int populationId, int gameTypeId, int communityId, String[] restrictedToLanguages) {
    this.id = id;
    this.nameId = nameId;
    this.commentId = commentId;
    this.openingDate = openingDate;
    this.language = language;
    this.populationId = populationId;
    this.gameTypeId = gameTypeId;
    this.communityId = communityId;
    this.restrictedToLanguages = restrictedToLanguages;
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
  public long getCommentId() {
    return this.commentId;
  }
  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }
  public double getOpeningDate() {
    return this.openingDate;
  }
  public void setOpeningDate(double openingDate) {
    this.openingDate = openingDate;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public int getPopulationId() {
    return this.populationId;
  }
  public void setPopulationId(int populationId) {
    this.populationId = populationId;
  }
  public int getGameTypeId() {
    return this.gameTypeId;
  }
  public void setGameTypeId(int gameTypeId) {
    this.gameTypeId = gameTypeId;
  }
  public int getCommunityId() {
    return this.communityId;
  }
  public void setCommunityId(int communityId) {
    this.communityId = communityId;
  }
  public String[] getRestrictedToLanguages() {
    return this.restrictedToLanguages;
  }
  public void setRestrictedToLanguages(String[] restrictedToLanguages) {
    this.restrictedToLanguages = restrictedToLanguages;
  }
}
