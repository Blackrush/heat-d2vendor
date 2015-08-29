
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseToSellFilterMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6137;

    
        // i32
        public int areaId;
    
        // i8
        public byte atLeastNbRoom;
    
        // i8
        public byte atLeastNbChest;
    
        // vi16
        public short skillRequested;
    
        // vi32
        public int maxPrice;
    

    public HouseToSellFilterMessage() { }

    
        public HouseToSellFilterMessage(int areaId, byte atLeastNbRoom, byte atLeastNbChest, short skillRequested, int maxPrice) {
            

            
            this.areaId = areaId;
            
            this.atLeastNbRoom = atLeastNbRoom;
            
            this.atLeastNbChest = atLeastNbChest;
            
            this.skillRequested = skillRequested;
            
            this.maxPrice = maxPrice;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6137;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.areaId);
            

            

            

            
        
            
                writer.write_i8(this.atLeastNbRoom);
            

            

            

            
        
            
                writer.write_i8(this.atLeastNbChest);
            

            

            

            
        
            
                writer.write_vi16(this.skillRequested);
            

            

            

            
        
            
                writer.write_vi32(this.maxPrice);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.areaId = reader.read_i32();
            

            

            

            
        
            
                this.atLeastNbRoom = reader.read_i8();
            

            

            

            
        
            
                this.atLeastNbChest = reader.read_i8();
            

            

            

            
        
            
                this.skillRequested = reader.read_vi16();
            

            

            

            
        
            
                this.maxPrice = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseToSellFilterMessage(" +
        
            
            "areaId=" +
            

            
            this.areaId +
            
        
            
            ", atLeastNbRoom=" +
            

            
            this.atLeastNbRoom +
            
        
            
            ", atLeastNbChest=" +
            

            
            this.atLeastNbChest +
            
        
            
            ", skillRequested=" +
            

            
            this.skillRequested +
            
        
            
            ", maxPrice=" +
            

            
            this.maxPrice +
            
        
            ')';
    
    }
}

