
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeOkMultiCraftMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5768;

    
        // vi32
        public int initiatorId;
    
        // vi32
        public int otherId;
    
        // i8
        public byte role;
    

    public ExchangeOkMultiCraftMessage() { }

    
        public ExchangeOkMultiCraftMessage(int initiatorId, int otherId, byte role) {
            

            
            this.initiatorId = initiatorId;
            
            this.otherId = otherId;
            
            this.role = role;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5768;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.initiatorId);
            

            

            

            
        
            
                writer.write_vi32(this.otherId);
            

            

            

            
        
            
                writer.write_i8(this.role);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.initiatorId = reader.read_vi32();
            

            

            

            
        
            
                this.otherId = reader.read_vi32();
            

            

            

            
        
            
                this.role = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeOkMultiCraftMessage(" +
        
            
            "initiatorId=" +
            

            
            this.initiatorId +
            
        
            
            ", otherId=" +
            

            
            this.otherId +
            
        
            
            ", role=" +
            

            
            this.role +
            
        
            ')';
    
    }
}

