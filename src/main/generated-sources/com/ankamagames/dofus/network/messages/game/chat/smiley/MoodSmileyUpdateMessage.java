
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MoodSmileyUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6388;

    
        // i32
        public int accountId;
    
        // vi32
        public int playerId;
    
        // i8
        public byte smileyId;
    

    public MoodSmileyUpdateMessage() { }

    
        public MoodSmileyUpdateMessage(int accountId, int playerId, byte smileyId) {
            

            
            this.accountId = accountId;
            
            this.playerId = playerId;
            
            this.smileyId = smileyId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6388;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            
                writer.write_i8(this.smileyId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            
                this.smileyId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "MoodSmileyUpdateMessage(" +
        
            
            "accountId=" +
            

            
            this.accountId +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            
            ", smileyId=" +
            

            
            this.smileyId +
            
        
            ')';
    
    }
}

