
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageKamasUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5645;

    
        // i32
        public int kamasTotal;
    

    public StorageKamasUpdateMessage() { }

    
        public StorageKamasUpdateMessage(int kamasTotal) {
            

            
            this.kamasTotal = kamasTotal;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5645;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.kamasTotal);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.kamasTotal = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StorageKamasUpdateMessage(" +
        
            
            "kamasTotal=" +
            

            
            this.kamasTotal +
            
        
            ')';
    
    }
}

