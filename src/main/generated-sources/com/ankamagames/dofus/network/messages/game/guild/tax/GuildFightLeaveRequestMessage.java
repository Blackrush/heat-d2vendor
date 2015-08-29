
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightLeaveRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5715;

    
        // i32
        public int taxCollectorId;
    
        // vi32
        public int characterId;
    

    public GuildFightLeaveRequestMessage() { }

    
        public GuildFightLeaveRequestMessage(int taxCollectorId, int characterId) {
            

            
            this.taxCollectorId = taxCollectorId;
            
            this.characterId = characterId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5715;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.taxCollectorId);
            

            

            

            
        
            
                writer.write_vi32(this.characterId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.taxCollectorId = reader.read_i32();
            

            

            

            
        
            
                this.characterId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildFightLeaveRequestMessage(" +
        
            
            "taxCollectorId=" +
            

            
            this.taxCollectorId +
            
        
            
            ", characterId=" +
            

            
            this.characterId +
            
        
            ')';
    
    }
}

