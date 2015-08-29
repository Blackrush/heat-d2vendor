
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformationsInside extends NetworkType {
    public static final int PROTOCOL_ID = 218;

    
        // vi32
        public int houseId;
    
        // vi16
        public short modelId;
    
        // i32
        public int ownerId;
    
        // str
        public java.lang.String ownerName;
    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int price;
    
        // bool
        public boolean isLocked;
    

    public HouseInformationsInside() { }

    
        public HouseInformationsInside(int houseId, short modelId, int ownerId, java.lang.String ownerName, short worldX, short worldY, int price, boolean isLocked) {
            

            
            this.houseId = houseId;
            
            this.modelId = modelId;
            
            this.ownerId = ownerId;
            
            this.ownerName = ownerName;
            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.price = price;
            
            this.isLocked = isLocked;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 218;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            
                writer.write_vi16(this.modelId);
            

            

            

            
        
            
                writer.write_i32(this.ownerId);
            

            

            

            
        
            
                writer.write_str(this.ownerName);
            

            

            

            
        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.price);
            

            

            

            
        
            
                writer.write_bool(this.isLocked);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            
                this.modelId = reader.read_vi16();
            

            

            

            
        
            
                this.ownerId = reader.read_i32();
            

            

            

            
        
            
                this.ownerName = reader.read_str();
            

            

            

            
        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.price = reader.read_i32();
            

            

            

            
        
            
                this.isLocked = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseInformationsInside(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            
            ", modelId=" +
            

            
            this.modelId +
            
        
            
            ", ownerId=" +
            

            
            this.ownerId +
            
        
            
            ", ownerName=" +
            

            
            this.ownerName +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            
            ", isLocked=" +
            

            
            this.isLocked +
            
        
            ')';
    
    }
}

