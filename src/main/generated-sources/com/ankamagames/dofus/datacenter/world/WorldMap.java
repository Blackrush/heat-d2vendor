package com.ankamagames.dofus.datacenter.world;


public class WorldMap
    implements java.io.Serializable {
  public int id;
  public long nameId;
  public int origineX;
  public int origineY;
  public double mapWidth;
  public double mapHeight;
  public int horizontalChunck;
  public int verticalChunck;
  public boolean viewableEverywhere;
  public double minScale;
  public double maxScale;
  public double startScale;
  public int centerX;
  public int centerY;
  public int totalWidth;
  public int totalHeight;
  public String[] zoom;
  public WorldMap() {
  }
  public WorldMap(int id, long nameId, int origineX, int origineY, double mapWidth, double mapHeight, int horizontalChunck, int verticalChunck, boolean viewableEverywhere, double minScale, double maxScale, double startScale, int centerX, int centerY, int totalWidth, int totalHeight, String[] zoom) {
    this.id = id;
    this.nameId = nameId;
    this.origineX = origineX;
    this.origineY = origineY;
    this.mapWidth = mapWidth;
    this.mapHeight = mapHeight;
    this.horizontalChunck = horizontalChunck;
    this.verticalChunck = verticalChunck;
    this.viewableEverywhere = viewableEverywhere;
    this.minScale = minScale;
    this.maxScale = maxScale;
    this.startScale = startScale;
    this.centerX = centerX;
    this.centerY = centerY;
    this.totalWidth = totalWidth;
    this.totalHeight = totalHeight;
    this.zoom = zoom;
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
  public int getOrigineX() {
    return this.origineX;
  }
  public void setOrigineX(int origineX) {
    this.origineX = origineX;
  }
  public int getOrigineY() {
    return this.origineY;
  }
  public void setOrigineY(int origineY) {
    this.origineY = origineY;
  }
  public double getMapWidth() {
    return this.mapWidth;
  }
  public void setMapWidth(double mapWidth) {
    this.mapWidth = mapWidth;
  }
  public double getMapHeight() {
    return this.mapHeight;
  }
  public void setMapHeight(double mapHeight) {
    this.mapHeight = mapHeight;
  }
  public int getHorizontalChunck() {
    return this.horizontalChunck;
  }
  public void setHorizontalChunck(int horizontalChunck) {
    this.horizontalChunck = horizontalChunck;
  }
  public int getVerticalChunck() {
    return this.verticalChunck;
  }
  public void setVerticalChunck(int verticalChunck) {
    this.verticalChunck = verticalChunck;
  }
  public boolean getViewableEverywhere() {
    return this.viewableEverywhere;
  }
  public void setViewableEverywhere(boolean viewableEverywhere) {
    this.viewableEverywhere = viewableEverywhere;
  }
  public double getMinScale() {
    return this.minScale;
  }
  public void setMinScale(double minScale) {
    this.minScale = minScale;
  }
  public double getMaxScale() {
    return this.maxScale;
  }
  public void setMaxScale(double maxScale) {
    this.maxScale = maxScale;
  }
  public double getStartScale() {
    return this.startScale;
  }
  public void setStartScale(double startScale) {
    this.startScale = startScale;
  }
  public int getCenterX() {
    return this.centerX;
  }
  public void setCenterX(int centerX) {
    this.centerX = centerX;
  }
  public int getCenterY() {
    return this.centerY;
  }
  public void setCenterY(int centerY) {
    this.centerY = centerY;
  }
  public int getTotalWidth() {
    return this.totalWidth;
  }
  public void setTotalWidth(int totalWidth) {
    this.totalWidth = totalWidth;
  }
  public int getTotalHeight() {
    return this.totalHeight;
  }
  public void setTotalHeight(int totalHeight) {
    this.totalHeight = totalHeight;
  }
  public String[] getZoom() {
    return this.zoom;
  }
  public void setZoom(String[] zoom) {
    this.zoom = zoom;
  }
}
