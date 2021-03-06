
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeKamaModifiedMessage extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
    public static final int PROTOCOL_ID = 5521;

    
        // vi32
        public int quantity;
    

    public ExchangeKamaModifiedMessage() { }

    
        public ExchangeKamaModifiedMessage(boolean remote, int quantity) {
            
            super(remote);
            

            
            this.quantity = quantity;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5521;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.quantity);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.quantity = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeKamaModifiedMessage(" +
        
            
            "remote=" +
            

            
            this.remote +
            
        
            
            ", quantity=" +
            

            
            this.quantity +
            
        
            ')';
    
    }
}

