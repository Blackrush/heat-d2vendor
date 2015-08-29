
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementDetailsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6378;

    
        // com.ankamagames.dofus.network.types.game.achievement.Achievement
        public com.ankamagames.dofus.network.types.game.achievement.Achievement achievement;
    

    public AchievementDetailsMessage() { }

    
        public AchievementDetailsMessage(com.ankamagames.dofus.network.types.game.achievement.Achievement achievement) {
            

            
            this.achievement = achievement;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6378;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
            this.achievement.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    this.achievement = new com.ankamagames.dofus.network.types.game.achievement.Achievement();
                
                this.achievement.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "AchievementDetailsMessage(" +
        
            
            "achievement=" +
            

            
            this.achievement +
            
        
            ')';
    
    }
}

