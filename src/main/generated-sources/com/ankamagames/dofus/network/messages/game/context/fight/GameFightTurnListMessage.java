
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnListMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 713;

    
        // array,i32
        public int[] ids;
    
        // array,i32
        public int[] deadsIds;
    

    public GameFightTurnListMessage() { }

    
        public GameFightTurnListMessage(int[] ids, int[] deadsIds) {
            

            
            this.ids = ids;
            
            this.deadsIds = deadsIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 713;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(ids.length);
                    
                    writer.write_array_i32(this.ids);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(deadsIds.length);
                    
                    writer.write_array_i32(this.deadsIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int ids_length = reader.read_ui16();
                

                
                    this.ids = reader.read_array_i32(ids_length);
                
            
        
            

            

            

            
                
                int deadsIds_length = reader.read_ui16();
                

                
                    this.deadsIds = reader.read_array_i32(deadsIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "GameFightTurnListMessage(" +
        
            
            "ids=" +
            

            
            
            java.util.Arrays.toString(this.ids) +
            
            
        
            
            ", deadsIds=" +
            

            
            
            java.util.Arrays.toString(this.deadsIds) +
            
            
        
            ')';
    
    }
}

