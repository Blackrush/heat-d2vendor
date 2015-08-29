
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberCompanionInformations extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations {
    public static final int PROTOCOL_ID = 451;

    
        // i8
        public byte companionId;
    
        // ui8
        public short level;
    
        // i32
        public int masterId;
    

    public FightTeamMemberCompanionInformations() { }

    
        public FightTeamMemberCompanionInformations(int id, byte companionId, short level, int masterId) {
            
            super(id);
            

            
            this.companionId = companionId;
            
            this.level = level;
            
            this.masterId = masterId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 451;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i8(this.companionId);
            

            

            

            
        
            
                writer.write_ui8(this.level);
            

            

            

            
        
            
                writer.write_i32(this.masterId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.companionId = reader.read_i8();
            

            

            

            
        
            
                this.level = reader.read_ui8();
            

            

            

            
        
            
                this.masterId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "FightTeamMemberCompanionInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", companionId=" +
            

            
            this.companionId +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", masterId=" +
            

            
            this.masterId +
            
        
            ')';
    
    }
}

