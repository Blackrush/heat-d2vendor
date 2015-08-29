
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.sequence;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SequenceEndMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 956;

    
        // vi16
        public short actionId;
    
        // i32
        public int authorId;
    
        // i8
        public byte sequenceType;
    

    public SequenceEndMessage() { }

    
        public SequenceEndMessage(short actionId, int authorId, byte sequenceType) {
            

            
            this.actionId = actionId;
            
            this.authorId = authorId;
            
            this.sequenceType = sequenceType;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 956;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.actionId);
            

            

            

            
        
            
                writer.write_i32(this.authorId);
            

            

            

            
        
            
                writer.write_i8(this.sequenceType);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.actionId = reader.read_vi16();
            

            

            

            
        
            
                this.authorId = reader.read_i32();
            

            

            

            
        
            
                this.sequenceType = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SequenceEndMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", authorId=" +
            

            
            this.authorId +
            
        
            
            ", sequenceType=" +
            

            
            this.sequenceType +
            
        
            ')';
    
    }
}

