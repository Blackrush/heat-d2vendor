
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HousePropertiesMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5734;

    
        // com.ankamagames.dofus.network.types.game.house.HouseInformations
        public com.ankamagames.dofus.network.types.game.house.HouseInformations properties;
    

    public HousePropertiesMessage() { }

    
        public HousePropertiesMessage(com.ankamagames.dofus.network.types.game.house.HouseInformations properties) {
            

            
            this.properties = properties;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5734;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
                writer.write_ui16(this.properties.getProtocolId());
                
            this.properties.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    int properties_typeId = reader.read_ui16();
                    this.properties = (com.ankamagames.dofus.network.types.game.house.HouseInformations) InternalProtocolTypeManager.get(properties_typeId);
                
                this.properties.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "HousePropertiesMessage(" +
        
            
            "properties=" +
            

            
            this.properties +
            
        
            ')';
    
    }
}

