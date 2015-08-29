
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameCautiousMapMovementMessage extends com.ankamagames.dofus.network.messages.game.context.GameMapMovementMessage {
    public static final int PROTOCOL_ID = 6497;

    

    public GameCautiousMapMovementMessage() { }

    
        public GameCautiousMapMovementMessage(short[] keyMovements, int actorId) {
            
            super(keyMovements, actorId);
            

            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6497;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
    }

    @Override
    public String toString() {
    
        return "GameCautiousMapMovementMessage(" +
        
            
            "keyMovements=" +
            

            
            
            java.util.Arrays.toString(this.keyMovements) +
            
            
        
            
            ", actorId=" +
            

            
            this.actorId +
            
        
            ')';
    
    }
}

