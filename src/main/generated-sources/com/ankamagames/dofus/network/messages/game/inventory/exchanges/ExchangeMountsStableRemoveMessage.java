
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountsStableRemoveMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6556;

    
        // array,vi32
        public int[] mountsId;
    

    public ExchangeMountsStableRemoveMessage() { }

    
        public ExchangeMountsStableRemoveMessage(int[] mountsId) {
            

            
            this.mountsId = mountsId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6556;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(mountsId.length);
                    
                    writer.write_array_vi32(this.mountsId);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int mountsId_length = reader.read_ui16();
                

                
                    this.mountsId = reader.read_array_vi32(mountsId_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeMountsStableRemoveMessage(" +
        
            
            "mountsId=" +
            

            
            
            java.util.Arrays.toString(this.mountsId) +
            
            
        
            ')';
    
    }
}

