
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildNoneMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5701;

    
        // vi32
        public int houseId;
    

    public HouseGuildNoneMessage() { }

    
        public HouseGuildNoneMessage(int houseId) {
            

            
            this.houseId = houseId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5701;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseGuildNoneMessage(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            ')';
    
    }
}

