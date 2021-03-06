
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightTriggerEffectMessage extends com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightDispellEffectMessage {
    public static final int PROTOCOL_ID = 6147;

    

    public GameActionFightTriggerEffectMessage() { }

    
        public GameActionFightTriggerEffectMessage(short actionId, int sourceId, int targetId, int boostUID) {
            
            super(actionId, sourceId, targetId, boostUID);
            

            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6147;
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
    
        return "GameActionFightTriggerEffectMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", boostUID=" +
            

            
            this.boostUID +
            
        
            ')';
    
    }
}

