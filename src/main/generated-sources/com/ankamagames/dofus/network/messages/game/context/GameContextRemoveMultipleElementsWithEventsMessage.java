
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveMultipleElementsWithEventsMessage extends com.ankamagames.dofus.network.messages.game.context.GameContextRemoveMultipleElementsMessage {
    public static final int PROTOCOL_ID = 6416;

    
        // array,i8
        public byte[] elementEventIds;
    

    public GameContextRemoveMultipleElementsWithEventsMessage() { }

    
        public GameContextRemoveMultipleElementsWithEventsMessage(int[] id, byte[] elementEventIds) {
            
            super(id);
            

            
            this.elementEventIds = elementEventIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6416;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            
                
                    
                    writer.write_ui16(elementEventIds.length);
                    
                    writer.write_array_i8(this.elementEventIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            

            
                
                int elementEventIds_length = reader.read_ui16();
                

                
                    this.elementEventIds = reader.read_array_i8(elementEventIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "GameContextRemoveMultipleElementsWithEventsMessage(" +
        
            
            "id=" +
            

            
            
            java.util.Arrays.toString(this.id) +
            
            
        
            
            ", elementEventIds=" +
            

            
            
            + this.elementEventIds.length + "b" +
            
            
        
            ')';
    
    }
}

