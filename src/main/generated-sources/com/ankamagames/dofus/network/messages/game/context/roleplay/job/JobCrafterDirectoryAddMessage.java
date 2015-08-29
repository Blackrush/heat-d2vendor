
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryAddMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5651;

    
        // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry
        public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry listEntry;
    

    public JobCrafterDirectoryAddMessage() { }

    
        public JobCrafterDirectoryAddMessage(com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry listEntry) {
            

            
            this.listEntry = listEntry;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5651;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            

            
                
            this.listEntry.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            
                
                    this.listEntry = new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry();
                
                this.listEntry.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "JobCrafterDirectoryAddMessage(" +
        
            
            "listEntry=" +
            

            
            this.listEntry +
            
        
            ')';
    
    }
}

