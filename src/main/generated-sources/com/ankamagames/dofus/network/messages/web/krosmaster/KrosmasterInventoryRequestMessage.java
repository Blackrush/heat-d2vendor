
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterInventoryRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6344;

    

    public KrosmasterInventoryRequestMessage() { }

    
        public static final KrosmasterInventoryRequestMessage i = new KrosmasterInventoryRequestMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 6344;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "KrosmasterInventoryRequestMessage";
    
    }
}

