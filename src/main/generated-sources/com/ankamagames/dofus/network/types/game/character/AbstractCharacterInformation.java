
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractCharacterInformation extends NetworkType {
    public static final int PROTOCOL_ID = 400;

    
        // vi32
        public int id;
    

    public AbstractCharacterInformation() { }

    
        public AbstractCharacterInformation(int id) {
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 400;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AbstractCharacterInformation(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

