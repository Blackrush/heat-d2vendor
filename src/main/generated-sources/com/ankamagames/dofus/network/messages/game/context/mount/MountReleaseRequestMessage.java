
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountReleaseRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5980;

    

    public MountReleaseRequestMessage() { }

    
        public static final MountReleaseRequestMessage i = new MountReleaseRequestMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 5980;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "MountReleaseRequestMessage";
    
    }
}

