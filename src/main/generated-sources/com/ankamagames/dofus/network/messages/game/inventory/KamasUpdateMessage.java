
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KamasUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5537;

    
        // vi32
        public int kamasTotal;
    

    public KamasUpdateMessage() { }

    
        public KamasUpdateMessage(int kamasTotal) {
            

            
            this.kamasTotal = kamasTotal;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5537;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.kamasTotal);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.kamasTotal = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "KamasUpdateMessage(" +
        
            
            "kamasTotal=" +
            

            
            this.kamasTotal +
            
        
            ')';
    
    }
}

