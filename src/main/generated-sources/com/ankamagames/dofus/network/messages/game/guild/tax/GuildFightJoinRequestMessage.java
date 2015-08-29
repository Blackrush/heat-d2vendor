
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightJoinRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5717;

    
        // i32
        public int taxCollectorId;
    

    public GuildFightJoinRequestMessage() { }

    
        public GuildFightJoinRequestMessage(int taxCollectorId) {
            

            
            this.taxCollectorId = taxCollectorId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5717;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.taxCollectorId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.taxCollectorId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildFightJoinRequestMessage(" +
        
            
            "taxCollectorId=" +
            

            
            this.taxCollectorId +
            
        
            ')';
    
    }
}

