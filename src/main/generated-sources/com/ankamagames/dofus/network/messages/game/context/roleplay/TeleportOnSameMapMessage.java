
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportOnSameMapMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6048;

    
        // i32
        public int targetId;
    
        // vi16
        public short cellId;
    

    public TeleportOnSameMapMessage() { }

    
        public TeleportOnSameMapMessage(int targetId, short cellId) {
            

            
            this.targetId = targetId;
            
            this.cellId = cellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6048;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_vi16(this.cellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.cellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "TeleportOnSameMapMessage(" +
        
            
            "targetId=" +
            

            
            this.targetId +
            
        
            
            ", cellId=" +
            

            
            this.cellId +
            
        
            ')';
    
    }
}

