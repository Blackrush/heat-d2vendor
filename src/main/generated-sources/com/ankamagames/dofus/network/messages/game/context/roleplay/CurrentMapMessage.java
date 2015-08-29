
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CurrentMapMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 220;

    
        // i32
        public int mapId;
    
        // str
        public java.lang.String mapKey;
    

    public CurrentMapMessage() { }

    
        public CurrentMapMessage(int mapId, java.lang.String mapKey) {
            

            
            this.mapId = mapId;
            
            this.mapKey = mapKey;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 220;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_str(this.mapKey);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.mapKey = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CurrentMapMessage(" +
        
            
            "mapId=" +
            

            
            this.mapId +
            
        
            
            ", mapKey=" +
            

            
            this.mapKey +
            
        
            ')';
    
    }
}

