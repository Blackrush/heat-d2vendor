
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ConsoleMessageTypeEnum {
    
        CONSOLE_TEXT_MESSAGE((byte) 0),
    
        CONSOLE_INFO_MESSAGE((byte) 1),
    
        CONSOLE_ERR_MESSAGE((byte) 2),
    
    ;

    public final byte value;

    private ConsoleMessageTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<ConsoleMessageTypeEnum> valueOf(byte value) {
        for (ConsoleMessageTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

