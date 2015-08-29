
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GoldItem extends com.ankamagames.dofus.network.types.game.data.items.Item {
    public static final int PROTOCOL_ID = 123;

    
        // vi32
        public int sum;
    

    public GoldItem() { }

    
        public GoldItem(int sum) {
            
            super();
            

            
            this.sum = sum;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 123;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.sum);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.sum = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GoldItem(" +
        
            
            "sum=" +
            

            
            this.sum +
            
        
            ')';
    
    }
}

