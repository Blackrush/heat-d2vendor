
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceCreationStartedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6394;

    

    public AllianceCreationStartedMessage() { }

    
        public static final AllianceCreationStartedMessage i = new AllianceCreationStartedMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 6394;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "AllianceCreationStartedMessage";
    
    }
}

