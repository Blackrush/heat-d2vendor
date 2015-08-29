
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum UpdatableMountBoostEnum {
    
        STAMINA((byte) 3),
    
        MATURITY((byte) 5),
    
        ENERGY((byte) 1),
    
        SERENITY((byte) 2),
    
        LOVE((byte) 4),
    
        TIREDNESS((byte) 6),
    
    ;

    public final byte value;

    private UpdatableMountBoostEnum(byte value) {
        this.value = value;
    }

    public static Optional<UpdatableMountBoostEnum> valueOf(byte value) {
        for (UpdatableMountBoostEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

