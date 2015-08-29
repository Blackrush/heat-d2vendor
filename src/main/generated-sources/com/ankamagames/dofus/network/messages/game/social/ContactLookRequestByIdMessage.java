
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookRequestByIdMessage extends com.ankamagames.dofus.network.messages.game.social.ContactLookRequestMessage {
    public static final int PROTOCOL_ID = 5935;

    
        // vi32
        public int playerId;
    

    public ContactLookRequestByIdMessage() { }

    
        public ContactLookRequestByIdMessage(short requestId, byte contactType, int playerId) {
            
            super(requestId, contactType);
            

            
            this.playerId = playerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5935;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ContactLookRequestByIdMessage(" +
        
            
            "requestId=" +
            

            
            this.requestId +
            
        
            
            ", contactType=" +
            

            
            this.contactType +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            ')';
    
    }
}

