
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMemberOnlineStatusMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6061;

    
        // vi32
        public int memberId;
    
        // bool
        public boolean online;
    

    public GuildMemberOnlineStatusMessage() { }

    
        public GuildMemberOnlineStatusMessage(int memberId, boolean online) {
            

            
            this.memberId = memberId;
            
            this.online = online;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6061;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.memberId);
            

            

            

            
        
            
                writer.write_bool(this.online);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.memberId = reader.read_vi32();
            

            

            

            
        
            
                this.online = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildMemberOnlineStatusMessage(" +
        
            
            "memberId=" +
            

            
            this.memberId +
            
        
            
            ", online=" +
            

            
            this.online +
            
        
            ')';
    
    }
}

