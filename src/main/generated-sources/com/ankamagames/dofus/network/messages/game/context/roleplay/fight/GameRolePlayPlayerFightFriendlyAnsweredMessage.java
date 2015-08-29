
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerFightFriendlyAnsweredMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5733;

    
        // i32
        public int fightId;
    
        // vi32
        public int sourceId;
    
        // vi32
        public int targetId;
    
        // bool
        public boolean accept;
    

    public GameRolePlayPlayerFightFriendlyAnsweredMessage() { }

    
        public GameRolePlayPlayerFightFriendlyAnsweredMessage(int fightId, int sourceId, int targetId, boolean accept) {
            

            
            this.fightId = fightId;
            
            this.sourceId = sourceId;
            
            this.targetId = targetId;
            
            this.accept = accept;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5733;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.fightId);
            

            

            

            
        
            
                writer.write_vi32(this.sourceId);
            

            

            

            
        
            
                writer.write_vi32(this.targetId);
            

            

            

            
        
            
                writer.write_bool(this.accept);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.fightId = reader.read_i32();
            

            

            

            
        
            
                this.sourceId = reader.read_vi32();
            

            

            

            
        
            
                this.targetId = reader.read_vi32();
            

            

            

            
        
            
                this.accept = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayPlayerFightFriendlyAnsweredMessage(" +
        
            
            "fightId=" +
            

            
            this.fightId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", accept=" +
            

            
            this.accept +
            
        
            ')';
    
    }
}

