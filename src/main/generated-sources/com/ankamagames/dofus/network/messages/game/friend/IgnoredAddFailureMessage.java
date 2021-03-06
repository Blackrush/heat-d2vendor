
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredAddFailureMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5679;

    
        // i8
        public byte reason;
    

    public IgnoredAddFailureMessage() { }

    
        public IgnoredAddFailureMessage(byte reason) {
            

            
            this.reason = reason;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5679;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.reason);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.reason = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "IgnoredAddFailureMessage(" +
        
            
            "reason=" +
            

            
            this.reason +
            
        
            ')';
    
    }
}

