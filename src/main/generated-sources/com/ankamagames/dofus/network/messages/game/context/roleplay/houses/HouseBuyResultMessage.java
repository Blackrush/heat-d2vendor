
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseBuyResultMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5735;

    
        // vi32
        public int houseId;
    
        // bool
        public boolean bought;
    
        // vi32
        public int realPrice;
    

    public HouseBuyResultMessage() { }

    
        public HouseBuyResultMessage(int houseId, boolean bought, int realPrice) {
            

            
            this.houseId = houseId;
            
            this.bought = bought;
            
            this.realPrice = realPrice;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5735;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
            
                writer.write_bool(this.bought);
            

            

            

            
        
            
                writer.write_vi32(this.realPrice);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
            
                this.bought = reader.read_bool();
            

            

            

            
        
            
                this.realPrice = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseBuyResultMessage(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            
            ", bought=" +
            

            
            this.bought +
            
        
            
            ", realPrice=" +
            

            
            this.realPrice +
            
        
            ')';
    
    }
}

