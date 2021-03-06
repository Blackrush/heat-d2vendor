
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatedElement extends NetworkType {
    public static final int PROTOCOL_ID = 108;

    
        // i32
        public int elementId;
    
        // vi16
        public short elementCellId;
    
        // vi32
        public int elementState;
    

    public StatedElement() { }

    
        public StatedElement(int elementId, short elementCellId, int elementState) {
            

            
            this.elementId = elementId;
            
            this.elementCellId = elementCellId;
            
            this.elementState = elementState;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 108;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.elementId);
            

            

            

            
        
            
                writer.write_vi16(this.elementCellId);
            

            

            

            
        
            
                writer.write_vi32(this.elementState);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.elementId = reader.read_i32();
            

            

            

            
        
            
                this.elementCellId = reader.read_vi16();
            

            

            

            
        
            
                this.elementState = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StatedElement(" +
        
            
            "elementId=" +
            

            
            this.elementId +
            
        
            
            ", elementCellId=" +
            

            
            this.elementCellId +
            
        
            
            ", elementState=" +
            

            
            this.elementState +
            
        
            ')';
    
    }
}

