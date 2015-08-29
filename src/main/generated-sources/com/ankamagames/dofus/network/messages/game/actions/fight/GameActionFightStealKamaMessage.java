
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightStealKamaMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 5535;

    
        // i32
        public int targetId;
    
        // vi32
        public int amount;
    

    public GameActionFightStealKamaMessage() { }

    
        public GameActionFightStealKamaMessage(short actionId, int sourceId, int targetId, int amount) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.amount = amount;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5535;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_vi32(this.amount);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.amount = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightStealKamaMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", amount=" +
            

            
            this.amount +
            
        
            ')';
    
    }
}

