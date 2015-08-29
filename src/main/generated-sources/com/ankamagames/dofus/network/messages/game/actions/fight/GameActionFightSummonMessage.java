
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSummonMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5825;

    
        // com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
        public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations summon;
    

    public GameActionFightSummonMessage() { }

    
        public GameActionFightSummonMessage(short actionId, int sourceId, com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations summon) {
            
            super(actionId, sourceId);
            

            
            this.summon = summon;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5825;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            

            

            
                
                writer.write_ui16(this.summon.getProtocolId());
                
            this.summon.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            
                
                    int summon_typeId = reader.read_ui16();
                    this.summon = (com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations) InternalProtocolTypeManager.get(summon_typeId);
                
                this.summon.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightSummonMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", summon=" +
            

            
            this.summon +
            
        
            ')';
    
    }
}

