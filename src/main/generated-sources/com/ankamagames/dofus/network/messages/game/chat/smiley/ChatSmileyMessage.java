
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatSmileyMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 801;

    
        // i32
        public int entityId;
    
        // i8
        public byte smileyId;
    
        // i32
        public int accountId;
    

    public ChatSmileyMessage() { }

    
        public ChatSmileyMessage(int entityId, byte smileyId, int accountId) {
            

            
            this.entityId = entityId;
            
            this.smileyId = smileyId;
            
            this.accountId = accountId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 801;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.entityId);
            

            

            

            
        
            
                writer.write_i8(this.smileyId);
            

            

            

            
        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.entityId = reader.read_i32();
            

            

            

            
        
            
                this.smileyId = reader.read_i8();
            

            

            

            
        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChatSmileyMessage(" +
        
            
            "entityId=" +
            

            
            this.entityId +
            
        
            
            ", smileyId=" +
            

            
            this.smileyId +
            
        
            
            ", accountId=" +
            

            
            this.accountId +
            
        
            ')';
    
    }
}

