package org.heat.dofus.data;

public class GraphicalElementDataBuilder {
    private long id;
    private int hue;
    private int shadow;
    private short offsetX;
    private short offsetY;
    private short pixelOffsetX;
    private short pixelOffsetY;
    private byte altitude;
    private long identifier;

    public GraphicalElementDataBuilder id(long id) {
        this.id = id;
        return this;
    }

    public GraphicalElementDataBuilder hue(int hue) {
        this.hue = hue;
        return this;
    }

    public GraphicalElementDataBuilder shadow(int shadow) {
        this.shadow = shadow;
        return this;
    }

    public GraphicalElementDataBuilder offsetX(short offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public GraphicalElementDataBuilder offsetY(short offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public GraphicalElementDataBuilder pixelOffsetX(short pixelOffsetX) {
        this.pixelOffsetX = pixelOffsetX;
        return this;
    }

    public GraphicalElementDataBuilder pixelOffsetY(short pixelOffsetY) {
        this.pixelOffsetY = pixelOffsetY;
        return this;
    }

    public GraphicalElementDataBuilder altitude(byte altitude) {
        this.altitude = altitude;
        return this;
    }

    public GraphicalElementDataBuilder identifier(long identifier) {
        this.identifier = identifier;
        return this;
    }

    public GraphicalElementData build() {
        return new GraphicalElementData(id, hue, shadow, offsetX, offsetY, pixelOffsetX, pixelOffsetY, altitude, identifier);
    }
}