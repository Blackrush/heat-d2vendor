
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorStateUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6455;

    
        // i32
        public int uniqueId;
    
        // i8
        public byte state;
    

    public TaxCollectorStateUpdateMessage() { }

    
        public TaxCollectorStateUpdateMessage(int uniqueId, byte state) {
            

            
            this.uniqueId = uniqueId;
            
            this.state = state;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6455;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.uniqueId);
            

            

            

            
        
            
                writer.write_i8(this.state);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.uniqueId = reader.read_i32();
            

            

            

            
        
            
                this.state = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "TaxCollectorStateUpdateMessage(" +
        
            
            "uniqueId=" +
            

            
            this.uniqueId +
            
        
            
            ", state=" +
            

            
            this.state +
            
        
            ')';
    
    }
}

