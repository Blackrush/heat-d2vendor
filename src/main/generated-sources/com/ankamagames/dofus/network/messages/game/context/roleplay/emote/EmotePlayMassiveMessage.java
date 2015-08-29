
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayMassiveMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayAbstractMessage {
    public static final int PROTOCOL_ID = 5691;

    
        // array,i32
        public int[] actorIds;
    

    public EmotePlayMassiveMessage() { }

    
        public EmotePlayMassiveMessage(short emoteId, double emoteStartTime, int[] actorIds) {
            
            super(emoteId, emoteStartTime);
            

            
            this.actorIds = actorIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5691;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            
                
                    
                    writer.write_ui16(actorIds.length);
                    
                    writer.write_array_i32(this.actorIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            

            
                
                int actorIds_length = reader.read_ui16();
                

                
                    this.actorIds = reader.read_array_i32(actorIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "EmotePlayMassiveMessage(" +
        
            
            "emoteId=" +
            

            
            this.emoteId +
            
        
            
            ", emoteStartTime=" +
            

            
            this.emoteStartTime +
            
        
            
            ", actorIds=" +
            

            
            
            java.util.Arrays.toString(this.actorIds) +
            
            
        
            ')';
    
    }
}

