
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.sequence;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SequenceStartMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 955;

    
        // i8
        public byte sequenceType;
    
        // i32
        public int authorId;
    

    public SequenceStartMessage() { }

    
        public SequenceStartMessage(byte sequenceType, int authorId) {
            

            
            this.sequenceType = sequenceType;
            
            this.authorId = authorId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 955;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.sequenceType);
            

            

            

            
        
            
                writer.write_i32(this.authorId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.sequenceType = reader.read_i8();
            

            

            

            
        
            
                this.authorId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SequenceStartMessage(" +
        
            
            "sequenceType=" +
            

            
            this.sequenceType +
            
        
            
            ", authorId=" +
            

            
            this.authorId +
            
        
            ')';
    
    }
}

