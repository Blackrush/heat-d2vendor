package com.ankamagames.dofus.datacenter.npcs;


public class NpcMessage
    implements java.io.Serializable {
  public int id;
  public long messageId;
  public NpcMessage() {
  }
  public NpcMessage(int id, long messageId) {
    this.id = id;
    this.messageId = messageId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public long getMessageId() {
    return this.messageId;
  }
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }
}
