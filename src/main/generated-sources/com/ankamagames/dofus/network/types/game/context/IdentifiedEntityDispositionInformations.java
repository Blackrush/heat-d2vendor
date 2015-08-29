
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentifiedEntityDispositionInformations extends com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations {
    public static final int PROTOCOL_ID = 107;

    
        // i32
        public int id;
    

    public IdentifiedEntityDispositionInformations() { }

    
        public IdentifiedEntityDispositionInformations(short cellId, byte direction, int id) {
            
            super(cellId, direction);
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 107;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.id = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "IdentifiedEntityDispositionInformations(" +
        
            
            "cellId=" +
            

            
            this.cellId +
            
        
            
            ", direction=" +
            

            
            this.direction +
            
        
            
            ", id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

