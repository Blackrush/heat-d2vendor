
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyLeaderUpdateMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyEventMessage {
    public static final int PROTOCOL_ID = 5578;

    
        // vi32
        public int partyLeaderId;
    

    public PartyLeaderUpdateMessage() { }

    
        public PartyLeaderUpdateMessage(int partyId, int partyLeaderId) {
            
            super(partyId);
            

            
            this.partyLeaderId = partyLeaderId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5578;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.partyLeaderId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.partyLeaderId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyLeaderUpdateMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", partyLeaderId=" +
            

            
            this.partyLeaderId +
            
        
            ')';
    
    }
}

