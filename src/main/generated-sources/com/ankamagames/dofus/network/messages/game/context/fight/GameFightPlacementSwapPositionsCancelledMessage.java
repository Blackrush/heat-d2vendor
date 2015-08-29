
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsCancelledMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6546;

    
        // i32
        public int requestId;
    
        // vi32
        public int cancellerId;
    

    public GameFightPlacementSwapPositionsCancelledMessage() { }

    
        public GameFightPlacementSwapPositionsCancelledMessage(int requestId, int cancellerId) {
            

            
            this.requestId = requestId;
            
            this.cancellerId = cancellerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6546;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.requestId);
            

            

            

            
        
            
                writer.write_vi32(this.cancellerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.requestId = reader.read_i32();
            

            

            

            
        
            
                this.cancellerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightPlacementSwapPositionsCancelledMessage(" +
        
            
            "requestId=" +
            

            
            this.requestId +
            
        
            
            ", cancellerId=" +
            

            
            this.cancellerId +
            
        
            ')';
    
    }
}

