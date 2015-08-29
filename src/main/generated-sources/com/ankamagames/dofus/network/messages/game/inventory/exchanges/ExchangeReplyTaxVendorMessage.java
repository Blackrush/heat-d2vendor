
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeReplyTaxVendorMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5787;

    
        // vi32
        public int objectValue;
    
        // vi32
        public int totalTaxValue;
    

    public ExchangeReplyTaxVendorMessage() { }

    
        public ExchangeReplyTaxVendorMessage(int objectValue, int totalTaxValue) {
            

            
            this.objectValue = objectValue;
            
            this.totalTaxValue = totalTaxValue;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5787;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.objectValue);
            

            

            

            
        
            
                writer.write_vi32(this.totalTaxValue);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.objectValue = reader.read_vi32();
            

            

            

            
        
            
                this.totalTaxValue = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeReplyTaxVendorMessage(" +
        
            
            "objectValue=" +
            

            
            this.objectValue +
            
        
            
            ", totalTaxValue=" +
            

            
            this.totalTaxValue +
            
        
            ')';
    
    }
}

