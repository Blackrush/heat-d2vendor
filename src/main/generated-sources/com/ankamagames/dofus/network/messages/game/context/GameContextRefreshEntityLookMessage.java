
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRefreshEntityLookMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5637;

    
        // i32
        public int id;
    
        // com.ankamagames.dofus.network.types.game.look.EntityLook
        public com.ankamagames.dofus.network.types.game.look.EntityLook look;
    

    public GameContextRefreshEntityLookMessage() { }

    
        public GameContextRefreshEntityLookMessage(int id, com.ankamagames.dofus.network.types.game.look.EntityLook look) {
            

            
            this.id = id;
            
            this.look = look;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5637;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.id);
            

            

            

            
        
            

            

            

            
                
            this.look.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_i32();
            

            

            

            
        
            

            

            
                
                    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
                
                this.look.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "GameContextRefreshEntityLookMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", look=" +
            

            
            this.look +
            
        
            ')';
    
    }
}

