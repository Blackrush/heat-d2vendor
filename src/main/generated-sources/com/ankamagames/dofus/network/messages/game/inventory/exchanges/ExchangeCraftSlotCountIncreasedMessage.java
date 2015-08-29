
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftSlotCountIncreasedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6125;

    
        // i8
        public byte newMaxSlot;
    

    public ExchangeCraftSlotCountIncreasedMessage() { }

    
        public ExchangeCraftSlotCountIncreasedMessage(byte newMaxSlot) {
            

            
            this.newMaxSlot = newMaxSlot;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6125;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.newMaxSlot);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.newMaxSlot = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeCraftSlotCountIncreasedMessage(" +
        
            
            "newMaxSlot=" +
            

            
            this.newMaxSlot +
            
        
            ')';
    
    }
}

