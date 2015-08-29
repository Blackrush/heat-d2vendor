
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PresetDeleteResultEnum {
    
        PRESET_DEL_OK((byte) 1),
    
        PRESET_DEL_ERR_UNKNOWN((byte) 2),
    
        PRESET_DEL_ERR_BAD_PRESET_ID((byte) 3),
    
    ;

    public final byte value;

    private PresetDeleteResultEnum(byte value) {
        this.value = value;
    }

    public static Optional<PresetDeleteResultEnum> valueOf(byte value) {
        for (PresetDeleteResultEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

