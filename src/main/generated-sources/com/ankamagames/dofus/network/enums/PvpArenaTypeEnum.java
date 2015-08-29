
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PvpArenaTypeEnum {
    
        ARENA_TYPE_3VS3((byte) 3),
    
        ARENA_TYPE_5VS5((byte) 5),
    
    ;

    public final byte value;

    private PvpArenaTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<PvpArenaTypeEnum> valueOf(byte value) {
        for (PvpArenaTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

