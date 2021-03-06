
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TreasureHuntFlagStateEnum {
    
        TREASURE_HUNT_FLAG_STATE_UNKNOWN((byte) 0),
    
        TREASURE_HUNT_FLAG_STATE_OK((byte) 1),
    
        TREASURE_HUNT_FLAG_STATE_WRONG((byte) 2),
    
    ;

    public final byte value;

    private TreasureHuntFlagStateEnum(byte value) {
        this.value = value;
    }

    public static Optional<TreasureHuntFlagStateEnum> valueOf(byte value) {
        for (TreasureHuntFlagStateEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

