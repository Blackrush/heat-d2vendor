
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockSellRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5953;

    
        // vi32
        public int price;
    

    public PaddockSellRequestMessage() { }

    
        public PaddockSellRequestMessage(int price) {
            

            
            this.price = price;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5953;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.price);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.price = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockSellRequestMessage(" +
        
            
            "price=" +
            

            
            this.price +
            
        
            ')';
    
    }
}

