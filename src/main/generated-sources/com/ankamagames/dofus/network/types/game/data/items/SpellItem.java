
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellItem extends com.ankamagames.dofus.network.types.game.data.items.Item {
    public static final int PROTOCOL_ID = 49;

    
        // ui8
        public short position;
    
        // i32
        public int spellId;
    
        // i8
        public byte spellLevel;
    

    public SpellItem() { }

    
        public SpellItem(short position, int spellId, byte spellLevel) {
            
            super();
            

            
            this.position = position;
            
            this.spellId = spellId;
            
            this.spellLevel = spellLevel;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 49;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_ui8(this.position);
            

            

            

            
        
            
                writer.write_i32(this.spellId);
            

            

            

            
        
            
                writer.write_i8(this.spellLevel);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.position = reader.read_ui8();
            

            

            

            
        
            
                this.spellId = reader.read_i32();
            

            

            

            
        
            
                this.spellLevel = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SpellItem(" +
        
            
            "position=" +
            

            
            this.position +
            
        
            
            ", spellId=" +
            

            
            this.spellId +
            
        
            
            ", spellLevel=" +
            

            
            this.spellLevel +
            
        
            ')';
    
    }
}

