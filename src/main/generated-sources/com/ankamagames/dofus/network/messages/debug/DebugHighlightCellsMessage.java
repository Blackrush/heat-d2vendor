
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.debug;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DebugHighlightCellsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 2001;

    
        // i32
        public int color;
    
        // array,vi16
        public short[] cells;
    

    public DebugHighlightCellsMessage() { }

    
        public DebugHighlightCellsMessage(int color, short[] cells) {
            

            
            this.color = color;
            
            this.cells = cells;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 2001;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.color);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(cells.length);
                    
                    writer.write_array_vi16(this.cells);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.color = reader.read_i32();
            

            

            

            
        
            

            

            

            
                
                int cells_length = reader.read_ui16();
                

                
                    this.cells = reader.read_array_vi16(cells_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "DebugHighlightCellsMessage(" +
        
            
            "color=" +
            

            
            this.color +
            
        
            
            ", cells=" +
            

            
            
            java.util.Arrays.toString(this.cells) +
            
            
        
            ')';
    
    }
}

