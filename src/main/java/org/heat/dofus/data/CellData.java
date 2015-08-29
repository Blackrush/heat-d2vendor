package org.heat.dofus.data;

public class CellData {
    short floor;
    byte losmov;
    byte speed;
    short mapChangeData;
    long moveZone;
    boolean useTopArrow, useBottomArrow, useLeftArrow, useRightArrow,
            los, mov, visible, farmCell,
            blue, red, nonWalkableDuringRP, nonWalkableDuringFight;

    public CellData(short floor, byte losmov, byte speed, short mapChangeData, long moveZone, boolean useTopArrow, boolean useBottomArrow, boolean useLeftArrow, boolean useRightArrow, boolean los, boolean mov, boolean visible, boolean farmCell, boolean blue, boolean red, boolean nonWalkableDuringRP, boolean nonWalkableDuringFight) {
        this.floor = floor;
        this.losmov = losmov;
        this.speed = speed;
        this.mapChangeData = mapChangeData;
        this.moveZone = moveZone;
        this.useTopArrow = useTopArrow;
        this.useBottomArrow = useBottomArrow;
        this.useLeftArrow = useLeftArrow;
        this.useRightArrow = useRightArrow;
        this.los = los;
        this.mov = mov;
        this.visible = visible;
        this.farmCell = farmCell;
        this.blue = blue;
        this.red = red;
        this.nonWalkableDuringRP = nonWalkableDuringRP;
        this.nonWalkableDuringFight = nonWalkableDuringFight;
    }

    public short getFloor() {
        return this.floor;
    }

    public byte getLosmov() {
        return this.losmov;
    }

    public byte getSpeed() {
        return this.speed;
    }

    public short getMapChangeData() {
        return this.mapChangeData;
    }

    public long getMoveZone() {
        return this.moveZone;
    }

    public boolean isUseTopArrow() {
        return this.useTopArrow;
    }

    public boolean isUseBottomArrow() {
        return this.useBottomArrow;
    }

    public boolean isUseLeftArrow() {
        return this.useLeftArrow;
    }

    public boolean isUseRightArrow() {
        return this.useRightArrow;
    }

    public boolean isLos() {
        return this.los;
    }

    public boolean isMov() {
        return this.mov;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public boolean isFarmCell() {
        return this.farmCell;
    }

    public boolean isBlue() {
        return this.blue;
    }

    public boolean isRed() {
        return this.red;
    }

    public boolean isNonWalkableDuringRP() {
        return this.nonWalkableDuringRP;
    }

    public boolean isNonWalkableDuringFight() {
        return this.nonWalkableDuringFight;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CellData)) return false;
        final CellData other = (CellData) o;
        if (this.floor != other.floor) return false;
        if (this.losmov != other.losmov) return false;
        if (this.speed != other.speed) return false;
        if (this.mapChangeData != other.mapChangeData) return false;
        if (this.moveZone != other.moveZone) return false;
        if (this.useTopArrow != other.useTopArrow) return false;
        if (this.useBottomArrow != other.useBottomArrow) return false;
        if (this.useLeftArrow != other.useLeftArrow) return false;
        if (this.useRightArrow != other.useRightArrow) return false;
        if (this.los != other.los) return false;
        if (this.mov != other.mov) return false;
        if (this.visible != other.visible) return false;
        if (this.farmCell != other.farmCell) return false;
        if (this.blue != other.blue) return false;
        if (this.red != other.red) return false;
        if (this.nonWalkableDuringRP != other.nonWalkableDuringRP) return false;
        if (this.nonWalkableDuringFight != other.nonWalkableDuringFight) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.floor;
        result = result * PRIME + this.losmov;
        result = result * PRIME + this.speed;
        result = result * PRIME + this.mapChangeData;
        final long $moveZone = this.moveZone;
        result = result * PRIME + (int) ($moveZone >>> 32 ^ $moveZone);
        result = ((result * PRIME) + (this.useTopArrow ? 79 : 97));
        result = ((result * PRIME) + (this.useBottomArrow ? 79 : 97));
        result = ((result * PRIME) + (this.useLeftArrow ? 79 : 97));
        result = ((result * PRIME) + (this.useRightArrow ? 79 : 97));
        result = ((result * PRIME) + (this.los ? 79 : 97));
        result = ((result * PRIME) + (this.mov ? 79 : 97));
        result = ((result * PRIME) + (this.visible ? 79 : 97));
        result = ((result * PRIME) + (this.farmCell ? 79 : 97));
        result = ((result * PRIME) + (this.blue ? 79 : 97));
        result = ((result * PRIME) + (this.red ? 79 : 97));
        result = ((result * PRIME) + (this.nonWalkableDuringRP ? 79 : 97));
        result = ((result * PRIME) + (this.nonWalkableDuringFight ? 79 : 97));
        return result;
    }

    public String toString() {
        return "CellData(floor=" + this.floor + ", losmov=" + this.losmov + ", speed=" + this.speed + ", mapChangeData=" + this.mapChangeData + ", moveZone=" + this.moveZone + ", useTopArrow=" + this.useTopArrow + ", useBottomArrow=" + this.useBottomArrow + ", useLeftArrow=" + this.useLeftArrow + ", useRightArrow=" + this.useRightArrow + ", los=" + this.los + ", mov=" + this.mov + ", visible=" + this.visible + ", farmCell=" + this.farmCell + ", blue=" + this.blue + ", red=" + this.red + ", nonWalkableDuringRP=" + this.nonWalkableDuringRP + ", nonWalkableDuringFight=" + this.nonWalkableDuringFight + ")";
    }
}
