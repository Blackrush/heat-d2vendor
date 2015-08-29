
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersHelpersJoinMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5720;

    
        // i32
        public int fightId;
    
        // com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
        public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations playerInfo;
    

    public GuildFightPlayersHelpersJoinMessage() { }

    
        public GuildFightPlayersHelpersJoinMessage(int fightId, com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations playerInfo) {
            

            
            this.fightId = fightId;
            
            this.playerInfo = playerInfo;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5720;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.fightId);
            

            

            

            
        
            

            

            

            
                
            this.playerInfo.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.fightId = reader.read_i32();
            

            

            

            
        
            

            

            
                
                    this.playerInfo = new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations();
                
                this.playerInfo.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildFightPlayersHelpersJoinMessage(" +
        
            
            "fightId=" +
            

            
            this.fightId +
            
        
            
            ", playerInfo=" +
            

            
            this.playerInfo +
            
        
            ')';
    
    }
}

