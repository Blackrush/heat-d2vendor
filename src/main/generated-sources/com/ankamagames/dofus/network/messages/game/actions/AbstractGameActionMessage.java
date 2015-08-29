
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractGameActionMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 1000;

    
        // vi16
        public short actionId;
    
        // i32
        public int sourceId;
    

    public AbstractGameActionMessage() { }

    
        public AbstractGameActionMessage(short actionId, int sourceId) {
            

            
            this.actionId = actionId;
            
            this.sourceId = sourceId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 1000;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.actionId);
            

            

            

            
        
            
                writer.write_i32(this.sourceId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.actionId = reader.read_vi16();
            

            

            

            
        
            
                this.sourceId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AbstractGameActionMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            ')';
    
    }
}

