package com.ankamagames.dofus.datacenter.misc;


public class Url
    implements java.io.Serializable {
  public int id;
  public int browserId;
  public String url;
  public String param;
  public String method;
  public Url() {
  }
  public Url(int id, int browserId, String url, String param, String method) {
    this.id = id;
    this.browserId = browserId;
    this.url = url;
    this.param = param;
    this.method = method;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getBrowserId() {
    return this.browserId;
  }
  public void setBrowserId(int browserId) {
    this.browserId = browserId;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public String getParam() {
    return this.param;
  }
  public void setParam(String param) {
    this.param = param;
  }
  public String getMethod() {
    return this.method;
  }
  public void setMethod(String method) {
    this.method = method;
  }
}
