package com.ankamagames.dofus.datacenter.communication;


public class Smiley
    implements java.io.Serializable {
  public int id;
  public int order;
  public String gfxId;
  public boolean forPlayers;
  public String[] triggers;
  public Smiley() {
  }
  public Smiley(int id, int order, String gfxId, boolean forPlayers, String[] triggers) {
    this.id = id;
    this.order = order;
    this.gfxId = gfxId;
    this.forPlayers = forPlayers;
    this.triggers = triggers;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getOrder() {
    return this.order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public String getGfxId() {
    return this.gfxId;
  }
  public void setGfxId(String gfxId) {
    this.gfxId = gfxId;
  }
  public boolean getForPlayers() {
    return this.forPlayers;
  }
  public void setForPlayers(boolean forPlayers) {
    this.forPlayers = forPlayers;
  }
  public String[] getTriggers() {
    return this.triggers;
  }
  public void setTriggers(String[] triggers) {
    this.triggers = triggers;
  }
}
