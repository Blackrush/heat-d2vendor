
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersEnemiesListMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5928;

    
        // i32
        public int fightId;
    
        // array,com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
        public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[] playerInfo;
    

    public GuildFightPlayersEnemiesListMessage() { }

    
        public GuildFightPlayersEnemiesListMessage(int fightId, com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[] playerInfo) {
            

            
            this.fightId = fightId;
            
            this.playerInfo = playerInfo;
            
        }

        
        public GuildFightPlayersEnemiesListMessage(int fightId, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations> playerInfo) {
            

            
                
                this.fightId = fightId;
                
            
                
                this.playerInfo = playerInfo.toArray(com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 5928;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.fightId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(playerInfo.length);
                    
                    for (int i = 0; i < playerInfo.length; i++) {
                        
                        playerInfo[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.fightId = reader.read_i32();
            

            

            

            
        
            

            

            

            
                
                int playerInfo_length = reader.read_ui16();
                

                
                    this.playerInfo = new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[playerInfo_length];

                    for (int i = 0; i < playerInfo_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations playerInfo_it =
                                    new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations();
                        

                        playerInfo_it.deserialize(reader);
                        this.playerInfo[i] = playerInfo_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "GuildFightPlayersEnemiesListMessage(" +
        
            
            "fightId=" +
            

            
            this.fightId +
            
        
            
            ", playerInfo=" +
            

            
            
            java.util.Arrays.toString(this.playerInfo) +
            
            
        
            ')';
    
    }
}

