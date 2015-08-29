
// Created by Heat the 2015-03-01 20:21:52+01:00
package com.ankamagames.dofus.network.messages.game.character.status;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PlayerStatusUpdateMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6386;

    
        // i32
        public int accountId;
    
        // vi32
        public int playerId;
    
        // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
        public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;
    

    public PlayerStatusUpdateMessage() { }

    
        public PlayerStatusUpdateMessage(int accountId, int playerId, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status) {
            

            
            this.accountId = accountId;
            
            this.playerId = playerId;
            
            this.status = status;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6386;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            

            

            

            
                
                writer.write_ui16(this.status.getProtocolId());
                
            this.status.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            

            

            
                
                    int status_typeId = reader.read_ui16();
                    this.status = (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus) InternalProtocolTypeManager.get(status_typeId);
                
                this.status.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "PlayerStatusUpdateMessage(" +
        
            
            "accountId=" +
            

            
            this.accountId +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            
            ", status=" +
            

            
            this.status +
            
        
            ')';
    
    }
}

