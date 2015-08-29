package com.ankamagames.dofus.datacenter.abuse;


public class AbuseReasons
    implements java.io.Serializable {
  public int abuseReasonId;
  public int mask;
  public long reasonTextId;
  public AbuseReasons() {
  }
  public AbuseReasons(int abuseReasonId, int mask, long reasonTextId) {
    this.abuseReasonId = abuseReasonId;
    this.mask = mask;
    this.reasonTextId = reasonTextId;
  }

  public int getAbuseReasonId() {
    return this.abuseReasonId;
  }
  public void setAbuseReasonId(int abuseReasonId) {
    this.abuseReasonId = abuseReasonId;
  }
  public int getMask() {
    return this.mask;
  }
  public void setMask(int mask) {
    this.mask = mask;
  }
  public long getReasonTextId() {
    return this.reasonTextId;
  }
  public void setReasonTextId(long reasonTextId) {
    this.reasonTextId = reasonTextId;
  }
}
