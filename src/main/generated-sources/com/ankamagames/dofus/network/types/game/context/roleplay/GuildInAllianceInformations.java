
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInAllianceInformations extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
    public static final int PROTOCOL_ID = 420;

    
        // ui8
        public short guildLevel;
    
        // ui8
        public short nbMembers;
    
        // bool
        public boolean enabled;
    

    public GuildInAllianceInformations() { }

    
        public GuildInAllianceInformations(int guildId, java.lang.String guildName, com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem, short guildLevel, short nbMembers, boolean enabled) {
            
            super(guildId, guildName, guildEmblem);
            

            
            this.guildLevel = guildLevel;
            
            this.nbMembers = nbMembers;
            
            this.enabled = enabled;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 420;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_ui8(this.guildLevel);
            

            

            

            
        
            
                writer.write_ui8(this.nbMembers);
            

            

            

            
        
            
                writer.write_bool(this.enabled);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.guildLevel = reader.read_ui8();
            

            

            

            
        
            
                this.nbMembers = reader.read_ui8();
            

            

            

            
        
            
                this.enabled = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildInAllianceInformations(" +
        
            
            "guildId=" +
            

            
            this.guildId +
            
        
            
            ", guildName=" +
            

            
            this.guildName +
            
        
            
            ", guildEmblem=" +
            

            
            this.guildEmblem +
            
        
            
            ", guildLevel=" +
            

            
            this.guildLevel +
            
        
            
            ", nbMembers=" +
            

            
            this.nbMembers +
            
        
            
            ", enabled=" +
            

            
            this.enabled +
            
        
            ')';
    
    }
}

