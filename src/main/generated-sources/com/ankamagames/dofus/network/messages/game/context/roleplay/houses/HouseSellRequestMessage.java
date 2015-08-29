
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSellRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5697;

    
        // vi32
        public int amount;
    

    public HouseSellRequestMessage() { }

    
        public HouseSellRequestMessage(int amount) {
            

            
            this.amount = amount;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5697;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.amount);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.amount = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseSellRequestMessage(" +
        
            
            "amount=" +
            

            
            this.amount +
            
        
            ')';
    
    }
}

