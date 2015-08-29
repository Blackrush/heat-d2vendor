
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSpellCastMessage extends com.ankamagames.dofus.network.messages.game.actions.fight.AbstractGameActionFightTargetedAbilityMessage {
    public static final int PROTOCOL_ID = 1010;

    
        // vi16
        public short spellId;
    
        // i8
        public byte spellLevel;
    
        // array,i16
        public short[] portalsIds;
    

    public GameActionFightSpellCastMessage() { }

    
        public GameActionFightSpellCastMessage(short actionId, int sourceId, int targetId, short destinationCellId, byte critical, boolean silentCast, short spellId, byte spellLevel, short[] portalsIds) {
            
            super(actionId, sourceId, targetId, destinationCellId, critical, silentCast);
            

            
            this.spellId = spellId;
            
            this.spellLevel = spellLevel;
            
            this.portalsIds = portalsIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 1010;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi16(this.spellId);
            

            

            

            
        
            
                writer.write_i8(this.spellLevel);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(portalsIds.length);
                    
                    writer.write_array_i16(this.portalsIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.spellId = reader.read_vi16();
            

            

            

            
        
            
                this.spellLevel = reader.read_i8();
            

            

            

            
        
            

            

            

            
                
                int portalsIds_length = reader.read_ui16();
                

                
                    this.portalsIds = reader.read_array_i16(portalsIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightSpellCastMessage(" +
        
            
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
            
        
            
            ", spellId=" +
            

            
            this.spellId +
            
        
            
            ", spellLevel=" +
            

            
            this.spellLevel +
            
        
            
            ", portalsIds=" +
            

            
            
            java.util.Arrays.toString(this.portalsIds) +
            
            
        
            ')';
    
    }
}

