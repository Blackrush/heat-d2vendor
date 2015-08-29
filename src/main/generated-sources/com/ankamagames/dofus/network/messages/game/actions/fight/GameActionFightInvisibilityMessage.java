
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightInvisibilityMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5821;

    
        // i32
        public int targetId;
    
        // i8
        public byte state;
    

    public GameActionFightInvisibilityMessage() { }

    
        public GameActionFightInvisibilityMessage(short actionId, int sourceId, int targetId, byte state) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.state = state;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5821;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_i8(this.state);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.state = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightInvisibilityMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", state=" +
            

            
            this.state +
            
        
            ')';
    
    }
}

