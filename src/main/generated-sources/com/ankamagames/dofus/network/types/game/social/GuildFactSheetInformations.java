
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFactSheetInformations extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
    public static final int PROTOCOL_ID = 424;

    
        // vi32
        public int leaderId;
    
        // ui8
        public short guildLevel;
    
        // vi16
        public short nbMembers;
    

    public GuildFactSheetInformations() { }

    
        public GuildFactSheetInformations(int guildId, java.lang.String guildName, com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem, int leaderId, short guildLevel, short nbMembers) {
            
            super(guildId, guildName, guildEmblem);
            

            
            this.leaderId = leaderId;
            
            this.guildLevel = guildLevel;
            
            this.nbMembers = nbMembers;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 424;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.leaderId);
            

            

            

            
        
            
                writer.write_ui8(this.guildLevel);
            

            

            

            
        
            
                writer.write_vi16(this.nbMembers);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.leaderId = reader.read_vi32();
            

            

            

            
        
            
                this.guildLevel = reader.read_ui8();
            

            

            

            
        
            
                this.nbMembers = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildFactSheetInformations(" +
        
            
            "guildId=" +
            

            
            this.guildId +
            
        
            
            ", guildName=" +
            

            
            this.guildName +
            
        
            
            ", guildEmblem=" +
            

            
            this.guildEmblem +
            
        
            
            ", leaderId=" +
            

            
            this.leaderId +
            
        
            
            ", guildLevel=" +
            

            
            this.guildLevel +
            
        
            
            ", nbMembers=" +
            

            
            this.nbMembers +
            
        
            ')';
    
    }
}

