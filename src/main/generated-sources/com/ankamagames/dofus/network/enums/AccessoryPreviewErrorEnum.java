
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum AccessoryPreviewErrorEnum {
    
        PREVIEW_ERROR((byte) 0),
    
        PREVIEW_COOLDOWN((byte) 1),
    
        PREVIEW_BAD_ITEM((byte) 2),
    
    ;

    public final byte value;

    private AccessoryPreviewErrorEnum(byte value) {
        this.value = value;
    }

    public static Optional<AccessoryPreviewErrorEnum> valueOf(byte value) {
        for (AccessoryPreviewErrorEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

