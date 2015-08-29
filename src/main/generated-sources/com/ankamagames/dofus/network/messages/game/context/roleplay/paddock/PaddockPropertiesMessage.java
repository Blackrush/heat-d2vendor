
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockPropertiesMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5824;

    
        // com.ankamagames.dofus.network.types.game.paddock.PaddockInformations
        public com.ankamagames.dofus.network.types.game.paddock.PaddockInformations properties;
    

    public PaddockPropertiesMessage() { }

    
        public PaddockPropertiesMessage(com.ankamagames.dofus.network.types.game.paddock.PaddockInformations properties) {
            

            
            this.properties = properties;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5824;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
                writer.write_ui16(this.properties.getProtocolId());
                
            this.properties.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    int properties_typeId = reader.read_ui16();
                    this.properties = (com.ankamagames.dofus.network.types.game.paddock.PaddockInformations) InternalProtocolTypeManager.get(properties_typeId);
                
                this.properties.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockPropertiesMessage(" +
        
            
            "properties=" +
            

            
            this.properties +
            
        
            ')';
    
    }
}

