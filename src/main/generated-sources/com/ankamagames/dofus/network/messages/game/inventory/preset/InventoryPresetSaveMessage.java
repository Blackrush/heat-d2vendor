
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetSaveMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6165;

    
        // i8
        public byte presetId;
    
        // i8
        public byte symbolId;
    
        // bool
        public boolean saveEquipment;
    

    public InventoryPresetSaveMessage() { }

    
        public InventoryPresetSaveMessage(byte presetId, byte symbolId, boolean saveEquipment) {
            

            
            this.presetId = presetId;
            
            this.symbolId = symbolId;
            
            this.saveEquipment = saveEquipment;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6165;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.presetId);
            

            

            

            
        
            
                writer.write_i8(this.symbolId);
            

            

            

            
        
            
                writer.write_bool(this.saveEquipment);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.presetId = reader.read_i8();
            

            

            

            
        
            
                this.symbolId = reader.read_i8();
            

            

            

            
        
            
                this.saveEquipment = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "InventoryPresetSaveMessage(" +
        
            
            "presetId=" +
            

            
            this.presetId +
            
        
            
            ", symbolId=" +
            

            
            this.symbolId +
            
        
            
            ", saveEquipment=" +
            

            
            this.saveEquipment +
            
        
            ')';
    
    }
}

