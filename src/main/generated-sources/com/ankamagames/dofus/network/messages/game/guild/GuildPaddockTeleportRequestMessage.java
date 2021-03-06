
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildPaddockTeleportRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5957;

    
        // i32
        public int paddockId;
    

    public GuildPaddockTeleportRequestMessage() { }

    
        public GuildPaddockTeleportRequestMessage(int paddockId) {
            

            
            this.paddockId = paddockId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5957;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.paddockId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.paddockId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildPaddockTeleportRequestMessage(" +
        
            
            "paddockId=" +
            

            
            this.paddockId +
            
        
            ')';
    
    }
}

