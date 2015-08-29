
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformations extends NetworkType {
    public static final int PROTOCOL_ID = 111;

    
        // flag,_loc2_,0
        public boolean isOnSale;
    
        // flag,_loc2_,1
        public boolean isSaleLocked;
    
        // vi32
        public int houseId;
    
        // array,i32
        public int[] doorsOnMap;
    
        // str
        public java.lang.String ownerName;
    
        // vi16
        public short modelId;
    

    public HouseInformations() { }

    
        public HouseInformations(boolean isOnSale, boolean isSaleLocked, int houseId, int[] doorsOnMap, java.lang.String ownerName, short modelId) {
            

            
            this.isOnSale = isOnSale;
            
            this.isSaleLocked = isSaleLocked;
            
            this.houseId = houseId;
            
            this.doorsOnMap = doorsOnMap;
            
            this.ownerName = ownerName;
            
            this.modelId = modelId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 111;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isOnSale, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isSaleLocked, 1);
                
                writer.write_i8(_loc2_);
                
            

            
        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(doorsOnMap.length);
                    
                    writer.write_array_i32(this.doorsOnMap);
                
            

            

            
        
            
                writer.write_str(this.ownerName);
            

            

            

            
        
            
                writer.write_vi16(this.modelId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.isOnSale = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.isSaleLocked = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            

            

            

            
                
                int doorsOnMap_length = reader.read_ui16();
                

                
                    this.doorsOnMap = reader.read_array_i32(doorsOnMap_length);
                
            
        
            
                this.ownerName = reader.read_str();
            

            

            

            
        
            
                this.modelId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseInformations(" +
        
            
            "isOnSale=" +
            

            
            this.isOnSale +
            
        
            
            ", isSaleLocked=" +
            

            
            this.isSaleLocked +
            
        
            
            ", houseId=" +
            

            
            this.houseId +
            
        
            
            ", doorsOnMap=" +
            

            
            
            java.util.Arrays.toString(this.doorsOnMap) +
            
            
        
            
            ", ownerName=" +
            

            
            this.ownerName +
            
        
            
            ", modelId=" +
            

            
            this.modelId +
            
        
            ')';
    
    }
}

