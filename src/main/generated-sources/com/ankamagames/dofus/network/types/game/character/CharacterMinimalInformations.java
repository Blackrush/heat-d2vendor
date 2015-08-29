
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalInformations extends com.ankamagames.dofus.network.types.game.character.AbstractCharacterInformation {
    public static final int PROTOCOL_ID = 110;

    
        // ui8
        public short level;
    
        // str
        public java.lang.String name;
    

    public CharacterMinimalInformations() { }

    
        public CharacterMinimalInformations(int id, short level, java.lang.String name) {
            
            super(id);
            

            
            this.level = level;
            
            this.name = name;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 110;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_ui8(this.level);
            

            

            

            
        
            
                writer.write_str(this.name);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.level = reader.read_ui8();
            

            

            

            
        
            
                this.name = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CharacterMinimalInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            ')';
    
    }
}

