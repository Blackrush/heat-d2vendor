
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeTargetUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6123;

    
        // vi16
        public short challengeId;
    
        // i32
        public int targetId;
    

    public ChallengeTargetUpdateMessage() { }

    
        public ChallengeTargetUpdateMessage(short challengeId, int targetId) {
            

            
            this.challengeId = challengeId;
            
            this.targetId = targetId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6123;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.challengeId);
            

            

            

            
        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.challengeId = reader.read_vi16();
            

            

            

            
        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChallengeTargetUpdateMessage(" +
        
            
            "challengeId=" +
            

            
            this.challengeId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            ')';
    
    }
}

