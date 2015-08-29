
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NumericWhoIsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6297;

    
        // vi32
        public int playerId;
    
        // i32
        public int accountId;
    

    public NumericWhoIsMessage() { }

    
        public NumericWhoIsMessage(int playerId, int accountId) {
            

            
            this.playerId = playerId;
            
            this.accountId = accountId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6297;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "NumericWhoIsMessage(" +
        
            
            "playerId=" +
            

            
            this.playerId +
            
        
            
            ", accountId=" +
            

            
            this.accountId +
            
        
            ')';
    
    }
}

