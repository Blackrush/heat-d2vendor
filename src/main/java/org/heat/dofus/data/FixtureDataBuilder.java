package org.heat.dofus.data;

public class FixtureDataBuilder {
    private int id;
    private short offsetX;
    private short offsetY;
    private short rotation;
    private short scaleX;
    private short scaleY;
    private int hue;
    private short alpha;

    public FixtureDataBuilder id(int id) {
        this.id = id;
        return this;
    }

    public FixtureDataBuilder offsetX(short offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public FixtureDataBuilder offsetY(short offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public FixtureDataBuilder rotation(short rotation) {
        this.rotation = rotation;
        return this;
    }

    public FixtureDataBuilder scaleX(short scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    public FixtureDataBuilder scaleY(short scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    public FixtureDataBuilder hue(int hue) {
        this.hue = hue;
        return this;
    }

    public FixtureDataBuilder alpha(short alpha) {
        this.alpha = alpha;
        return this;
    }

    public FixtureData build() {
        return new FixtureData(id, offsetX, offsetY, rotation, scaleX, scaleY, hue, alpha);
    }
}