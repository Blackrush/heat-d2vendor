
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetSaveCustomMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6329;

    
        // i8
        public byte presetId;
    
        // i8
        public byte symbolId;
    
        // array,ui8
        public short[] itemsPositions;
    
        // array,vi32
        public int[] itemsUids;
    

    public InventoryPresetSaveCustomMessage() { }

    
        public InventoryPresetSaveCustomMessage(byte presetId, byte symbolId, short[] itemsPositions, int[] itemsUids) {
            

            
            this.presetId = presetId;
            
            this.symbolId = symbolId;
            
            this.itemsPositions = itemsPositions;
            
            this.itemsUids = itemsUids;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6329;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.presetId);
            

            

            

            
        
            
                writer.write_i8(this.symbolId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(itemsPositions.length);
                    
                    writer.write_array_ui8(this.itemsPositions);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(itemsUids.length);
                    
                    writer.write_array_vi32(this.itemsUids);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.presetId = reader.read_i8();
            

            

            

            
        
            
                this.symbolId = reader.read_i8();
            

            

            

            
        
            

            

            

            
                
                int itemsPositions_length = reader.read_ui16();
                

                
                    this.itemsPositions = reader.read_array_ui8(itemsPositions_length);
                
            
        
            

            

            

            
                
                int itemsUids_length = reader.read_ui16();
                

                
                    this.itemsUids = reader.read_array_vi32(itemsUids_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "InventoryPresetSaveCustomMessage(" +
        
            
            "presetId=" +
            

            
            this.presetId +
            
        
            
            ", symbolId=" +
            

            
            this.symbolId +
            
        
            
            ", itemsPositions=" +
            

            
            
            java.util.Arrays.toString(this.itemsPositions) +
            
            
        
            
            ", itemsUids=" +
            

            
            
            java.util.Arrays.toString(this.itemsUids) +
            
            
        
            ')';
    
    }
}

