
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockBuyableInformations extends com.ankamagames.dofus.network.types.game.paddock.PaddockInformations {
    public static final int PROTOCOL_ID = 130;

    
        // vi32
        public int price;
    
        // bool
        public boolean locked;
    

    public PaddockBuyableInformations() { }

    
        public PaddockBuyableInformations(short maxOutdoorMount, short maxItems, int price, boolean locked) {
            
            super(maxOutdoorMount, maxItems);
            

            
            this.price = price;
            
            this.locked = locked;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 130;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.price);
            

            

            

            
        
            
                writer.write_bool(this.locked);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.price = reader.read_vi32();
            

            

            

            
        
            
                this.locked = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockBuyableInformations(" +
        
            
            "maxOutdoorMount=" +
            

            
            this.maxOutdoorMount +
            
        
            
            ", maxItems=" +
            

            
            this.maxItems +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            
            ", locked=" +
            

            
            this.locked +
            
        
            ')';
    
    }
}

