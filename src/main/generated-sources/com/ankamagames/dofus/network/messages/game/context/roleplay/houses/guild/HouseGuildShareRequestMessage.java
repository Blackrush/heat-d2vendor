
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildShareRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5704;

    
        // bool
        public boolean enable;
    
        // vi32
        public int rights;
    

    public HouseGuildShareRequestMessage() { }

    
        public HouseGuildShareRequestMessage(boolean enable, int rights) {
            

            
            this.enable = enable;
            
            this.rights = rights;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5704;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.enable);
            

            

            

            
        
            
                writer.write_vi32(this.rights);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.enable = reader.read_bool();
            

            

            

            
        
            
                this.rights = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "HouseGuildShareRequestMessage(" +
        
            
            "enable=" +
            

            
            this.enable +
            
        
            
            ", rights=" +
            

            
            this.rights +
            
        
            ')';
    
    }
}

