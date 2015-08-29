
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockBuyResultMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6516;

    
        // i32
        public int paddockId;
    
        // bool
        public boolean bought;
    
        // vi32
        public int realPrice;
    

    public PaddockBuyResultMessage() { }

    
        public PaddockBuyResultMessage(int paddockId, boolean bought, int realPrice) {
            

            
            this.paddockId = paddockId;
            
            this.bought = bought;
            
            this.realPrice = realPrice;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6516;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.paddockId);
            

            

            

            
        
            
                writer.write_bool(this.bought);
            

            

            

            
        
            
                writer.write_vi32(this.realPrice);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.paddockId = reader.read_i32();
            

            

            

            
        
            
                this.bought = reader.read_bool();
            

            

            

            
        
            
                this.realPrice = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockBuyResultMessage(" +
        
            
            "paddockId=" +
            

            
            this.paddockId +
            
        
            
            ", bought=" +
            

            
            this.bought +
            
        
            
            ", realPrice=" +
            

            
            this.realPrice +
            
        
            ')';
    
    }
}

