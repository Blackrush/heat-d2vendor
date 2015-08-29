
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryEntryJobInfo extends NetworkType {
    public static final int PROTOCOL_ID = 195;

    
        // i8
        public byte jobId;
    
        // i8
        public byte jobLevel;
    
        // i8
        public byte userDefinedParams;
    
        // i8
        public byte minSlots;
    

    public JobCrafterDirectoryEntryJobInfo() { }

    
        public JobCrafterDirectoryEntryJobInfo(byte jobId, byte jobLevel, byte userDefinedParams, byte minSlots) {
            

            
            this.jobId = jobId;
            
            this.jobLevel = jobLevel;
            
            this.userDefinedParams = userDefinedParams;
            
            this.minSlots = minSlots;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 195;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.jobId);
            

            

            

            
        
            
                writer.write_i8(this.jobLevel);
            

            

            

            
        
            
                writer.write_i8(this.userDefinedParams);
            

            

            

            
        
            
                writer.write_i8(this.minSlots);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.jobId = reader.read_i8();
            

            

            

            
        
            
                this.jobLevel = reader.read_i8();
            

            

            

            
        
            
                this.userDefinedParams = reader.read_i8();
            

            

            

            
        
            
                this.minSlots = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "JobCrafterDirectoryEntryJobInfo(" +
        
            
            "jobId=" +
            

            
            this.jobId +
            
        
            
            ", jobLevel=" +
            

            
            this.jobLevel +
            
        
            
            ", userDefinedParams=" +
            

            
            this.userDefinedParams +
            
        
            
            ", minSlots=" +
            

            
            this.minSlots +
            
        
            ')';
    
    }
}

