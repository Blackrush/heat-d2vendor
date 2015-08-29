
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeClearPaymentForCraftMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6145;

    
        // i8
        public byte paymentType;
    

    public ExchangeClearPaymentForCraftMessage() { }

    
        public ExchangeClearPaymentForCraftMessage(byte paymentType) {
            

            
            this.paymentType = paymentType;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6145;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.paymentType);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.paymentType = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeClearPaymentForCraftMessage(" +
        
            
            "paymentType=" +
            

            
            this.paymentType +
            
        
            ')';
    
    }
}

