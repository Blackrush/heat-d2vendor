
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyFollowStatusUpdateMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyMessage {
    public static final int PROTOCOL_ID = 5581;

    
        // bool
        public boolean success;
    
        // vi32
        public int followedId;
    

    public PartyFollowStatusUpdateMessage() { }

    
        public PartyFollowStatusUpdateMessage(int partyId, boolean success, int followedId) {
            
            super(partyId);
            

            
            this.success = success;
            
            this.followedId = followedId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5581;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_bool(this.success);
            

            

            

            
        
            
                writer.write_vi32(this.followedId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.success = reader.read_bool();
            

            

            

            
        
            
                this.followedId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyFollowStatusUpdateMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", success=" +
            

            
            this.success +
            
        
            
            ", followedId=" +
            

            
            this.followedId +
            
        
            ')';
    
    }
}

