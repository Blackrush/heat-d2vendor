
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionsAllAttributionMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6537;

    
        // i32
        public int characterId;
    

    public StartupActionsAllAttributionMessage() { }

    
        public StartupActionsAllAttributionMessage(int characterId) {
            

            
            this.characterId = characterId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6537;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.characterId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.characterId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StartupActionsAllAttributionMessage(" +
        
            
            "characterId=" +
            

            
            this.characterId +
            
        
            ')';
    
    }
}

