
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CrafterDirectoryParamBitEnum {
    
        CRAFT_OPTION_NONE((byte) 0),
    
        CRAFT_OPTION_NOT_FREE((byte) 1),
    
        CRAFT_OPTION_NOT_FREE_EXCEPT_ON_FAIL((byte) 2),
    
        CRAFT_OPTION_RESOURCES_REQUIRED((byte) 4),
    
    ;

    public final byte value;

    private CrafterDirectoryParamBitEnum(byte value) {
        this.value = value;
    }

    public static Optional<CrafterDirectoryParamBitEnum> valueOf(byte value) {
        for (CrafterDirectoryParamBitEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

