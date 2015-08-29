
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildJoinedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5564;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
    
        // vi32
        public int memberRights;
    
        // bool
        public boolean enabled;
    

    public GuildJoinedMessage() { }

    
        public GuildJoinedMessage(com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo, int memberRights, boolean enabled) {
            

            
            this.guildInfo = guildInfo;
            
            this.memberRights = memberRights;
            
            this.enabled = enabled;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5564;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
            this.guildInfo.serialize(writer);
            
        
            
                writer.write_vi32(this.memberRights);
            

            

            

            
        
            
                writer.write_bool(this.enabled);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    this.guildInfo = new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
                
                this.guildInfo.deserialize(reader);
            

            
        
            
                this.memberRights = reader.read_vi32();
            

            

            

            
        
            
                this.enabled = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildJoinedMessage(" +
        
            
            "guildInfo=" +
            

            
            this.guildInfo +
            
        
            
            ", memberRights=" +
            

            
            this.memberRights +
            
        
            
            ", enabled=" +
            

            
            this.enabled +
            
        
            ')';
    
    }
}

