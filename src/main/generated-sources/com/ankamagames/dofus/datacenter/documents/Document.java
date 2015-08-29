package com.ankamagames.dofus.datacenter.documents;


public class Document
    implements java.io.Serializable {
  public int id;
  public int typeId;
  public long titleId;
  public long authorId;
  public long subTitleId;
  public long contentId;
  public String contentCSS;
  public Document() {
  }
  public Document(int id, int typeId, long titleId, long authorId, long subTitleId, long contentId, String contentCSS) {
    this.id = id;
    this.typeId = typeId;
    this.titleId = titleId;
    this.authorId = authorId;
    this.subTitleId = subTitleId;
    this.contentId = contentId;
    this.contentCSS = contentCSS;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getTypeId() {
    return this.typeId;
  }
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  public long getTitleId() {
    return this.titleId;
  }
  public void setTitleId(long titleId) {
    this.titleId = titleId;
  }
  public long getAuthorId() {
    return this.authorId;
  }
  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }
  public long getSubTitleId() {
    return this.subTitleId;
  }
  public void setSubTitleId(long subTitleId) {
    this.subTitleId = subTitleId;
  }
  public long getContentId() {
    return this.contentId;
  }
  public void setContentId(long contentId) {
    this.contentId = contentId;
  }
  public String getContentCSS() {
    return this.contentCSS;
  }
  public void setContentCSS(String contentCSS) {
    this.contentCSS = contentCSS;
  }
}
