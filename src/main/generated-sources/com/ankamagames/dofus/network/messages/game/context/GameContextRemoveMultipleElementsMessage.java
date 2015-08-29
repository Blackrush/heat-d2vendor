
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveMultipleElementsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 252;

    
        // array,i32
        public int[] id;
    

    public GameContextRemoveMultipleElementsMessage() { }

    
        public GameContextRemoveMultipleElementsMessage(int[] id) {
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 252;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(id.length);
                    
                    writer.write_array_i32(this.id);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int id_length = reader.read_ui16();
                

                
                    this.id = reader.read_array_i32(id_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "GameContextRemoveMultipleElementsMessage(" +
        
            
            "id=" +
            

            
            
            java.util.Arrays.toString(this.id) +
            
            
        
            ')';
    
    }
}

