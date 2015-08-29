
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChangeMapMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 221;

    
        // i32
        public int mapId;
    

    public ChangeMapMessage() { }

    
        public ChangeMapMessage(int mapId) {
            

            
            this.mapId = mapId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 221;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChangeMapMessage(" +
        
            
            "mapId=" +
            

            
            this.mapId +
            
        
            ')';
    
    }
}

