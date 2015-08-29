
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkMulticraftCustomerMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5817;

    
        // i8
        public byte maxCase;
    
        // vi32
        public int skillId;
    
        // i8
        public byte crafterJobLevel;
    

    public ExchangeStartOkMulticraftCustomerMessage() { }

    
        public ExchangeStartOkMulticraftCustomerMessage(byte maxCase, int skillId, byte crafterJobLevel) {
            

            
            this.maxCase = maxCase;
            
            this.skillId = skillId;
            
            this.crafterJobLevel = crafterJobLevel;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5817;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.maxCase);
            

            

            

            
        
            
                writer.write_vi32(this.skillId);
            

            

            

            
        
            
                writer.write_i8(this.crafterJobLevel);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.maxCase = reader.read_i8();
            

            

            

            
        
            
                this.skillId = reader.read_vi32();
            

            

            

            
        
            
                this.crafterJobLevel = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeStartOkMulticraftCustomerMessage(" +
        
            
            "maxCase=" +
            

            
            this.maxCase +
            
        
            
            ", skillId=" +
            

            
            this.skillId +
            
        
            
            ", crafterJobLevel=" +
            

            
            this.crafterJobLevel +
            
        
            ')';
    
    }
}

