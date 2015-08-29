
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SkillActionDescriptionCraft extends com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription {
    public static final int PROTOCOL_ID = 100;

    
        // i8
        public byte maxSlots;
    
        // i8
        public byte probability;
    

    public SkillActionDescriptionCraft() { }

    
        public SkillActionDescriptionCraft(short skillId, byte maxSlots, byte probability) {
            
            super(skillId);
            

            
            this.maxSlots = maxSlots;
            
            this.probability = probability;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 100;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i8(this.maxSlots);
            

            

            

            
        
            
                writer.write_i8(this.probability);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.maxSlots = reader.read_i8();
            

            

            

            
        
            
                this.probability = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SkillActionDescriptionCraft(" +
        
            
            "skillId=" +
            

            
            this.skillId +
            
        
            
            ", maxSlots=" +
            

            
            this.maxSlots +
            
        
            
            ", probability=" +
            

            
            this.probability +
            
        
            ')';
    
    }
}

