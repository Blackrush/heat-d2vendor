
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockAbandonnedInformations extends com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations {
    public static final int PROTOCOL_ID = 133;

    
        // i32
        public int guildId;
    

    public PaddockAbandonnedInformations() { }

    
        public PaddockAbandonnedInformations(short maxOutdoorMount, short maxItems, int price, boolean locked, int guildId) {
            
            super(maxOutdoorMount, maxItems, price, locked);
            

            
            this.guildId = guildId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 133;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.guildId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.guildId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockAbandonnedInformations(" +
        
            
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
            
        
            ')';
    
    }
}

