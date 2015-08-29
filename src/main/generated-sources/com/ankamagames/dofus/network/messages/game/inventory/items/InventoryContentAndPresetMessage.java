
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryContentAndPresetMessage extends com.ankamagames.dofus.network.messages.game.inventory.items.InventoryContentMessage {
    public static final int PROTOCOL_ID = 6162;

    
        // array,com.ankamagames.dofus.network.types.game.inventory.preset.Preset
        public com.ankamagames.dofus.network.types.game.inventory.preset.Preset[] presets;
    

    public InventoryContentAndPresetMessage() { }

    
        public InventoryContentAndPresetMessage(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects, int kamas, com.ankamagames.dofus.network.types.game.inventory.preset.Preset[] presets) {
            
            super(objects, kamas);
            

            
            this.presets = presets;
            
        }

        
        public InventoryContentAndPresetMessage(java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem> objects, int kamas, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.inventory.preset.Preset> presets) {
            
            super(objects, kamas);
            

            
                
                this.presets = presets.toArray(com.ankamagames.dofus.network.types.game.inventory.preset.Preset[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 6162;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            
                
                    
                    writer.write_ui16(presets.length);
                    
                    for (int i = 0; i < presets.length; i++) {
                        
                        presets[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            

            
                
                int presets_length = reader.read_ui16();
                

                
                    this.presets = new com.ankamagames.dofus.network.types.game.inventory.preset.Preset[presets_length];

                    for (int i = 0; i < presets_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.inventory.preset.Preset presets_it =
                                    new com.ankamagames.dofus.network.types.game.inventory.preset.Preset();
                        

                        presets_it.deserialize(reader);
                        this.presets[i] = presets_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "InventoryContentAndPresetMessage(" +
        
            
            "objects=" +
            

            
            
            java.util.Arrays.toString(this.objects) +
            
            
        
            
            ", kamas=" +
            

            
            this.kamas +
            
        
            
            ", presets=" +
            

            
            
            java.util.Arrays.toString(this.presets) +
            
            
        
            ')';
    
    }
}

