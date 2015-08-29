
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticData extends NetworkType {
    public static final int PROTOCOL_ID = 484;

    
        // vi16
        public short actionId;
    

    public StatisticData() { }

    
        public StatisticData(short actionId) {
            

            
            this.actionId = actionId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 484;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.actionId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.actionId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "StatisticData(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            ')';
    
    }
}

