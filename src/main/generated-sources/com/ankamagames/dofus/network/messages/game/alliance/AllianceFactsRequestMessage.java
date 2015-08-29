
// Created by Heat the 2015-03-01 20:21:53+01:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceFactsRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6409;

    
        // vi32
        public int allianceId;
    

    public AllianceFactsRequestMessage() { }

    
        public AllianceFactsRequestMessage(int allianceId) {
            

            
            this.allianceId = allianceId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6409;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.allianceId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.allianceId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AllianceFactsRequestMessage(" +
        
            
            "allianceId=" +
            

            
            this.allianceId +
            
        
            ')';
    
    }
}

