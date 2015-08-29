
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterBaseInformations extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations {
    public static final int PROTOCOL_ID = 45;

    
        // i8
        public byte breed;
    
        // bool
        public boolean sex;
    

    public CharacterBaseInformations() { }

    
        public CharacterBaseInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, byte breed, boolean sex) {
            
            super(id, level, name, entityLook);
            

            
            this.breed = breed;
            
            this.sex = sex;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 45;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i8(this.breed);
            

            

            

            
        
            
                writer.write_bool(this.sex);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.breed = reader.read_i8();
            

            

            

            
        
            
                this.sex = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CharacterBaseInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", entityLook=" +
            

            
            this.entityLook +
            
        
            
            ", breed=" +
            

            
            this.breed +
            
        
            
            ", sex=" +
            

            
            this.sex +
            
        
            ')';
    
    }
}

