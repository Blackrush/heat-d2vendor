
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightCloseCombatMessage extends com.ankamagames.dofus.network.messages.game.actions.fight.AbstractGameActionFightTargetedAbilityMessage {
    public static final int PROTOCOL_ID = 6116;

    
        // vi16
        public short weaponGenericId;
    

    public GameActionFightCloseCombatMessage() { }

    
        public GameActionFightCloseCombatMessage(short actionId, int sourceId, int targetId, short destinationCellId, byte critical, boolean silentCast, short weaponGenericId) {
            
            super(actionId, sourceId, targetId, destinationCellId, critical, silentCast);
            

            
            this.weaponGenericId = weaponGenericId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6116;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi16(this.weaponGenericId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.weaponGenericId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightCloseCombatMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", destinationCellId=" +
            

            
            this.destinationCellId +
            
        
            
            ", critical=" +
            

            
            this.critical +
            
        
            
            ", silentCast=" +
            

            
            this.silentCast +
            
        
            
            ", weaponGenericId=" +
            

            
            this.weaponGenericId +
            
        
            ')';
    
    }
}

