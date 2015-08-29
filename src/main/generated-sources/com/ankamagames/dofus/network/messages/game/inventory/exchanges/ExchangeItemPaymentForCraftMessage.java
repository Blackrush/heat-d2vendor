
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeItemPaymentForCraftMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5831;

    
        // bool
        public boolean onlySuccess;
    
        // com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer
        public com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer object;
    

    public ExchangeItemPaymentForCraftMessage() { }

    
        public ExchangeItemPaymentForCraftMessage(boolean onlySuccess, com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer object) {
            

            
            this.onlySuccess = onlySuccess;
            
            this.object = object;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5831;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.onlySuccess);
            

            

            

            
        
            

            

            

            
                
            this.object.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.onlySuccess = reader.read_bool();
            

            

            

            
        
            

            

            
                
                    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer();
                
                this.object.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeItemPaymentForCraftMessage(" +
        
            
            "onlySuccess=" +
            

            
            this.onlySuccess +
            
        
            
            ", object=" +
            

            
            this.object +
            
        
            ')';
    
    }
}

