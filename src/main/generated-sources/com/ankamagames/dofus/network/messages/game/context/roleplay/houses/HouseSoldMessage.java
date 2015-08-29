
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSoldMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5737;

    
        // vi32
        public int houseId;
    
        // vi32
        public int realPrice;
    
        // str
        public java.lang.String buyerName;
    

    public HouseSoldMessage() { }

    
        public HouseSoldMessage(int houseId, int realPrice, java.lang.String buyerName) {
            

            
            this.houseId = houseId;
            
            this.realPrice = realPrice;
            
            this.buyerName = buyerName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5737;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            
                writer.write_vi32(this.realPrice);
            

            

            

            
        
            
                writer.write_str(this.buyerName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            
                this.realPrice = reader.read_vi32();
            

            

            

            
        
            
                this.buyerName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseSoldMessage(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            
            ", realPrice=" +
            

            
            this.realPrice +
            
        
            
            ", buyerName=" +
            

            
            this.buyerName +
            
        
            ')';
    
    }
}

