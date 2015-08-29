
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaUpdatePlayerInfosMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6301;

    
        // vi16
        public short rank;
    
        // vi16
        public short bestDailyRank;
    
        // vi16
        public short bestRank;
    
        // vi16
        public short victoryCount;
    
        // vi16
        public short arenaFightcount;
    

    public GameRolePlayArenaUpdatePlayerInfosMessage() { }

    
        public GameRolePlayArenaUpdatePlayerInfosMessage(short rank, short bestDailyRank, short bestRank, short victoryCount, short arenaFightcount) {
            

            
            this.rank = rank;
            
            this.bestDailyRank = bestDailyRank;
            
            this.bestRank = bestRank;
            
            this.victoryCount = victoryCount;
            
            this.arenaFightcount = arenaFightcount;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6301;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.rank);
            

            

            

            
        
            
                writer.write_vi16(this.bestDailyRank);
            

            

            

            
        
            
                writer.write_vi16(this.bestRank);
            

            

            

            
        
            
                writer.write_vi16(this.victoryCount);
            

            

            

            
        
            
                writer.write_vi16(this.arenaFightcount);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.rank = reader.read_vi16();
            

            

            

            
        
            
                this.bestDailyRank = reader.read_vi16();
            

            

            

            
        
            
                this.bestRank = reader.read_vi16();
            

            

            

            
        
            
                this.victoryCount = reader.read_vi16();
            

            

            

            
        
            
                this.arenaFightcount = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayArenaUpdatePlayerInfosMessage(" +
        
            
            "rank=" +
            

            
            this.rank +
            
        
            
            ", bestDailyRank=" +
            

            
            this.bestDailyRank +
            
        
            
            ", bestRank=" +
            

            
            this.bestRank +
            
        
            
            ", victoryCount=" +
            

            
            this.victoryCount +
            
        
            
            ", arenaFightcount=" +
            

            
            this.arenaFightcount +
            
        
            ')';
    
    }
}

