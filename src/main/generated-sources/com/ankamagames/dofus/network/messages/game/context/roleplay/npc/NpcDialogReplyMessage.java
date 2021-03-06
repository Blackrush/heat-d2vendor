
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcDialogReplyMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5616;

    
        // vi16
        public short replyId;
    

    public NpcDialogReplyMessage() { }

    
        public NpcDialogReplyMessage(short replyId) {
            

            
            this.replyId = replyId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5616;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.replyId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.replyId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "NpcDialogReplyMessage(" +
        
            
            "replyId=" +
            

            
            this.replyId +
            
        
            ')';
    
    }
}

