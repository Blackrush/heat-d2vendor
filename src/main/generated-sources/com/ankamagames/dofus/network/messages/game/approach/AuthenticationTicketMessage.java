
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AuthenticationTicketMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 110;

    
        // str
        public java.lang.String lang;
    
        // str
        public java.lang.String ticket;
    

    public AuthenticationTicketMessage() { }

    
        public AuthenticationTicketMessage(java.lang.String lang, java.lang.String ticket) {
            

            
            this.lang = lang;
            
            this.ticket = ticket;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 110;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_str(this.lang);
            

            

            

            
        
            
                writer.write_str(this.ticket);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.lang = reader.read_str();
            

            

            

            
        
            
                this.ticket = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AuthenticationTicketMessage(" +
        
            
            "lang=" +
            

            
            this.lang +
            
        
            
            ", ticket=" +
            

            
            this.ticket +
            
        
            ')';
    
    }
}

