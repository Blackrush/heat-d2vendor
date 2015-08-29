
// Created by Heat the 2015-03-01 20:21:52+01:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterLevelUpInformationMessage extends com.ankamagames.dofus.network.messages.game.character.stats.CharacterLevelUpMessage {
    public static final int PROTOCOL_ID = 6076;

    
        // str
        public java.lang.String name;
    
        // vi32
        public int id;
    

    public CharacterLevelUpInformationMessage() { }

    
        public CharacterLevelUpInformationMessage(short newLevel, java.lang.String name, int id) {
            
            super(newLevel);
            

            
            this.name = name;
            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6076;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_str(this.name);
            

            

            

            
        
            
                writer.write_vi32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.name = reader.read_str();
            

            

            

            
        
            
                this.id = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CharacterLevelUpInformationMessage(" +
        
            
            "newLevel=" +
            

            
            this.newLevel +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

