
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatSmileyRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 800;

    
        // i8
        public byte smileyId;
    

    public ChatSmileyRequestMessage() { }

    
        public ChatSmileyRequestMessage(byte smileyId) {
            

            
            this.smileyId = smileyId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 800;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.smileyId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.smileyId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChatSmileyRequestMessage(" +
        
            
            "smileyId=" +
            

            
            this.smileyId +
            
        
            ')';
    
    }
}

