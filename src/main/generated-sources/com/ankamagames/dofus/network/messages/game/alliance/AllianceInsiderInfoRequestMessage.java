
// Created by Heat the 2015-03-01 20:21:53+01:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInsiderInfoRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6417;

    

    public AllianceInsiderInfoRequestMessage() { }

    
        public static final AllianceInsiderInfoRequestMessage i = new AllianceInsiderInfoRequestMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 6417;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "AllianceInsiderInfoRequestMessage";
    
    }
}

