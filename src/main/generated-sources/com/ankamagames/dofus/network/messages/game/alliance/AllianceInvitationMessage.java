
// Created by Heat the 2015-03-01 20:21:53+01:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInvitationMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6395;

    
        // vi32
        public int targetId;
    

    public AllianceInvitationMessage() { }

    
        public AllianceInvitationMessage(int targetId) {
            

            
            this.targetId = targetId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6395;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.targetId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.targetId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AllianceInvitationMessage(" +
        
            
            "targetId=" +
            

            
            this.targetId +
            
        
            ')';
    
    }
}

