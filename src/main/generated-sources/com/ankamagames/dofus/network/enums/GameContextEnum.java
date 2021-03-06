
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GameContextEnum {
    
        ROLE_PLAY((byte) 1),
    
        FIGHT((byte) 2),
    
    ;

    public final byte value;

    private GameContextEnum(byte value) {
        this.value = value;
    }

    public static Optional<GameContextEnum> valueOf(byte value) {
        for (GameContextEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

