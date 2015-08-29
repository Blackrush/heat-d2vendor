
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersHelpersLeaveMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5719;

    
        // i32
        public int fightId;
    
        // vi32
        public int playerId;
    

    public GuildFightPlayersHelpersLeaveMessage() { }

    
        public GuildFightPlayersHelpersLeaveMessage(int fightId, int playerId) {
            

            
            this.fightId = fightId;
            
            this.playerId = playerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5719;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.fightId);
            

            

            

            
        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.fightId = reader.read_i32();
            

            

            

            
        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildFightPlayersHelpersLeaveMessage(" +
        
            
            "fightId=" +
            

            
            this.fightId +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            ')';
    
    }
}

