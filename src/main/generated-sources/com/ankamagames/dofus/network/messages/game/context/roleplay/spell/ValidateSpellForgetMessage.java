
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ValidateSpellForgetMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 1700;

    
        // vi16
        public short spellId;
    

    public ValidateSpellForgetMessage() { }

    
        public ValidateSpellForgetMessage(short spellId) {
            

            
            this.spellId = spellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 1700;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.spellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.spellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ValidateSpellForgetMessage(" +
        
            
            "spellId=" +
            

            
            this.spellId +
            
        
            ')';
    
    }
}

