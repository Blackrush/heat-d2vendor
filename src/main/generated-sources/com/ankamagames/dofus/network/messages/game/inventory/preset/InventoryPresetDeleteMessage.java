
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetDeleteMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6169;

    
        // i8
        public byte presetId;
    

    public InventoryPresetDeleteMessage() { }

    
        public InventoryPresetDeleteMessage(byte presetId) {
            

            
            this.presetId = presetId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6169;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.presetId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.presetId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "InventoryPresetDeleteMessage(" +
        
            
            "presetId=" +
            

            
            this.presetId +
            
        
            ')';
    
    }
}

