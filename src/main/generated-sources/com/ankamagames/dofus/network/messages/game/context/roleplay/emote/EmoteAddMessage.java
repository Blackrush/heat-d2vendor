
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmoteAddMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5644;

    
        // ui8
        public short emoteId;
    

    public EmoteAddMessage() { }

    
        public EmoteAddMessage(short emoteId) {
            

            
            this.emoteId = emoteId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5644;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_ui8(this.emoteId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.emoteId = reader.read_ui8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "EmoteAddMessage(" +
        
            
            "emoteId=" +
            

            
            this.emoteId +
            
        
            ')';
    
    }
}

