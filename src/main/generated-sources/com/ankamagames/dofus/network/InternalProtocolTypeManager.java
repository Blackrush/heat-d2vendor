
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network;

public final class InternalProtocolTypeManager {
    private InternalProtocolTypeManager() {}

    private static final ProtocolTypeManager INSTANCE = ProtocolTypeManager.createNewManager();

    @Deprecated
    public static Object get(int id) {
        return INSTANCE.create(id).get();
    }
}
