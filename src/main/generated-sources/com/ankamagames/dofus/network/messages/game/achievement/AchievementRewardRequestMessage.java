
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementRewardRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6377;

    
        // i16
        public short achievementId;
    

    public AchievementRewardRequestMessage() { }

    
        public AchievementRewardRequestMessage(short achievementId) {
            

            
            this.achievementId = achievementId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6377;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i16(this.achievementId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.achievementId = reader.read_i16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AchievementRewardRequestMessage(" +
        
            
            "achievementId=" +
            

            
            this.achievementId +
            
        
            ')';
    
    }
}

