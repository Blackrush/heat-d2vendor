
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobMultiCraftAvailableSkillsMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.job.JobAllowMultiCraftRequestMessage {
    public static final int PROTOCOL_ID = 5747;

    
        // vi32
        public int playerId;
    
        // array,vi16
        public short[] skills;
    

    public JobMultiCraftAvailableSkillsMessage() { }

    
        public JobMultiCraftAvailableSkillsMessage(boolean enabled, int playerId, short[] skills) {
            
            super(enabled);
            

            
            this.playerId = playerId;
            
            this.skills = skills;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5747;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(skills.length);
                    
                    writer.write_array_vi16(this.skills);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            

            

            

            
                
                int skills_length = reader.read_ui16();
                

                
                    this.skills = reader.read_array_vi16(skills_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "JobMultiCraftAvailableSkillsMessage(" +
        
            
            "enabled=" +
            

            
            this.enabled +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            
            ", skills=" +
            

            
            
            java.util.Arrays.toString(this.skills) +
            
            
        
            ')';
    
    }
}

