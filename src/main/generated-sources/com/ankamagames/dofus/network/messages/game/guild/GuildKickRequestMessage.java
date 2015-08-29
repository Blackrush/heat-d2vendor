
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildKickRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5887;

    
        // vi32
        public int kickedId;
    

    public GuildKickRequestMessage() { }

    
        public GuildKickRequestMessage(int kickedId) {
            

            
            this.kickedId = kickedId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5887;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.kickedId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.kickedId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildKickRequestMessage(" +
        
            
            "kickedId=" +
            

            
            this.kickedId +
            
        
            ')';
    
    }
}

