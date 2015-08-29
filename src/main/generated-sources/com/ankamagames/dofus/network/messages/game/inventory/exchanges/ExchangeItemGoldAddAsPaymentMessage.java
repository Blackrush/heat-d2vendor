
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeItemGoldAddAsPaymentMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5770;

    
        // i8
        public byte paymentType;
    
        // vi32
        public int quantity;
    

    public ExchangeItemGoldAddAsPaymentMessage() { }

    
        public ExchangeItemGoldAddAsPaymentMessage(byte paymentType, int quantity) {
            

            
            this.paymentType = paymentType;
            
            this.quantity = quantity;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5770;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.paymentType);
            

            

            

            
        
            
                writer.write_vi32(this.quantity);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.paymentType = reader.read_i8();
            

            

            

            
        
            
                this.quantity = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeItemGoldAddAsPaymentMessage(" +
        
            
            "paymentType=" +
            

            
            this.paymentType +
            
        
            
            ", quantity=" +
            

            
            this.quantity +
            
        
            ')';
    
    }
}

