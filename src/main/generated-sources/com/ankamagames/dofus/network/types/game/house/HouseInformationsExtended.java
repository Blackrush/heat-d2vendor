
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformationsExtended extends com.ankamagames.dofus.network.types.game.house.HouseInformations {
    public static final int PROTOCOL_ID = 112;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
    

    public HouseInformationsExtended() { }

    
        public HouseInformationsExtended(boolean isOnSale, boolean isSaleLocked, int houseId, int[] doorsOnMap, java.lang.String ownerName, short modelId, com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo) {
            
            super(isOnSale, isSaleLocked, houseId, doorsOnMap, ownerName, modelId);
            

            
            this.guildInfo = guildInfo;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 112;
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
    
        return "HouseInformationsExtended(" +
        
            
            "isOnSale=" +
            

            
            this.isOnSale +
            
        
            
            ", isSaleLocked=" +
            

            
            this.isSaleLocked +
            
        
            
            ", houseId=" +
            

            
            this.houseId +
            
        
            
            ", doorsOnMap=" +
            

            
            
            java.util.Arrays.toString(this.doorsOnMap) +
            
            
        
            
            ", ownerName=" +
            

            
            this.ownerName +
            
        
            
            ", modelId=" +
            

            
            this.modelId +
            
        
            
            ", guildInfo=" +
            

            
            this.guildInfo +
            
        
            ')';
    
    }
}

