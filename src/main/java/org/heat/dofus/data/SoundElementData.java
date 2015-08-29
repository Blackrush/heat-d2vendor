package org.heat.dofus.data;

public class SoundElementData extends ElementData {
    int id;
    short baseVolume;
    int fullVolumeDistance, nullVolumeDistance;
    short minDelayBetweenLoops, maxDelayBetweenLoops;

    public SoundElementData(int id, short baseVolume, int fullVolumeDistance, int nullVolumeDistance, short minDelayBetweenLoops, short maxDelayBetweenLoops) {
        this.id = id;
        this.baseVolume = baseVolume;
        this.fullVolumeDistance = fullVolumeDistance;
        this.nullVolumeDistance = nullVolumeDistance;
        this.minDelayBetweenLoops = minDelayBetweenLoops;
        this.maxDelayBetweenLoops = maxDelayBetweenLoops;
    }

    public int getId() {
        return this.id;
    }

    public short getBaseVolume() {
        return this.baseVolume;
    }

    public int getFullVolumeDistance() {
        return this.fullVolumeDistance;
    }

    public int getNullVolumeDistance() {
        return this.nullVolumeDistance;
    }

    public short getMinDelayBetweenLoops() {
        return this.minDelayBetweenLoops;
    }

    public short getMaxDelayBetweenLoops() {
        return this.maxDelayBetweenLoops;
    }

    public String toString() {
        return "org.heat.dofus.data.SoundElementData(id=" + this.id + ", baseVolume=" + this.baseVolume + ", fullVolumeDistance=" + this.fullVolumeDistance + ", nullVolumeDistance=" + this.nullVolumeDistance + ", minDelayBetweenLoops=" + this.minDelayBetweenLoops + ", maxDelayBetweenLoops=" + this.maxDelayBetweenLoops + ")";
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SoundElementData)) return false;
        final SoundElementData other = (SoundElementData) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getBaseVolume() != other.getBaseVolume()) return false;
        if (this.getFullVolumeDistance() != other.getFullVolumeDistance()) return false;
        if (this.getNullVolumeDistance() != other.getNullVolumeDistance()) return false;
        if (this.getMinDelayBetweenLoops() != other.getMinDelayBetweenLoops()) return false;
        if (this.getMaxDelayBetweenLoops() != other.getMaxDelayBetweenLoops()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getBaseVolume();
        result = result * PRIME + this.getFullVolumeDistance();
        result = result * PRIME + this.getNullVolumeDistance();
        result = result * PRIME + this.getMinDelayBetweenLoops();
        result = result * PRIME + this.getMaxDelayBetweenLoops();
        return result;
    }

    public boolean canEqual(Object other) {
        return other instanceof SoundElementData;
    }
}
