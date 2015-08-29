
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellForgottenMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5834;

    
        // array,vi16
        public short[] spellsId;
    
        // vi16
        public short boostPoint;
    

    public SpellForgottenMessage() { }

    
        public SpellForgottenMessage(short[] spellsId, short boostPoint) {
            

            
            this.spellsId = spellsId;
            
            this.boostPoint = boostPoint;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5834;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(spellsId.length);
                    
                    writer.write_array_vi16(this.spellsId);
                
            

            

            
        
            
                writer.write_vi16(this.boostPoint);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int spellsId_length = reader.read_ui16();
                

                
                    this.spellsId = reader.read_array_vi16(spellsId_length);
                
            
        
            
                this.boostPoint = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SpellForgottenMessage(" +
        
            
            "spellsId=" +
            

            
            
            java.util.Arrays.toString(this.spellsId) +
            
            
        
            
            ", boostPoint=" +
            

            
            this.boostPoint +
            
        
            ')';
    
    }
}

