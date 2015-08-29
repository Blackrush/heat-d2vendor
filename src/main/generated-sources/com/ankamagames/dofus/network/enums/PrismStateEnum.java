
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PrismStateEnum {
    
        PRISM_STATE_INVULNERABLE((byte) 0),
    
        PRISM_STATE_NORMAL((byte) 1),
    
        PRISM_STATE_ATTACKED((byte) 2),
    
        PRISM_STATE_FIGHTING((byte) 3),
    
        PRISM_STATE_WEAKENED((byte) 4),
    
        PRISM_STATE_VULNERABLE((byte) 5),
    
        PRISM_STATE_DEFEATED((byte) 6),
    
        PRISM_STATE_SABOTAGED((byte) 7),
    
    ;

    public final byte value;

    private PrismStateEnum(byte value) {
        this.value = value;
    }

    public static Optional<PrismStateEnum> valueOf(byte value) {
        for (PrismStateEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

