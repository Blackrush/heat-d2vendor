
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CraftResultEnum {
    
        CRAFT_IMPOSSIBLE((byte) 0),
    
        CRAFT_FAILED((byte) 1),
    
        CRAFT_SUCCESS((byte) 2),
    
        CRAFT_NEUTRAL((byte) 3),
    
    ;

    public final byte value;

    private CraftResultEnum(byte value) {
        this.value = value;
    }

    public static Optional<CraftResultEnum> valueOf(byte value) {
        for (CraftResultEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

