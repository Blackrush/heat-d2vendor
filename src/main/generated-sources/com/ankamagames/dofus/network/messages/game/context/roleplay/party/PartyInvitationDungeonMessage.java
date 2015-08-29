
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationDungeonMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyInvitationMessage {
    public static final int PROTOCOL_ID = 6244;

    
        // vi16
        public short dungeonId;
    

    public PartyInvitationDungeonMessage() { }

    
        public PartyInvitationDungeonMessage(int partyId, byte partyType, java.lang.String partyName, byte maxParticipants, int fromId, java.lang.String fromName, int toId, short dungeonId) {
            
            super(partyId, partyType, partyName, maxParticipants, fromId, fromName, toId);
            

            
            this.dungeonId = dungeonId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6244;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi16(this.dungeonId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.dungeonId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyInvitationDungeonMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", partyType=" +
            

            
            this.partyType +
            
        
            
            ", partyName=" +
            

            
            this.partyName +
            
        
            
            ", maxParticipants=" +
            

            
            this.maxParticipants +
            
        
            
            ", fromId=" +
            

            
            this.fromId +
            
        
            
            ", fromName=" +
            

            
            this.fromName +
            
        
            
            ", toId=" +
            

            
            this.toId +
            
        
            
            ", dungeonId=" +
            

            
            this.dungeonId +
            
        
            ')';
    
    }
}

