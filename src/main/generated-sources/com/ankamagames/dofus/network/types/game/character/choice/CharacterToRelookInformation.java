
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterToRelookInformation extends com.ankamagames.dofus.network.types.game.character.choice.AbstractCharacterToRefurbishInformation {
    public static final int PROTOCOL_ID = 399;

    

    public CharacterToRelookInformation() { }

    
        public CharacterToRelookInformation(int id, int[] colors, int cosmeticId) {
            
            super(id, colors, cosmeticId);
            

            
        }

        
    

    @Override
    public int getProtocolId() {
        return 399;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
    }

    @Override
    public String toString() {
    
        return "CharacterToRelookInformation(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", colors=" +
            

            
            
            java.util.Arrays.toString(this.colors) +
            
            
        
            
            ", cosmeticId=" +
            

            
            this.cosmeticId +
            
        
            ')';
    
    }
}

