
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCancelInvitationMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyMessage {
    public static final int PROTOCOL_ID = 6254;

    
        // vi32
        public int guestId;
    

    public PartyCancelInvitationMessage() { }

    
        public PartyCancelInvitationMessage(int partyId, int guestId) {
            
            super(partyId);
            

            
            this.guestId = guestId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6254;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.guestId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.guestId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyCancelInvitationMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", guestId=" +
            

            
            this.guestId +
            
        
            ')';
    
    }
}

