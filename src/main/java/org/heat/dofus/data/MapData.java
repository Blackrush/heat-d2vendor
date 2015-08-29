package org.heat.dofus.data;

import java.util.List;
import java.util.Optional;

public class MapData {
    long id, relativeId;
    String key;
    byte type;
    int subareaId;
    long topNeighbourId, rightNeighbourId, bottomNeighbourId, leftNeighbourId;
    int shadowBonusOnEntities;
    int backgroundColor;
    int zoomScale;
    short zoomOffsetX, zoomOffsetY;
    boolean usingLowPassFilter, usingReverb;
    int presetId;

    List<FixtureData> backgroundFixtures, foregroundFixtures;

    int groundCRC;

    List<LayerData> layers;
    List<CellData> cells;

    public MapData(long id, long relativeId, String key, byte type, int subareaId, long topNeighbourId, long rightNeighbourId, long bottomNeighbourId, long leftNeighbourId, int shadowBonusOnEntities, int backgroundColor, int zoomScale, short zoomOffsetX, short zoomOffsetY, boolean usingLowPassFilter, boolean usingReverb, int presetId, List<FixtureData> backgroundFixtures, List<FixtureData> foregroundFixtures, int groundCRC, List<LayerData> layers, List<CellData> cells) {
        this.id = id;
        this.relativeId = relativeId;
        this.key = key;
        this.type = type;
        this.subareaId = subareaId;
        this.topNeighbourId = topNeighbourId;
        this.rightNeighbourId = rightNeighbourId;
        this.bottomNeighbourId = bottomNeighbourId;
        this.leftNeighbourId = leftNeighbourId;
        this.shadowBonusOnEntities = shadowBonusOnEntities;
        this.backgroundColor = backgroundColor;
        this.zoomScale = zoomScale;
        this.zoomOffsetX = zoomOffsetX;
        this.zoomOffsetY = zoomOffsetY;
        this.usingLowPassFilter = usingLowPassFilter;
        this.usingReverb = usingReverb;
        this.presetId = presetId;
        this.backgroundFixtures = backgroundFixtures;
        this.foregroundFixtures = foregroundFixtures;
        this.groundCRC = groundCRC;
        this.layers = layers;
        this.cells = cells;
    }

    public boolean isUsingNewMovementSystem() {
        Optional<CellData> opt = cells.stream().findAny();
        if (opt.isPresent()) {
            // PARALLEL STREAM BITCH !!11111
            long mz = opt.get().getMoveZone();
            return cells.parallelStream().allMatch(it -> it.getMoveZone() == mz);
        } else {
            return false;
        }
    }

    public long getId() {
        return this.id;
    }

    public long getRelativeId() {
        return this.relativeId;
    }

    public String getKey() {
        return this.key;
    }

    public byte getType() {
        return this.type;
    }

    public int getSubareaId() {
        return this.subareaId;
    }

    public long getTopNeighbourId() {
        return this.topNeighbourId;
    }

    public long getRightNeighbourId() {
        return this.rightNeighbourId;
    }

    public long getBottomNeighbourId() {
        return this.bottomNeighbourId;
    }

    public long getLeftNeighbourId() {
        return this.leftNeighbourId;
    }

    public int getShadowBonusOnEntities() {
        return this.shadowBonusOnEntities;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getZoomScale() {
        return this.zoomScale;
    }

    public short getZoomOffsetX() {
        return this.zoomOffsetX;
    }

    public short getZoomOffsetY() {
        return this.zoomOffsetY;
    }

    public boolean isUsingLowPassFilter() {
        return this.usingLowPassFilter;
    }

    public boolean isUsingReverb() {
        return this.usingReverb;
    }

    public int getPresetId() {
        return this.presetId;
    }

        public List<FixtureData> getBackgroundFixtures() {
        return this.backgroundFixtures;
    }

        public List<FixtureData> getForegroundFixtures() {
        return this.foregroundFixtures;
    }

    public int getGroundCRC() {
        return this.groundCRC;
    }

        public List<LayerData> getLayers() {
        return this.layers;
    }

        public List<CellData> getCells() {
        return this.cells;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MapData)) return false;
        final MapData other = (MapData) o;
        return this.id == other.id;
    }

    public int hashCode() {
        final long $id = this.id;
        return (int) ($id >>> 32 ^ $id);
    }

    public String toString() {
        return "MapData(id=" + this.id + ", relativeId=" + this.relativeId + ", type=" + this.type + ", subareaId=" + this.subareaId + ", topNeighbourId=" + this.topNeighbourId + ", rightNeighbourId=" + this.rightNeighbourId + ", bottomNeighbourId=" + this.bottomNeighbourId + ", leftNeighbourId=" + this.leftNeighbourId + ")";
    }
}
