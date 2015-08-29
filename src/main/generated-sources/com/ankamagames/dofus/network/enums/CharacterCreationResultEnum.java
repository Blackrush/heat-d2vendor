
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CharacterCreationResultEnum {
    
        OK((byte) 0),
    
        ERR_NO_REASON((byte) 1),
    
        ERR_INVALID_NAME((byte) 2),
    
        ERR_NAME_ALREADY_EXISTS((byte) 3),
    
        ERR_TOO_MANY_CHARACTERS((byte) 4),
    
        ERR_NOT_ALLOWED((byte) 5),
    
        ERR_NEW_PLAYER_NOT_ALLOWED((byte) 6),
    
        ERR_RESTRICED_ZONE((byte) 7),
    
    ;

    public final byte value;

    private CharacterCreationResultEnum(byte value) {
        this.value = value;
    }

    public static Optional<CharacterCreationResultEnum> valueOf(byte value) {
        for (CharacterCreationResultEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

