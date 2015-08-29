
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RawDataMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6253;

    
        // array,i8
        public byte[] content;
    

    public RawDataMessage() { }

    
        public RawDataMessage(byte[] content) {
            

            
            this.content = content;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6253;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_vi32(content.length);
                    
                    writer.write_array_i8(this.content);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int content_length = reader.read_vi32();
                

                
                    this.content = reader.read_array_i8(content_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "RawDataMessage(" +
        
            
            "content=" +
            

            
            
            + this.content.length + "b" +
            
            
        
            ')';
    
    }
}

