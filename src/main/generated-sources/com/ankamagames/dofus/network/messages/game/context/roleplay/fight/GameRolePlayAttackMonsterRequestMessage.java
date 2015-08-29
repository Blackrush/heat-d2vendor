
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayAttackMonsterRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6191;

    
        // i32
        public int monsterGroupId;
    

    public GameRolePlayAttackMonsterRequestMessage() { }

    
        public GameRolePlayAttackMonsterRequestMessage(int monsterGroupId) {
            

            
            this.monsterGroupId = monsterGroupId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6191;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.monsterGroupId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.monsterGroupId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayAttackMonsterRequestMessage(" +
        
            
            "monsterGroupId=" +
            

            
            this.monsterGroupId +
            
        
            ')';
    
    }
}

