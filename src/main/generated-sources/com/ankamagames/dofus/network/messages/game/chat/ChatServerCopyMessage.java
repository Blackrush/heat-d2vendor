
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatServerCopyMessage extends com.ankamagames.dofus.network.messages.game.chat.ChatAbstractServerMessage {
    public static final int PROTOCOL_ID = 882;

    
        // vi32
        public int receiverId;
    
        // str
        public java.lang.String receiverName;
    

    public ChatServerCopyMessage() { }

    
        public ChatServerCopyMessage(byte channel, java.lang.String content, int timestamp, java.lang.String fingerprint, int receiverId, java.lang.String receiverName) {
            
            super(channel, content, timestamp, fingerprint);
            

            
            this.receiverId = receiverId;
            
            this.receiverName = receiverName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 882;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.receiverId);
            

            

            

            
        
            
                writer.write_str(this.receiverName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.receiverId = reader.read_vi32();
            

            

            

            
        
            
                this.receiverName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChatServerCopyMessage(" +
        
            
            "channel=" +
            

            
            this.channel +
            
        
            
            ", content=" +
            

            
            this.content +
            
        
            
            ", timestamp=" +
            

            
            this.timestamp +
            
        
            
            ", fingerprint=" +
            

            
            this.fingerprint +
            
        
            
            ", receiverId=" +
            

            
            this.receiverId +
            
        
            
            ", receiverName=" +
            

            
            this.receiverName +
            
        
            ')';
    
    }
}

