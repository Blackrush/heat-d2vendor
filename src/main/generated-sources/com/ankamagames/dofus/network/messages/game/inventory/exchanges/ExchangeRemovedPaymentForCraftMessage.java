
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeRemovedPaymentForCraftMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6031;

    
        // bool
        public boolean onlySuccess;
    
        // vi32
        public int objectUID;
    

    public ExchangeRemovedPaymentForCraftMessage() { }

    
        public ExchangeRemovedPaymentForCraftMessage(boolean onlySuccess, int objectUID) {
            

            
            this.onlySuccess = onlySuccess;
            
            this.objectUID = objectUID;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6031;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.onlySuccess);
            

            

            

            
        
            
                writer.write_vi32(this.objectUID);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.onlySuccess = reader.read_bool();
            

            

            

            
        
            
                this.objectUID = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeRemovedPaymentForCraftMessage(" +
        
            
            "onlySuccess=" +
            

            
            this.onlySuccess +
            
        
            
            ", objectUID=" +
            

            
            this.objectUID +
            
        
            ')';
    
    }
}

