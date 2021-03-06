
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountHouseInformations extends NetworkType {
    public static final int PROTOCOL_ID = 390;

    
        // vi32
        public int houseId;
    
        // vi16
        public short modelId;
    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int mapId;
    
        // vi16
        public short subAreaId;
    

    public AccountHouseInformations() { }

    
        public AccountHouseInformations(int houseId, short modelId, short worldX, short worldY, int mapId, short subAreaId) {
            

            
            this.houseId = houseId;
            
            this.modelId = modelId;
            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.mapId = mapId;
            
            this.subAreaId = subAreaId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 390;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            
                writer.write_vi16(this.modelId);
            

            

            

            
        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi16(this.subAreaId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            
                this.modelId = reader.read_vi16();
            

            

            

            
        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.subAreaId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AccountHouseInformations(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            
            ", modelId=" +
            

            
            this.modelId +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            ')';
    
    }
}

