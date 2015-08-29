
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TeleporterTypeEnum {
    
        TELEPORTER_ZAAP((byte) 0),
    
        TELEPORTER_SUBWAY((byte) 1),
    
        TELEPORTER_PRISM((byte) 2),
    
    ;

    public final byte value;

    private TeleporterTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<TeleporterTypeEnum> valueOf(byte value) {
        for (TeleporterTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

