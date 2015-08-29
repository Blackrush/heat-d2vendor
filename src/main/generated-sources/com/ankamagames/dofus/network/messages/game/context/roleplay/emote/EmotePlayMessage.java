
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayAbstractMessage {
    public static final int PROTOCOL_ID = 5683;

    
        // i32
        public int actorId;
    
        // i32
        public int accountId;
    

    public EmotePlayMessage() { }

    
        public EmotePlayMessage(short emoteId, double emoteStartTime, int actorId, int accountId) {
            
            super(emoteId, emoteStartTime);
            

            
            this.actorId = actorId;
            
            this.accountId = accountId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5683;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.actorId);
            

            

            

            
        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.actorId = reader.read_i32();
            

            

            

            
        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "EmotePlayMessage(" +
        
            
            "emoteId=" +
            

            
            this.emoteId +
            
        
            
            ", emoteStartTime=" +
            

            
            this.emoteStartTime +
            
        
            
            ", actorId=" +
            

            
            this.actorId +
            
        
            
            ", accountId=" +
            

            
            this.accountId +
            
        
            ')';
    
    }
}

