
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkNpcTradeMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5785;

    
        // i32
        public int npcId;
    

    public ExchangeStartOkNpcTradeMessage() { }

    
        public ExchangeStartOkNpcTradeMessage(int npcId) {
            

            
            this.npcId = npcId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5785;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.npcId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.npcId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeStartOkNpcTradeMessage(" +
        
            
            "npcId=" +
            

            
            this.npcId +
            
        
            ')';
    
    }
}

