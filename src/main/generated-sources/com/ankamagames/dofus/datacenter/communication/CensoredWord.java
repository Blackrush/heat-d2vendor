package com.ankamagames.dofus.datacenter.communication;


public class CensoredWord
    implements java.io.Serializable {
  public int id;
  public int listId;
  public String language;
  public String word;
  public boolean deepLooking;
  public CensoredWord() {
  }
  public CensoredWord(int id, int listId, String language, String word, boolean deepLooking) {
    this.id = id;
    this.listId = listId;
    this.language = language;
    this.word = word;
    this.deepLooking = deepLooking;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getListId() {
    return this.listId;
  }
  public void setListId(int listId) {
    this.listId = listId;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public String getWord() {
    return this.word;
  }
  public void setWord(String word) {
    this.word = word;
  }
  public boolean getDeepLooking() {
    return this.deepLooking;
  }
  public void setDeepLooking(boolean deepLooking) {
    this.deepLooking = deepLooking;
  }
}
