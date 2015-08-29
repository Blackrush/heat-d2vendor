
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ServerConnectionErrorEnum {
    
        SERVER_CONNECTION_ERROR_DUE_TO_STATUS((byte) 0),
    
        SERVER_CONNECTION_ERROR_NO_REASON((byte) 1),
    
        SERVER_CONNECTION_ERROR_ACCOUNT_RESTRICTED((byte) 2),
    
        SERVER_CONNECTION_ERROR_COMMUNITY_RESTRICTED((byte) 3),
    
        SERVER_CONNECTION_ERROR_LOCATION_RESTRICTED((byte) 4),
    
        SERVER_CONNECTION_ERROR_SUBSCRIBERS_ONLY((byte) 5),
    
        SERVER_CONNECTION_ERROR_REGULAR_PLAYERS_ONLY((byte) 6),
    
    ;

    public final byte value;

    private ServerConnectionErrorEnum(byte value) {
        this.value = value;
    }

    public static Optional<ServerConnectionErrorEnum> valueOf(byte value) {
        for (ServerConnectionErrorEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

