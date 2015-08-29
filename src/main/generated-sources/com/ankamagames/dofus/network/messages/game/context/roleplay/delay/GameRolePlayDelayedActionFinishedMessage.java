
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.delay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayDelayedActionFinishedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6150;

    
        // i32
        public int delayedCharacterId;
    
        // i8
        public byte delayTypeId;
    

    public GameRolePlayDelayedActionFinishedMessage() { }

    
        public GameRolePlayDelayedActionFinishedMessage(int delayedCharacterId, byte delayTypeId) {
            

            
            this.delayedCharacterId = delayedCharacterId;
            
            this.delayTypeId = delayTypeId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6150;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.delayedCharacterId);
            

            

            

            
        
            
                writer.write_i8(this.delayTypeId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.delayedCharacterId = reader.read_i32();
            

            

            

            
        
            
                this.delayTypeId = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayDelayedActionFinishedMessage(" +
        
            
            "delayedCharacterId=" +
            

            
            this.delayedCharacterId +
            
        
            
            ", delayTypeId=" +
            

            
            this.delayTypeId +
            
        
            ')';
    
    }
}

