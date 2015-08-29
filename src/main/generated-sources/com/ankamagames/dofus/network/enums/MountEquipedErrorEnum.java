
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum MountEquipedErrorEnum {
    
        UNSET((byte) 0),
    
        SET((byte) 1),
    
        RIDING((byte) 2),
    
    ;

    public final byte value;

    private MountEquipedErrorEnum(byte value) {
        this.value = value;
    }

    public static Optional<MountEquipedErrorEnum> valueOf(byte value) {
        for (MountEquipedErrorEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

