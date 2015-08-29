
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalGuildInformations extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations {
    public static final int PROTOCOL_ID = 445;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild;
    

    public CharacterMinimalGuildInformations() { }

    
        public CharacterMinimalGuildInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild) {
            
            super(id, level, name, entityLook);
            

            
            this.guild = guild;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 445;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            

            

            
                
            this.guild.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            
                
                    this.guild = new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
                
                this.guild.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "CharacterMinimalGuildInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", entityLook=" +
            

            
            this.entityLook +
            
        
            
            ", guild=" +
            

            
            this.guild +
            
        
            ')';
    
    }
}

