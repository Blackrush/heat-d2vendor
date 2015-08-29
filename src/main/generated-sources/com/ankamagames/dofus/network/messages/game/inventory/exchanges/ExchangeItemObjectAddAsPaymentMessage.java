
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeItemObjectAddAsPaymentMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5766;

    
        // i8
        public byte paymentType;
    
        // bool
        public boolean bAdd;
    
        // vi32
        public int objectToMoveId;
    
        // vi32
        public int quantity;
    

    public ExchangeItemObjectAddAsPaymentMessage() { }

    
        public ExchangeItemObjectAddAsPaymentMessage(byte paymentType, boolean bAdd, int objectToMoveId, int quantity) {
            

            
            this.paymentType = paymentType;
            
            this.bAdd = bAdd;
            
            this.objectToMoveId = objectToMoveId;
            
            this.quantity = quantity;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5766;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.paymentType);
            

            

            

            
        
            
                writer.write_bool(this.bAdd);
            

            

            

            
        
            
                writer.write_vi32(this.objectToMoveId);
            

            

            

            
        
            
                writer.write_vi32(this.quantity);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.paymentType = reader.read_i8();
            

            

            

            
        
            
                this.bAdd = reader.read_bool();
            

            

            

            
        
            
                this.objectToMoveId = reader.read_vi32();
            

            

            

            
        
            
                this.quantity = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeItemObjectAddAsPaymentMessage(" +
        
            
            "paymentType=" +
            

            
            this.paymentType +
            
        
            
            ", bAdd=" +
            

            
            this.bAdd +
            
        
            
            ", objectToMoveId=" +
            

            
            this.objectToMoveId +
            
        
            
            ", quantity=" +
            

            
            this.quantity +
            
        
            ')';
    
    }
}

