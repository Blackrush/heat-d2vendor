
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberEjectedMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyMemberRemoveMessage {
    public static final int PROTOCOL_ID = 6252;

    
        // vi32
        public int kickerId;
    

    public PartyMemberEjectedMessage() { }

    
        public PartyMemberEjectedMessage(int partyId, int leavingPlayerId, int kickerId) {
            
            super(partyId, leavingPlayerId);
            

            
            this.kickerId = kickerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6252;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.kickerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.kickerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyMemberEjectedMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", leavingPlayerId=" +
            

            
            this.leavingPlayerId +
            
        
            
            ", kickerId=" +
            

            
            this.kickerId +
            
        
            ')';
    
    }
}

