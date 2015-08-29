
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GameActionMarkTypeEnum {
    
        GLYPH((byte) 1),
    
        TRAP((byte) 2),
    
        WALL((byte) 3),
    
        PORTAL((byte) 4),
    
    ;

    public final byte value;

    private GameActionMarkTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<GameActionMarkTypeEnum> valueOf(byte value) {
        for (GameActionMarkTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

