
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayAggressionMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6073;

    
        // vi32
        public int attackerId;
    
        // vi32
        public int defenderId;
    

    public GameRolePlayAggressionMessage() { }

    
        public GameRolePlayAggressionMessage(int attackerId, int defenderId) {
            

            
            this.attackerId = attackerId;
            
            this.defenderId = defenderId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6073;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.attackerId);
            

            

            

            
        
            
                writer.write_vi32(this.defenderId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.attackerId = reader.read_vi32();
            

            

            

            
        
            
                this.defenderId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayAggressionMessage(" +
        
            
            "attackerId=" +
            

            
            this.attackerId +
            
        
            
            ", defenderId=" +
            

            
            this.defenderId +
            
        
            ')';
    
    }
}

