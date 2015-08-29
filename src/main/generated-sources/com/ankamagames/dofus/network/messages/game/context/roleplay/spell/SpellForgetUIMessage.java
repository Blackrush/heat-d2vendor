
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellForgetUIMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5565;

    
        // bool
        public boolean open;
    

    public SpellForgetUIMessage() { }

    
        public SpellForgetUIMessage(boolean open) {
            

            
            this.open = open;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5565;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.open);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.open = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SpellForgetUIMessage(" +
        
            
            "open=" +
            

            
            this.open +
            
        
            ')';
    
    }
}

