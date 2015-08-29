
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectorySettings extends NetworkType {
    public static final int PROTOCOL_ID = 97;

    
        // i8
        public byte jobId;
    
        // i8
        public byte minSlot;
    
        // i8
        public byte userDefinedParams;
    

    public JobCrafterDirectorySettings() { }

    
        public JobCrafterDirectorySettings(byte jobId, byte minSlot, byte userDefinedParams) {
            

            
            this.jobId = jobId;
            
            this.minSlot = minSlot;
            
            this.userDefinedParams = userDefinedParams;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 97;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.jobId);
            

            

            

            
        
            
                writer.write_i8(this.minSlot);
            

            

            

            
        
            
                writer.write_i8(this.userDefinedParams);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.jobId = reader.read_i8();
            

            

            

            
        
            
                this.minSlot = reader.read_i8();
            

            

            

            
        
            
                this.userDefinedParams = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "JobCrafterDirectorySettings(" +
        
            
            "jobId=" +
            

            
            this.jobId +
            
        
            
            ", minSlot=" +
            

            
            this.minSlot +
            
        
            
            ", userDefinedParams=" +
            

            
            this.userDefinedParams +
            
        
            ')';
    
    }
}

