
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeFightJoinRefusedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5908;

    
        // vi32
        public int playerId;
    
        // i8
        public byte reason;
    

    public ChallengeFightJoinRefusedMessage() { }

    
        public ChallengeFightJoinRefusedMessage(int playerId, byte reason) {
            

            
            this.playerId = playerId;
            
            this.reason = reason;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5908;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            
                writer.write_i8(this.reason);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            
                this.reason = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ChallengeFightJoinRefusedMessage(" +
        
            
            "playerId=" +
            

            
            this.playerId +
            
        
            
            ", reason=" +
            

            
            this.reason +
            
        
            ')';
    
    }
}

