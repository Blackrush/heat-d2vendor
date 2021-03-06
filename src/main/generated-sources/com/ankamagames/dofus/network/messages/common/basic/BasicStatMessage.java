
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicStatMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6530;

    
        // vi16
        public short statId;
    

    public BasicStatMessage() { }

    
        public BasicStatMessage(short statId) {
            

            
            this.statId = statId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6530;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.statId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.statId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "BasicStatMessage(" +
        
            
            "statId=" +
            

            
            this.statId +
            
        
            ')';
    
    }
}

