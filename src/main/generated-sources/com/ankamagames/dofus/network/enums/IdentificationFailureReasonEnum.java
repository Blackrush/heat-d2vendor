
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum IdentificationFailureReasonEnum {
    
        BAD_VERSION((byte) 1),
    
        WRONG_CREDENTIALS((byte) 2),
    
        BANNED((byte) 3),
    
        KICKED((byte) 4),
    
        IN_MAINTENANCE((byte) 5),
    
        TOO_MANY_ON_IP((byte) 6),
    
        TIME_OUT((byte) 7),
    
        BAD_IPRANGE((byte) 8),
    
        CREDENTIALS_RESET((byte) 9),
    
        EMAIL_UNVALIDATED((byte) 10),
    
        OTP_TIMEOUT((byte) 11),
    
        SERVICE_UNAVAILABLE((byte) 53),
    
        UNKNOWN_AUTH_ERROR((byte) 99),
    
        SPARE((byte) 100),
    
    ;

    public final byte value;

    private IdentificationFailureReasonEnum(byte value) {
        this.value = value;
    }

    public static Optional<IdentificationFailureReasonEnum> valueOf(byte value) {
        for (IdentificationFailureReasonEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

