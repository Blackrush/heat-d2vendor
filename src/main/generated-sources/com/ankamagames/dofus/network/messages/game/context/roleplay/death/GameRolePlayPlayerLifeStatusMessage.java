
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.death;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerLifeStatusMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5996;

    
        // i8
        public byte state;
    

    public GameRolePlayPlayerLifeStatusMessage() { }

    
        public GameRolePlayPlayerLifeStatusMessage(byte state) {
            

            
            this.state = state;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5996;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.state);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.state = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayPlayerLifeStatusMessage(" +
        
            
            "state=" +
            

            
            this.state +
            
        
            ')';
    
    }
}

