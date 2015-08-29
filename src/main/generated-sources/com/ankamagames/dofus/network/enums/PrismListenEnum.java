
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PrismListenEnum {
    
        PRISM_LISTEN_NONE((byte) 0),
    
        PRISM_LISTEN_MINE((byte) 1),
    
        PRISM_LISTEN_ALL((byte) 2),
    
    ;

    public final byte value;

    private PrismListenEnum(byte value) {
        this.value = value;
    }

    public static Optional<PrismListenEnum> valueOf(byte value) {
        for (PrismListenEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

