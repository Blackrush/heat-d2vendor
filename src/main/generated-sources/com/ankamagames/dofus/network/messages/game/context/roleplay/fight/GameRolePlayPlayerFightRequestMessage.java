
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerFightRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5731;

    
        // vi32
        public int targetId;
    
        // i16
        public short targetCellId;
    
        // bool
        public boolean friendly;
    

    public GameRolePlayPlayerFightRequestMessage() { }

    
        public GameRolePlayPlayerFightRequestMessage(int targetId, short targetCellId, boolean friendly) {
            

            
            this.targetId = targetId;
            
            this.targetCellId = targetCellId;
            
            this.friendly = friendly;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5731;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.targetId);
            

            

            

            
        
            
                writer.write_i16(this.targetCellId);
            

            

            

            
        
            
                writer.write_bool(this.friendly);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.targetId = reader.read_vi32();
            

            

            

            
        
            
                this.targetCellId = reader.read_i16();
            

            

            

            
        
            
                this.friendly = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayPlayerFightRequestMessage(" +
        
            
            "targetId=" +
            

            
            this.targetId +
            
        
            
            ", targetCellId=" +
            

            
            this.targetCellId +
            
        
            
            ", friendly=" +
            

            
            this.friendly +
            
        
            ')';
    
    }
}

