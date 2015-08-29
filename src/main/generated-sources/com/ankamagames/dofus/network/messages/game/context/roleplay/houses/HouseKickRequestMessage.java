
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseKickRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5698;

    
        // vi32
        public int id;
    

    public HouseKickRequestMessage() { }

    
        public HouseKickRequestMessage(int id) {
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5698;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseKickRequestMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

