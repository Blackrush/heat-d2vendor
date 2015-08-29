
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightPointsVariationMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 1030;

    
        // i32
        public int targetId;
    
        // i16
        public short delta;
    

    public GameActionFightPointsVariationMessage() { }

    
        public GameActionFightPointsVariationMessage(short actionId, int sourceId, int targetId, short delta) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.delta = delta;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 1030;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_i16(this.delta);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.delta = reader.read_i16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightPointsVariationMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", delta=" +
            

            
            this.delta +
            
        
            ')';
    
    }
}

