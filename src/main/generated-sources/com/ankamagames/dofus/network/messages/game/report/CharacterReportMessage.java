
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.report;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterReportMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6079;

    
        // vi32
        public int reportedId;
    
        // i8
        public byte reason;
    

    public CharacterReportMessage() { }

    
        public CharacterReportMessage(int reportedId, byte reason) {
            

            
            this.reportedId = reportedId;
            
            this.reason = reason;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6079;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.reportedId);
            

            

            

            
        
            
                writer.write_i8(this.reason);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.reportedId = reader.read_vi32();
            

            

            

            
        
            
                this.reason = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CharacterReportMessage(" +
        
            
            "reportedId=" +
            

            
            this.reportedId +
            
        
            
            ", reason=" +
            

            
            this.reason +
            
        
            ')';
    
    }
}

