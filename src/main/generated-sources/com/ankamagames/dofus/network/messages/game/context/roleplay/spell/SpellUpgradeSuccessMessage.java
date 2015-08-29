
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellUpgradeSuccessMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 1201;

    
        // i32
        public int spellId;
    
        // i8
        public byte spellLevel;
    

    public SpellUpgradeSuccessMessage() { }

    
        public SpellUpgradeSuccessMessage(int spellId, byte spellLevel) {
            

            
            this.spellId = spellId;
            
            this.spellLevel = spellLevel;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 1201;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.spellId);
            

            

            

            
        
            
                writer.write_i8(this.spellLevel);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.spellId = reader.read_i32();
            

            

            

            
        
            
                this.spellLevel = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SpellUpgradeSuccessMessage(" +
        
            
            "spellId=" +
            

            
            this.spellId +
            
        
            
            ", spellLevel=" +
            

            
            this.spellLevel +
            
        
            ')';
    
    }
}

