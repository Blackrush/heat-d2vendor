
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockPrivateInformations extends com.ankamagames.dofus.network.types.game.paddock.PaddockAbandonnedInformations {
    public static final int PROTOCOL_ID = 131;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
    

    public PaddockPrivateInformations() { }

    
        public PaddockPrivateInformations(short maxOutdoorMount, short maxItems, int price, boolean locked, int guildId, com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo) {
            
            super(maxOutdoorMount, maxItems, price, locked, guildId);
            

            
            this.guildInfo = guildInfo;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 131;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            

            

            
                
            this.guildInfo.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            
                
                    this.guildInfo = new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
                
                this.guildInfo.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockPrivateInformations(" +
        
            
            "maxOutdoorMount=" +
            

            
            this.maxOutdoorMount +
            
        
            
            ", maxItems=" +
            

            
            this.maxItems +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            
            ", locked=" +
            

            
            this.locked +
            
        
            
            ", guildId=" +
            

            
            this.guildId +
            
        
            
            ", guildInfo=" +
            

            
            this.guildInfo +
            
        
            ')';
    
    }
}

