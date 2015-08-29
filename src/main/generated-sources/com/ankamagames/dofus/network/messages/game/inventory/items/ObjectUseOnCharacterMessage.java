
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectUseOnCharacterMessage extends com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseMessage {
    public static final int PROTOCOL_ID = 3003;

    
        // vi32
        public int characterId;
    

    public ObjectUseOnCharacterMessage() { }

    
        public ObjectUseOnCharacterMessage(int objectUID, int characterId) {
            
            super(objectUID);
            

            
            this.characterId = characterId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 3003;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.characterId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.characterId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ObjectUseOnCharacterMessage(" +
        
            
            "objectUID=" +
            

            
            this.objectUID +
            
        
            
            ", characterId=" +
            

            
            this.characterId +
            
        
            ')';
    
    }
}

