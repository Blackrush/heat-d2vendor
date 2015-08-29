package com.ankamagames.dofus.datacenter.world;


public class MapCoordinates
    implements java.io.Serializable {
  public int compressedCoords;
  public int[] mapIds;
  public MapCoordinates() {
  }
  public MapCoordinates(int compressedCoords, int[] mapIds) {
    this.compressedCoords = compressedCoords;
    this.mapIds = mapIds;
  }

  public int getCompressedCoords() {
    return this.compressedCoords;
  }
  public void setCompressedCoords(int compressedCoords) {
    this.compressedCoords = compressedCoords;
  }
  public int[] getMapIds() {
    return this.mapIds;
  }
  public void setMapIds(int[] mapIds) {
    this.mapIds = mapIds;
  }
}
