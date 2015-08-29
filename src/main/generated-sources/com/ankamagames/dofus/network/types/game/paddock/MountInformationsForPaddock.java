
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountInformationsForPaddock extends NetworkType {
    public static final int PROTOCOL_ID = 184;

    
        // i8
        public byte modelId;
    
        // str
        public java.lang.String name;
    
        // str
        public java.lang.String ownerName;
    

    public MountInformationsForPaddock() { }

    
        public MountInformationsForPaddock(byte modelId, java.lang.String name, java.lang.String ownerName) {
            

            
            this.modelId = modelId;
            
            this.name = name;
            
            this.ownerName = ownerName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 184;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.modelId);
            

            

            

            
        
            
                writer.write_str(this.name);
            

            

            

            
        
            
                writer.write_str(this.ownerName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.modelId = reader.read_i8();
            

            

            

            
        
            
                this.name = reader.read_str();
            

            

            

            
        
            
                this.ownerName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "MountInformationsForPaddock(" +
        
            
            "modelId=" +
            

            
            this.modelId +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", ownerName=" +
            

            
            this.ownerName +
            
        
            ')';
    
    }
}

