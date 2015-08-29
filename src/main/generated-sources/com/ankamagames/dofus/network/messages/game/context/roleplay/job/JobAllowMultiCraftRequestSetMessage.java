
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobAllowMultiCraftRequestSetMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5749;

    
        // bool
        public boolean enabled;
    

    public JobAllowMultiCraftRequestSetMessage() { }

    
        public JobAllowMultiCraftRequestSetMessage(boolean enabled) {
            

            
            this.enabled = enabled;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5749;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.enabled);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.enabled = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "JobAllowMultiCraftRequestSetMessage(" +
        
            
            "enabled=" +
            

            
            this.enabled +
            
        
            ')';
    
    }
}

