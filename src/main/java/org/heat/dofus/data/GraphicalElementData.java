package org.heat.dofus.data;

public class GraphicalElementData extends ElementData {
    long id;
    int hue, shadow;
    short offsetX, offsetY, pixelOffsetX, pixelOffsetY;
    byte altitude;
    long identifier;

    public GraphicalElementData(long id, int hue, int shadow, short offsetX, short offsetY, short pixelOffsetX, short pixelOffsetY, byte altitude, long identifier) {
        this.id = id;
        this.hue = hue;
        this.shadow = shadow;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.pixelOffsetX = pixelOffsetX;
        this.pixelOffsetY = pixelOffsetY;
        this.altitude = altitude;
        this.identifier = identifier;
    }

    public long getId() {
        return this.id;
    }

    public int getHue() {
        return this.hue;
    }

    public int getShadow() {
        return this.shadow;
    }

    public short getOffsetX() {
        return this.offsetX;
    }

    public short getOffsetY() {
        return this.offsetY;
    }

    public short getPixelOffsetX() {
        return this.pixelOffsetX;
    }

    public short getPixelOffsetY() {
        return this.pixelOffsetY;
    }

    public byte getAltitude() {
        return this.altitude;
    }

    public long getIdentifier() {
        return this.identifier;
    }

    public String toString() {
        return "org.heat.dofus.data.GraphicalElementData(id=" + this.id + ", hue=" + this.hue + ", shadow=" + this.shadow + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", pixelOffsetX=" + this.pixelOffsetX + ", pixelOffsetY=" + this.pixelOffsetY + ", altitude=" + this.altitude + ", identifier=" + this.identifier + ")";
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GraphicalElementData)) return false;
        final GraphicalElementData other = (GraphicalElementData) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getHue() != other.getHue()) return false;
        if (this.getShadow() != other.getShadow()) return false;
        if (this.getOffsetX() != other.getOffsetX()) return false;
        if (this.getOffsetY() != other.getOffsetY()) return false;
        if (this.getPixelOffsetX() != other.getPixelOffsetX()) return false;
        if (this.getPixelOffsetY() != other.getPixelOffsetY()) return false;
        if (this.getAltitude() != other.getAltitude()) return false;
        if (this.getIdentifier() != other.getIdentifier()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        result = result * PRIME + this.getHue();
        result = result * PRIME + this.getShadow();
        result = result * PRIME + this.getOffsetX();
        result = result * PRIME + this.getOffsetY();
        result = result * PRIME + this.getPixelOffsetX();
        result = result * PRIME + this.getPixelOffsetY();
        result = result * PRIME + this.getAltitude();
        final long $identifier = this.getIdentifier();
        result = result * PRIME + (int) ($identifier >>> 32 ^ $identifier);
        return result;
    }

    public boolean canEqual(Object other) {
        return other instanceof GraphicalElementData;
    }
}
