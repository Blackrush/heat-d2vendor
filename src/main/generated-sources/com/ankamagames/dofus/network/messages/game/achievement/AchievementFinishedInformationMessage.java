
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementFinishedInformationMessage extends com.ankamagames.dofus.network.messages.game.achievement.AchievementFinishedMessage {
    public static final int PROTOCOL_ID = 6381;

    
        // str
        public java.lang.String name;
    
        // vi32
        public int playerId;
    

    public AchievementFinishedInformationMessage() { }

    
        public AchievementFinishedInformationMessage(short id, short finishedlevel, java.lang.String name, int playerId) {
            
            super(id, finishedlevel);
            

            
            this.name = name;
            
            this.playerId = playerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6381;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_str(this.name);
            

            

            

            
        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.name = reader.read_str();
            

            

            

            
        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AchievementFinishedInformationMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", finishedlevel=" +
            

            
            this.finishedlevel +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            ')';
    
    }
}

