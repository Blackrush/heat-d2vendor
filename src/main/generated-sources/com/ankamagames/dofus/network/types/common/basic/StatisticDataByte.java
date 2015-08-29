
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticDataByte extends com.ankamagames.dofus.network.types.common.basic.StatisticData {
    public static final int PROTOCOL_ID = 486;

    
        // i8
        public byte value;
    

    public StatisticDataByte() { }

    
        public StatisticDataByte(short actionId, byte value) {
            
            super(actionId);
            

            
            this.value = value;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 486;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i8(this.value);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.value = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StatisticDataByte(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", value=" +
            

            
            this.value +
            
        
            ')';
    
    }
}

