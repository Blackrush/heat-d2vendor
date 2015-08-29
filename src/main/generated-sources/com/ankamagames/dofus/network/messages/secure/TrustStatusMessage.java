
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.secure;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TrustStatusMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6267;

    
        // bool
        public boolean trusted;
    

    public TrustStatusMessage() { }

    
        public TrustStatusMessage(boolean trusted) {
            

            
            this.trusted = trusted;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6267;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.trusted);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.trusted = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "TrustStatusMessage(" +
        
            
            "trusted=" +
            

            
            this.trusted +
            
        
            ')';
    
    }
}

