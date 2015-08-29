
// Created by Heat the 2015-03-01 20:21:52+01:00
package com.ankamagames.dofus.network.messages.game.character.replay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterReplayRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 167;

    
        // i32
        public int characterId;
    

    public CharacterReplayRequestMessage() { }

    
        public CharacterReplayRequestMessage(int characterId) {
            

            
            this.characterId = characterId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 167;
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
    
        return "CharacterReplayRequestMessage(" +
        
            
            "characterId=" +
            

            
            this.characterId +
            
        
            ')';
    
    }
}

