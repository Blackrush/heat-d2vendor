
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6171;

    
        // com.ankamagames.dofus.network.types.game.inventory.preset.Preset
        public com.ankamagames.dofus.network.types.game.inventory.preset.Preset preset;
    

    public InventoryPresetUpdateMessage() { }

    
        public InventoryPresetUpdateMessage(com.ankamagames.dofus.network.types.game.inventory.preset.Preset preset) {
            

            
            this.preset = preset;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6171;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
            this.preset.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    this.preset = new com.ankamagames.dofus.network.types.game.inventory.preset.Preset();
                
                this.preset.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "InventoryPresetUpdateMessage(" +
        
            
            "preset=" +
            

            
            this.preset +
            
        
            ')';
    
    }
}

