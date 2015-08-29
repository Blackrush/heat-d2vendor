package com.ankamagames.dofus.datacenter.misc;


public class TypeAction
    implements java.io.Serializable {
  public int id;
  public String elementName;
  public int elementId;
  public TypeAction() {
  }
  public TypeAction(int id, String elementName, int elementId) {
    this.id = id;
    this.elementName = elementName;
    this.elementId = elementId;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getElementName() {
    return this.elementName;
  }
  public void setElementName(String elementName) {
    this.elementName = elementName;
  }
  public int getElementId() {
    return this.elementId;
  }
  public void setElementId(int elementId) {
    this.elementId = elementId;
  }
}
