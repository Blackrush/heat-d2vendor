
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpouseGetInformationsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6355;

    

    public SpouseGetInformationsMessage() { }

    
        public static final SpouseGetInformationsMessage i = new SpouseGetInformationsMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 6355;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "SpouseGetInformationsMessage";
    
    }
}

