
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum MapObstacleStateEnum {
    
        OBSTACLE_OPENED((byte) 1),
    
        OBSTACLE_CLOSED((byte) 2),
    
    ;

    public final byte value;

    private MapObstacleStateEnum(byte value) {
        this.value = value;
    }

    public static Optional<MapObstacleStateEnum> valueOf(byte value) {
        for (MapObstacleStateEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

