package com.ankamagames.dofus.datacenter.servers;


public class ServerCommunity
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public String[] defaultCountries;
  public String shortId;
  public ServerCommunity() {
  }
  public ServerCommunity(int id, long nameId, String[] defaultCountries, String shortId) {
    this.id = id;
    this.nameId = nameId;
    this.defaultCountries = defaultCountries;
    this.shortId = shortId;
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
  public String[] getDefaultCountries() {
    return this.defaultCountries;
  }
  public void setDefaultCountries(String[] defaultCountries) {
    this.defaultCountries = defaultCountries;
  }
  public String getShortId() {
    return this.shortId;
  }
  public void setShortId(String shortId) {
    this.shortId = shortId;
  }
}
