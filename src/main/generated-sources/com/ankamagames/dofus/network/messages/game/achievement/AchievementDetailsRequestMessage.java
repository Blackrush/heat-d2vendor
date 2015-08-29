
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementDetailsRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6380;

    
        // vi16
        public short achievementId;
    

    public AchievementDetailsRequestMessage() { }

    
        public AchievementDetailsRequestMessage(short achievementId) {
            

            
            this.achievementId = achievementId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6380;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.achievementId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.achievementId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AchievementDetailsRequestMessage(" +
        
            
            "achievementId=" +
            

            
            this.achievementId +
            
        
            ')';
    
    }
}

