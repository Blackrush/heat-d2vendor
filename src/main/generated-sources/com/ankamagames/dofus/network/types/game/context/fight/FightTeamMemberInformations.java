
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberInformations extends NetworkType {
    public static final int PROTOCOL_ID = 44;

    
        // i32
        public int id;
    

    public FightTeamMemberInformations() { }

    
        public FightTeamMemberInformations(int id) {
            

            
            this.id = id;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 44;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.id);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "FightTeamMemberInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            ')';
    
    }
}

