
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobUnlearntMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5657;

    
        // i8
        public byte jobId;
    

    public JobUnlearntMessage() { }

    
        public JobUnlearntMessage(byte jobId) {
            

            
            this.jobId = jobId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5657;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.jobId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.jobId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "JobUnlearntMessage(" +
        
            
            "jobId=" +
            

            
            this.jobId +
            
        
            ')';
    
    }
}

