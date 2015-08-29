
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightLeaveMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 721;

    
        // i32
        public int charId;
    

    public GameFightLeaveMessage() { }

    
        public GameFightLeaveMessage(int charId) {
            

            
            this.charId = charId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 721;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.charId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.charId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightLeaveMessage(" +
        
            
            "charId=" +
            

            
            this.charId +
            
        
            ')';
    
    }
}

