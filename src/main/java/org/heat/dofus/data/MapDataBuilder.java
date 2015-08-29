package org.heat.dofus.data;

import java.util.List;

public class MapDataBuilder {
    private long id;
    private long relativeId;
    private String key;
    private byte type;
    private int subareaId;
    private long topNeighbourId;
    private long rightNeighbourId;
    private long bottomNeighbourId;
    private long leftNeighbourId;
    private int shadowBonusOnEntities;
    private int backgroundColor;
    private int zoomScale;
    private short zoomOffsetX;
    private short zoomOffsetY;
    private boolean usingLowPassFilter;
    private boolean usingReverb;
    private int presetId;
    private List<FixtureData> backgroundFixtures;
    private List<FixtureData> foregroundFixtures;
    private int groundCRC;
    private List<LayerData> layers;
    private List<CellData> cells;

    public MapDataBuilder id(long id) {
        this.id = id;
        return this;
    }

    public MapDataBuilder relativeId(long relativeId) {
        this.relativeId = relativeId;
        return this;
    }

    public MapDataBuilder key(String key) {
        this.key = key;
        return this;
    }

    public MapDataBuilder type(byte type) {
        this.type = type;
        return this;
    }

    public MapDataBuilder subareaId(int subareaId) {
        this.subareaId = subareaId;
        return this;
    }

    public MapDataBuilder topNeighbourId(long topNeighbourId) {
        this.topNeighbourId = topNeighbourId;
        return this;
    }

    public MapDataBuilder rightNeighbourId(long rightNeighbourId) {
        this.rightNeighbourId = rightNeighbourId;
        return this;
    }

    public MapDataBuilder bottomNeighbourId(long bottomNeighbourId) {
        this.bottomNeighbourId = bottomNeighbourId;
        return this;
    }

    public MapDataBuilder leftNeighbourId(long leftNeighbourId) {
        this.leftNeighbourId = leftNeighbourId;
        return this;
    }

    public MapDataBuilder shadowBonusOnEntities(int shadowBonusOnEntities) {
        this.shadowBonusOnEntities = shadowBonusOnEntities;
        return this;
    }

    public MapDataBuilder backgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public MapDataBuilder zoomScale(int zoomScale) {
        this.zoomScale = zoomScale;
        return this;
    }

    public MapDataBuilder zoomOffsetX(short zoomOffsetX) {
        this.zoomOffsetX = zoomOffsetX;
        return this;
    }

    public MapDataBuilder zoomOffsetY(short zoomOffsetY) {
        this.zoomOffsetY = zoomOffsetY;
        return this;
    }

    public MapDataBuilder usingLowPassFilter(boolean usingLowPassFilter) {
        this.usingLowPassFilter = usingLowPassFilter;
        return this;
    }

    public MapDataBuilder usingReverb(boolean usingReverb) {
        this.usingReverb = usingReverb;
        return this;
    }

    public MapDataBuilder presetId(int presetId) {
        this.presetId = presetId;
        return this;
    }

    public MapDataBuilder backgroundFixtures(List<FixtureData> backgroundFixtures) {
        this.backgroundFixtures = backgroundFixtures;
        return this;
    }

    public MapDataBuilder foregroundFixtures(List<FixtureData> foregroundFixtures) {
        this.foregroundFixtures = foregroundFixtures;
        return this;
    }

    public MapDataBuilder groundCRC(int groundCRC) {
        this.groundCRC = groundCRC;
        return this;
    }

    public MapDataBuilder layers(List<LayerData> layers) {
        this.layers = layers;
        return this;
    }

    public MapDataBuilder cells(List<CellData> cells) {
        this.cells = cells;
        return this;
    }

    public MapData build() {
        return new MapData(id, relativeId, key, type, subareaId, topNeighbourId, rightNeighbourId, bottomNeighbourId, leftNeighbourId, shadowBonusOnEntities, backgroundColor, zoomScale, zoomOffsetX, zoomOffsetY, usingLowPassFilter, usingReverb, presetId, backgroundFixtures, foregroundFixtures, groundCRC, layers, cells);
    }
}