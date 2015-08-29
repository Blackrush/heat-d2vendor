
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicGuildInformations extends com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos {
    public static final int PROTOCOL_ID = 365;

    
        // vi32
        public int guildId;
    
        // str
        public java.lang.String guildName;
    

    public BasicGuildInformations() { }

    
        public BasicGuildInformations(int guildId, java.lang.String guildName) {
            
            super();
            

            
            this.guildId = guildId;
            
            this.guildName = guildName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 365;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.guildId);
            

            

            

            
        
            
                writer.write_str(this.guildName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.guildId = reader.read_vi32();
            

            

            

            
        
            
                this.guildName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "BasicGuildInformations(" +
        
            
            "guildId=" +
            

            
            this.guildId +
            
        
            
            ", guildName=" +
            

            
            this.guildName +
            
        
            ')';
    
    }
}

