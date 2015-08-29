
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightTriggerGlyphTrapMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5741;

    
        // i16
        public short markId;
    
        // i32
        public int triggeringCharacterId;
    
        // vi16
        public short triggeredSpellId;
    

    public GameActionFightTriggerGlyphTrapMessage() { }

    
        public GameActionFightTriggerGlyphTrapMessage(short actionId, int sourceId, short markId, int triggeringCharacterId, short triggeredSpellId) {
            
            super(actionId, sourceId);
            

            
            this.markId = markId;
            
            this.triggeringCharacterId = triggeringCharacterId;
            
            this.triggeredSpellId = triggeredSpellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5741;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i16(this.markId);
            

            

            

            
        
            
                writer.write_i32(this.triggeringCharacterId);
            

            

            

            
        
            
                writer.write_vi16(this.triggeredSpellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.markId = reader.read_i16();
            

            

            

            
        
            
                this.triggeringCharacterId = reader.read_i32();
            

            

            

            
        
            
                this.triggeredSpellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightTriggerGlyphTrapMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", markId=" +
            

            
            this.markId +
            
        
            
            ", triggeringCharacterId=" +
            

            
            this.triggeringCharacterId +
            
        
            
            ", triggeredSpellId=" +
            

            
            this.triggeredSpellId +
            
        
            ')';
    
    }
}

