
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsOfferMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6542;

    
        // i32
        public int requestId;
    
        // vi32
        public int requesterId;
    
        // vi16
        public short requesterCellId;
    
        // vi32
        public int requestedId;
    
        // vi16
        public short requestedCellId;
    

    public GameFightPlacementSwapPositionsOfferMessage() { }

    
        public GameFightPlacementSwapPositionsOfferMessage(int requestId, int requesterId, short requesterCellId, int requestedId, short requestedCellId) {
            

            
            this.requestId = requestId;
            
            this.requesterId = requesterId;
            
            this.requesterCellId = requesterCellId;
            
            this.requestedId = requestedId;
            
            this.requestedCellId = requestedCellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6542;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.requestId);
            

            

            

            
        
            
                writer.write_vi32(this.requesterId);
            

            

            

            
        
            
                writer.write_vi16(this.requesterCellId);
            

            

            

            
        
            
                writer.write_vi32(this.requestedId);
            

            

            

            
        
            
                writer.write_vi16(this.requestedCellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.requestId = reader.read_i32();
            

            

            

            
        
            
                this.requesterId = reader.read_vi32();
            

            

            

            
        
            
                this.requesterCellId = reader.read_vi16();
            

            

            

            
        
            
                this.requestedId = reader.read_vi32();
            

            

            

            
        
            
                this.requestedCellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightPlacementSwapPositionsOfferMessage(" +
        
            
            "requestId=" +
            

            
            this.requestId +
            
        
            
            ", requesterId=" +
            

            
            this.requesterId +
            
        
            
            ", requesterCellId=" +
            

            
            this.requesterCellId +
            
        
            
            ", requestedId=" +
            

            
            this.requestedId +
            
        
            
            ", requestedCellId=" +
            

            
            this.requestedCellId +
            
        
            ')';
    
    }
}

