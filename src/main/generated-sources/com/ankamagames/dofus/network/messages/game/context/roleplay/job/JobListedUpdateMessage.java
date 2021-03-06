
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobListedUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6016;

    
        // bool
        public boolean addedOrDeleted;
    
        // i8
        public byte jobId;
    

    public JobListedUpdateMessage() { }

    
        public JobListedUpdateMessage(boolean addedOrDeleted, byte jobId) {
            

            
            this.addedOrDeleted = addedOrDeleted;
            
            this.jobId = jobId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6016;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.addedOrDeleted);
            

            

            

            
        
            
                writer.write_i8(this.jobId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.addedOrDeleted = reader.read_bool();
            

            

            

            
        
            
                this.jobId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "JobListedUpdateMessage(" +
        
            
            "addedOrDeleted=" +
            

            
            this.addedOrDeleted +
            
        
            
            ", jobId=" +
            

            
            this.jobId +
            
        
            ')';
    
    }
}

