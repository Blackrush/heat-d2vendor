
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSlideMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5525;

    
        // i32
        public int targetId;
    
        // i16
        public short startCellId;
    
        // i16
        public short endCellId;
    

    public GameActionFightSlideMessage() { }

    
        public GameActionFightSlideMessage(short actionId, int sourceId, int targetId, short startCellId, short endCellId) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.startCellId = startCellId;
            
            this.endCellId = endCellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5525;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_i16(this.startCellId);
            

            

            

            
        
            
                writer.write_i16(this.endCellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.startCellId = reader.read_i16();
            

            

            

            
        
            
                this.endCellId = reader.read_i16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightSlideMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", startCellId=" +
            

            
            this.startCellId +
            
        
            
            ", endCellId=" +
            

            
            this.endCellId +
            
        
            ')';
    
    }
}

