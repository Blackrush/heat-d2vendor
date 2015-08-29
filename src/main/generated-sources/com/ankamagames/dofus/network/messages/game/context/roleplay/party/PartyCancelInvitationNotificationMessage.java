
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCancelInvitationNotificationMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyEventMessage {
    public static final int PROTOCOL_ID = 6251;

    
        // vi32
        public int cancelerId;
    
        // vi32
        public int guestId;
    

    public PartyCancelInvitationNotificationMessage() { }

    
        public PartyCancelInvitationNotificationMessage(int partyId, int cancelerId, int guestId) {
            
            super(partyId);
            

            
            this.cancelerId = cancelerId;
            
            this.guestId = guestId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6251;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.cancelerId);
            

            

            

            
        
            
                writer.write_vi32(this.guestId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.cancelerId = reader.read_vi32();
            

            

            

            
        
            
                this.guestId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyCancelInvitationNotificationMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", cancelerId=" +
            

            
            this.cancelerId +
            
        
            
            ", guestId=" +
            

            
            this.guestId +
            
        
            ')';
    
    }
}

