
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShowCellMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5612;

    
        // i32
        public int sourceId;
    
        // vi16
        public short cellId;
    

    public ShowCellMessage() { }

    
        public ShowCellMessage(int sourceId, short cellId) {
            

            
            this.sourceId = sourceId;
            
            this.cellId = cellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5612;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.sourceId);
            

            

            

            
        
            
                writer.write_vi16(this.cellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.sourceId = reader.read_i32();
            

            

            

            
        
            
                this.cellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ShowCellMessage(" +
        
            
            "sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", cellId=" +
            

            
            this.cellId +
            
        
            ')';
    
    }
}

