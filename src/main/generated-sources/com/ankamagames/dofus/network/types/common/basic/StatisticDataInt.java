
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticDataInt extends com.ankamagames.dofus.network.types.common.basic.StatisticData {
    public static final int PROTOCOL_ID = 485;

    
        // i32
        public int value;
    

    public StatisticDataInt() { }

    
        public StatisticDataInt(short actionId, int value) {
            
            super(actionId);
            

            
            this.value = value;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 485;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.value);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.value = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StatisticDataInt(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", value=" +
            

            
            this.value +
            
        
            ')';
    
    }
}

