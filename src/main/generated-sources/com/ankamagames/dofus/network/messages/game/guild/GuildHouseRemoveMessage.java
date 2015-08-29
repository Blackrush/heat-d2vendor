
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildHouseRemoveMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6180;

    
        // vi32
        public int houseId;
    

    public GuildHouseRemoveMessage() { }

    
        public GuildHouseRemoveMessage(int houseId) {
            

            
            this.houseId = houseId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6180;
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
    
        return "GuildHouseRemoveMessage(" +
        
            
            "houseId=" +
            

            
            this.houseId +
            
        
            ')';
    
    }
}

