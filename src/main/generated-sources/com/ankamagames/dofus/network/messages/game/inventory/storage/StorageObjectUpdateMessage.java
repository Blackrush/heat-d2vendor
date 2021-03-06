
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageObjectUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5647;

    
        // com.ankamagames.dofus.network.types.game.data.items.ObjectItem
        public com.ankamagames.dofus.network.types.game.data.items.ObjectItem object;
    

    public StorageObjectUpdateMessage() { }

    
        public StorageObjectUpdateMessage(com.ankamagames.dofus.network.types.game.data.items.ObjectItem object) {
            

            
            this.object = object;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5647;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
            this.object.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();
                
                this.object.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "StorageObjectUpdateMessage(" +
        
            
            "object=" +
            

            
            this.object +
            
        
            ')';
    
    }
}

