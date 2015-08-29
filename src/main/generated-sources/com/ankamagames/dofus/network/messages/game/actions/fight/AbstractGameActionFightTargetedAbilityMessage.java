
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractGameActionFightTargetedAbilityMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 6118;

    
        // i32
        public int targetId;
    
        // i16
        public short destinationCellId;
    
        // i8
        public byte critical;
    
        // bool
        public boolean silentCast;
    

    public AbstractGameActionFightTargetedAbilityMessage() { }

    
        public AbstractGameActionFightTargetedAbilityMessage(short actionId, int sourceId, int targetId, short destinationCellId, byte critical, boolean silentCast) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.destinationCellId = destinationCellId;
            
            this.critical = critical;
            
            this.silentCast = silentCast;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6118;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_i16(this.destinationCellId);
            

            

            

            
        
            
                writer.write_i8(this.critical);
            

            

            

            
        
            
                writer.write_bool(this.silentCast);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.destinationCellId = reader.read_i16();
            

            

            

            
        
            
                this.critical = reader.read_i8();
            

            

            

            
        
            
                this.silentCast = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AbstractGameActionFightTargetedAbilityMessage(" +
        
            
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
            
        
            ')';
    
    }
}

