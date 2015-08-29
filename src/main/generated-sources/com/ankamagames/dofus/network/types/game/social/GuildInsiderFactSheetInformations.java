
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInsiderFactSheetInformations extends com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations {
    public static final int PROTOCOL_ID = 423;

    
        // str
        public java.lang.String leaderName;
    
        // vi16
        public short nbConnectedMembers;
    
        // i8
        public byte nbTaxCollectors;
    
        // i32
        public int lastActivity;
    
        // bool
        public boolean enabled;
    

    public GuildInsiderFactSheetInformations() { }

    
        public GuildInsiderFactSheetInformations(int guildId, java.lang.String guildName, com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem, int leaderId, short guildLevel, short nbMembers, java.lang.String leaderName, short nbConnectedMembers, byte nbTaxCollectors, int lastActivity, boolean enabled) {
            
            super(guildId, guildName, guildEmblem, leaderId, guildLevel, nbMembers);
            

            
            this.leaderName = leaderName;
            
            this.nbConnectedMembers = nbConnectedMembers;
            
            this.nbTaxCollectors = nbTaxCollectors;
            
            this.lastActivity = lastActivity;
            
            this.enabled = enabled;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 423;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_str(this.leaderName);
            

            

            

            
        
            
                writer.write_vi16(this.nbConnectedMembers);
            

            

            

            
        
            
                writer.write_i8(this.nbTaxCollectors);
            

            

            

            
        
            
                writer.write_i32(this.lastActivity);
            

            

            

            
        
            
                writer.write_bool(this.enabled);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.leaderName = reader.read_str();
            

            

            

            
        
            
                this.nbConnectedMembers = reader.read_vi16();
            

            

            

            
        
            
                this.nbTaxCollectors = reader.read_i8();
            

            

            

            
        
            
                this.lastActivity = reader.read_i32();
            

            

            

            
        
            
                this.enabled = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildInsiderFactSheetInformations(" +
        
            
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
            
        
            
            ", leaderName=" +
            

            
            this.leaderName +
            
        
            
            ", nbConnectedMembers=" +
            

            
            this.nbConnectedMembers +
            
        
            
            ", nbTaxCollectors=" +
            

            
            this.nbTaxCollectors +
            
        
            
            ", lastActivity=" +
            

            
            this.lastActivity +
            
        
            
            ", enabled=" +
            

            
            this.enabled +
            
        
            ')';
    
    }
}

