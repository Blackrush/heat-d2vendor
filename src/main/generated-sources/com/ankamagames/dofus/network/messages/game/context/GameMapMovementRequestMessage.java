
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapMovementRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 950;

    
        // array,i16
        public short[] keyMovements;
    
        // i32
        public int mapId;
    

    public GameMapMovementRequestMessage() { }

    
        public GameMapMovementRequestMessage(short[] keyMovements, int mapId) {
            

            
            this.keyMovements = keyMovements;
            
            this.mapId = mapId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 950;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(keyMovements.length);
                    
                    writer.write_array_i16(this.keyMovements);
                
            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int keyMovements_length = reader.read_ui16();
                

                
                    this.keyMovements = reader.read_array_i16(keyMovements_length);
                
            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameMapMovementRequestMessage(" +
        
            
            "keyMovements=" +
            

            
            
            java.util.Arrays.toString(this.keyMovements) +
            
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            ')';
    
    }
}

