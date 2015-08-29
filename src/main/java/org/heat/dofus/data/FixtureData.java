package org.heat.dofus.data;

public class FixtureData {
    int id;
    short offsetX, offsetY;
    short rotation;
    short scaleX, scaleY;
    int hue;
    short alpha;

    public FixtureData(int id, short offsetX, short offsetY, short rotation, short scaleX, short scaleY, int hue, short alpha) {
        this.id = id;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.rotation = rotation;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.hue = hue;
        this.alpha = alpha;
    }

    public int getId() {
        return this.id;
    }

    public short getOffsetX() {
        return this.offsetX;
    }

    public short getOffsetY() {
        return this.offsetY;
    }

    public short getRotation() {
        return this.rotation;
    }

    public short getScaleX() {
        return this.scaleX;
    }

    public short getScaleY() {
        return this.scaleY;
    }

    public int getHue() {
        return this.hue;
    }

    public short getAlpha() {
        return this.alpha;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FixtureData)) return false;
        final FixtureData other = (FixtureData) o;
        if (this.id != other.id) return false;
        if (this.offsetX != other.offsetX) return false;
        if (this.offsetY != other.offsetY) return false;
        if (this.rotation != other.rotation) return false;
        if (this.scaleX != other.scaleX) return false;
        if (this.scaleY != other.scaleY) return false;
        if (this.hue != other.hue) return false;
        if (this.alpha != other.alpha) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.id;
        result = result * PRIME + this.offsetX;
        result = result * PRIME + this.offsetY;
        result = result * PRIME + this.rotation;
        result = result * PRIME + this.scaleX;
        result = result * PRIME + this.scaleY;
        result = result * PRIME + this.hue;
        result = result * PRIME + this.alpha;
        return result;
    }

    public String toString() {
        return "org.heat.dofus.data.FixtureData(id=" + this.id + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", rotation=" + this.rotation + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", hue=" + this.hue + ", alpha=" + this.alpha + ")";
    }
}
