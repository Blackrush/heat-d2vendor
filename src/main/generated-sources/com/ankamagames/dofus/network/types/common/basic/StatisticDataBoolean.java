
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticDataBoolean extends com.ankamagames.dofus.network.types.common.basic.StatisticData {
    public static final int PROTOCOL_ID = 482;

    
        // bool
        public boolean value;
    

    public StatisticDataBoolean() { }

    
        public StatisticDataBoolean(short actionId, boolean value) {
            
            super(actionId);
            

            
            this.value = value;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 482;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_bool(this.value);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.value = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StatisticDataBoolean(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", value=" +
            

            
            this.value +
            
        
            ')';
    
    }
}

