
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PartStateEnum {
    
        PART_NOT_INSTALLED((byte) 0),
    
        PART_BEING_UPDATER((byte) 1),
    
        PART_UP_TO_DATE((byte) 2),
    
    ;

    public final byte value;

    private PartStateEnum(byte value) {
        this.value = value;
    }

    public static Optional<PartStateEnum> valueOf(byte value) {
        for (PartStateEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

