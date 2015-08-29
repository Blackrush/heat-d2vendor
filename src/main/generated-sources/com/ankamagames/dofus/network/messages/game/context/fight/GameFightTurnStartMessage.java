
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnStartMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 714;

    
        // i32
        public int id;
    
        // vi32
        public int waitTime;
    

    public GameFightTurnStartMessage() { }

    
        public GameFightTurnStartMessage(int id, int waitTime) {
            

            
            this.id = id;
            
            this.waitTime = waitTime;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 714;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.id);
            

            

            

            
        
            
                writer.write_vi32(this.waitTime);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_i32();
            

            

            

            
        
            
                this.waitTime = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightTurnStartMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", waitTime=" +
            

            
            this.waitTime +
            
        
            ')';
    
    }
}

