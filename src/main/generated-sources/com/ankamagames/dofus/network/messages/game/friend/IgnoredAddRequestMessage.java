
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredAddRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5673;

    
        // str
        public java.lang.String name;
    
        // bool
        public boolean session;
    

    public IgnoredAddRequestMessage() { }

    
        public IgnoredAddRequestMessage(java.lang.String name, boolean session) {
            

            
            this.name = name;
            
            this.session = session;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5673;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_str(this.name);
            

            

            

            
        
            
                writer.write_bool(this.session);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.name = reader.read_str();
            

            

            

            
        
            
                this.session = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "IgnoredAddRequestMessage(" +
        
            
            "name=" +
            

            
            this.name +
            
        
            
            ", session=" +
            

            
            this.session +
            
        
            ')';
    
    }
}

