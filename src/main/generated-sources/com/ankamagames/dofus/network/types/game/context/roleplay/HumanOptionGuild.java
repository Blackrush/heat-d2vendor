
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionGuild extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
    public static final int PROTOCOL_ID = 409;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInformations;
    

    public HumanOptionGuild() { }

    
        public HumanOptionGuild(com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInformations) {
            
            super();
            

            
            this.guildInformations = guildInformations;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 409;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            

            

            
                
            this.guildInformations.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            
                
                    this.guildInformations = new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
                
                this.guildInformations.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "HumanOptionGuild(" +
        
            
            "guildInformations=" +
            

            
            this.guildInformations +
            
        
            ')';
    
    }
}

