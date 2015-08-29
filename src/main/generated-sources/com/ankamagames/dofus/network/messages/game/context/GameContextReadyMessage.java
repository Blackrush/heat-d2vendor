
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextReadyMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6071;

    
        // i32
        public int mapId;
    

    public GameContextReadyMessage() { }

    
        public GameContextReadyMessage(int mapId) {
            

            
            this.mapId = mapId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6071;
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
    
        return "GameContextReadyMessage(" +
        
            
            "mapId=" +
            

            
            this.mapId +
            
        
            ')';
    
    }
}

