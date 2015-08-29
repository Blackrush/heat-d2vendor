
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeReplayCountModifiedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6023;

    
        // vi32
        public int count;
    

    public ExchangeReplayCountModifiedMessage() { }

    
        public ExchangeReplayCountModifiedMessage(int count) {
            

            
            this.count = count;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6023;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.count);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.count = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeReplayCountModifiedMessage(" +
        
            
            "count=" +
            

            
            this.count +
            
        
            ')';
    
    }
}

