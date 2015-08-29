
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsRequestMessage extends com.ankamagames.dofus.network.messages.game.context.fight.GameFightPlacementPositionRequestMessage {
    public static final int PROTOCOL_ID = 6541;

    
        // i32
        public int requestedId;
    

    public GameFightPlacementSwapPositionsRequestMessage() { }

    
        public GameFightPlacementSwapPositionsRequestMessage(short cellId, int requestedId) {
            
            super(cellId);
            

            
            this.requestedId = requestedId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6541;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.requestedId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.requestedId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightPlacementSwapPositionsRequestMessage(" +
        
            
            "cellId=" +
            

            
            this.cellId +
            
        
            
            ", requestedId=" +
            

            
            this.requestedId +
            
        
            ')';
    
    }
}

