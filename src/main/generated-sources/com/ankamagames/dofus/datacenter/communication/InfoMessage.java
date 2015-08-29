package com.ankamagames.dofus.datacenter.communication;


public class InfoMessage
    implements java.io.Serializable {
  public int typeId;
  public int messageId;
  public long textId;
  public InfoMessage() {
  }
  public InfoMessage(int typeId, int messageId, long textId) {
    this.typeId = typeId;
    this.messageId = messageId;
    this.textId = textId;
  }

  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public int getMessageId() {
    return this.messageId;
  }
  public void setMessageId(int messageId) {
    this.messageId = messageId;
  }
  public long getTextId() {
    return this.textId;
  }
  public void setTextId(long textId) {
    this.textId = textId;
  }
}
