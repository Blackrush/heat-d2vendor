
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightInvisibleObstacleMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5820;

    
        // vi32
        public int sourceSpellId;
    

    public GameActionFightInvisibleObstacleMessage() { }

    
        public GameActionFightInvisibleObstacleMessage(short actionId, int sourceId, int sourceSpellId) {
            
            super(actionId, sourceId);
            

            
            this.sourceSpellId = sourceSpellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5820;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.sourceSpellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.sourceSpellId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightInvisibleObstacleMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", sourceSpellId=" +
            

            
            this.sourceSpellId +
            
        
            ')';
    
    }
}

