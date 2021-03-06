
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PlayableBreedEnum {
    
        UNDEFINED((byte) 0),
    
        Feca((byte) 1),
    
        Osamodas((byte) 2),
    
        Enutrof((byte) 3),
    
        Sram((byte) 4),
    
        Xelor((byte) 5),
    
        Ecaflip((byte) 6),
    
        Eniripsa((byte) 7),
    
        Iop((byte) 8),
    
        Cra((byte) 9),
    
        Sadida((byte) 10),
    
        Sacrieur((byte) 11),
    
        Pandawa((byte) 12),
    
        Roublard((byte) 13),
    
        Zobal((byte) 14),
    
        Steamer((byte) 15),
    
        Eliotrope((byte) 16),
    
    ;

    public final byte value;

    private PlayableBreedEnum(byte value) {
        this.value = value;
    }

    public static Optional<PlayableBreedEnum> valueOf(byte value) {
        for (PlayableBreedEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}

