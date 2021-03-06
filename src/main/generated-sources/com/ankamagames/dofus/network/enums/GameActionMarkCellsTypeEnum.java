
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GameActionMarkCellsTypeEnum {
    
        CELLS_CIRCLE((byte) 0),
    
        CELLS_CROSS((byte) 1),
    
        CELLS_SQUARE((byte) 2),
    
    ;

    public final byte value;

    private GameActionMarkCellsTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<GameActionMarkCellsTypeEnum> valueOf(byte value) {
        for (GameActionMarkCellsTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

