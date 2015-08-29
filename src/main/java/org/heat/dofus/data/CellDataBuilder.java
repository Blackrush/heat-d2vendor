package org.heat.dofus.data;

public class CellDataBuilder {
    private short floor;
    private byte losmov;
    private byte speed;
    private short mapChangeData;
    private long moveZone;
    private boolean useTopArrow;
    private boolean useBottomArrow;
    private boolean useLeftArrow;
    private boolean useRightArrow;
    private boolean los;
    private boolean mov;
    private boolean visible;
    private boolean farmCell;
    private boolean blue;
    private boolean red;
    private boolean nonWalkableDuringRP;
    private boolean nonWalkableDuringFight;

    public CellDataBuilder floor(short floor) {
        this.floor = floor;
        return this;
    }

    public CellDataBuilder losmov(byte losmov) {
        this.losmov = losmov;
        return this;
    }

    public CellDataBuilder speed(byte speed) {
        this.speed = speed;
        return this;
    }

    public CellDataBuilder mapChangeData(short mapChangeData) {
        this.mapChangeData = mapChangeData;
        return this;
    }

    public CellDataBuilder moveZone(long moveZone) {
        this.moveZone = moveZone;
        return this;
    }

    public CellDataBuilder useTopArrow(boolean useTopArrow) {
        this.useTopArrow = useTopArrow;
        return this;
    }

    public CellDataBuilder useBottomArrow(boolean useBottomArrow) {
        this.useBottomArrow = useBottomArrow;
        return this;
    }

    public CellDataBuilder useLeftArrow(boolean useLeftArrow) {
        this.useLeftArrow = useLeftArrow;
        return this;
    }

    public CellDataBuilder useRightArrow(boolean useRightArrow) {
        this.useRightArrow = useRightArrow;
        return this;
    }

    public CellDataBuilder los(boolean los) {
        this.los = los;
        return this;
    }

    public CellDataBuilder mov(boolean mov) {
        this.mov = mov;
        return this;
    }

    public CellDataBuilder visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public CellDataBuilder farmCell(boolean farmCell) {
        this.farmCell = farmCell;
        return this;
    }

    public CellDataBuilder blue(boolean blue) {
        this.blue = blue;
        return this;
    }

    public CellDataBuilder red(boolean red) {
        this.red = red;
        return this;
    }

    public CellDataBuilder nonWalkableDuringRP(boolean nonWalkableDuringRP) {
        this.nonWalkableDuringRP = nonWalkableDuringRP;
        return this;
    }

    public CellDataBuilder nonWalkableDuringFight(boolean nonWalkableDuringFight) {
        this.nonWalkableDuringFight = nonWalkableDuringFight;
        return this;
    }

    public CellData build() {
        return new CellData(floor, losmov, speed, mapChangeData, moveZone, useTopArrow, useBottomArrow, useLeftArrow, useRightArrow, los, mov, visible, farmCell, blue, red, nonWalkableDuringRP, nonWalkableDuringFight);
    }
}