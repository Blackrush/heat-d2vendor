
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NumericWhoIsRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6298;

    
        // vi32
        public int playerId;
    

    public NumericWhoIsRequestMessage() { }

    
        public NumericWhoIsRequestMessage(int playerId) {
            

            
            this.playerId = playerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6298;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "NumericWhoIsRequestMessage(" +
        
            
            "playerId=" +
            

            
            this.playerId +
            
        
            ')';
    
    }
}

