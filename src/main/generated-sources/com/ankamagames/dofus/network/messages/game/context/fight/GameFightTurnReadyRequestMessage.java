
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnReadyRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 715;

    
        // i32
        public int id;
    

    public GameFightTurnReadyRequestMessage() { }

    
        public GameFightTurnReadyRequestMessage(int id) {
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 715;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightTurnReadyRequestMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

