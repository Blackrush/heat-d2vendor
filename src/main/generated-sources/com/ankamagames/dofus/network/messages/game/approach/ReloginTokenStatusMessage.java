
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ReloginTokenStatusMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6539;

    
        // bool
        public boolean validToken;
    
        // str
        public java.lang.String token;
    

    public ReloginTokenStatusMessage() { }

    
        public ReloginTokenStatusMessage(boolean validToken, java.lang.String token) {
            

            
            this.validToken = validToken;
            
            this.token = token;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6539;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.validToken);
            

            

            

            
        
            
                writer.write_str(this.token);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.validToken = reader.read_bool();
            

            

            

            
        
            
                this.token = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ReloginTokenStatusMessage(" +
        
            
            "validToken=" +
            

            
            this.validToken +
            
        
            
            ", token=" +
            

            
            this.token +
            
        
            ')';
    
    }
}

