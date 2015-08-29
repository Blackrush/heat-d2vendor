
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformationsForGuild extends NetworkType {
    public static final int PROTOCOL_ID = 170;

    
        // vi32
        public int houseId;
    
        // vi32
        public int modelId;
    
        // str
        public java.lang.String ownerName;
    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int mapId;
    
        // vi16
        public short subAreaId;
    
        // array,i32
        public int[] skillListIds;
    
        // vi32
        public int guildshareParams;
    

    public HouseInformationsForGuild() { }

    
        public HouseInformationsForGuild(int houseId, int modelId, java.lang.String ownerName, short worldX, short worldY, int mapId, short subAreaId, int[] skillListIds, int guildshareParams) {
            

            
            this.houseId = houseId;
            
            this.modelId = modelId;
            
            this.ownerName = ownerName;
            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.mapId = mapId;
            
            this.subAreaId = subAreaId;
            
            this.skillListIds = skillListIds;
            
            this.guildshareParams = guildshareParams;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 170;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            
                writer.write_vi32(this.modelId);
            

            

            

            
        
            
                writer.write_str(this.ownerName);
            

            

            

            
        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi16(this.subAreaId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(skillListIds.length);
                    
                    writer.write_array_i32(this.skillListIds);
                
            

            

            
        
            
                writer.write_vi32(this.guildshareParams);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            
                this.modelId = reader.read_vi32();
            

            

            

            
        
            
                this.ownerName = reader.read_str();
            

            

            

            
        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.subAreaId = reader.read_vi16();
            

            

            

            
        
            

            

            

            
                
                int skillListIds_length = reader.read_ui16();
                

                
                    this.skillListIds = reader.read_array_i32(skillListIds_length);
                
            
        
            
                this.guildshareParams = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseInformationsForGuild(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            
            ", modelId=" +
            

            
            this.modelId +
            
        
            
            ", ownerName=" +
            

            
            this.ownerName +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            
            ", skillListIds=" +
            

            
            
            java.util.Arrays.toString(this.skillListIds) +
            
            
        
            
            ", guildshareParams=" +
            

            
            this.guildshareParams +
            
        
            ')';
    
    }
}

