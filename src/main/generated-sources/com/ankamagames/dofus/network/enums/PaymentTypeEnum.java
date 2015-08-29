
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PaymentTypeEnum {
    
        PAYMENT_ON_SUCCESS_ONLY((byte) 0),
    
        PAYMENT_IN_ANY_CASE((byte) 1),
    
    ;

    public final byte value;

    private PaymentTypeEnum(byte value) {
        this.value = value;
    }

    public static Optional<PaymentTypeEnum> valueOf(byte value) {
        for (PaymentTypeEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

