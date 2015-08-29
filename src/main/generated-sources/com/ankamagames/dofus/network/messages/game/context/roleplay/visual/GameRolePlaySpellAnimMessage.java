
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.visual;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlaySpellAnimMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6114;

    
        // i32
        public int casterId;
    
        // vi16
        public short targetCellId;
    
        // vi16
        public short spellId;
    
        // i8
        public byte spellLevel;
    

    public GameRolePlaySpellAnimMessage() { }

    
        public GameRolePlaySpellAnimMessage(int casterId, short targetCellId, short spellId, byte spellLevel) {
            

            
            this.casterId = casterId;
            
            this.targetCellId = targetCellId;
            
            this.spellId = spellId;
            
            this.spellLevel = spellLevel;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6114;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.casterId);
            

            

            

            
        
            
                writer.write_vi16(this.targetCellId);
            

            

            

            
        
            
                writer.write_vi16(this.spellId);
            

            

            

            
        
            
                writer.write_i8(this.spellLevel);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.casterId = reader.read_i32();
            

            

            

            
        
            
                this.targetCellId = reader.read_vi16();
            

            

            

            
        
            
                this.spellId = reader.read_vi16();
            

            

            

            
        
            
                this.spellLevel = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameRolePlaySpellAnimMessage(" +
        
            
            "casterId=" +
            

            
            this.casterId +
            
        
            
            ", targetCellId=" +
            

            
            this.targetCellId +
            
        
            
            ", spellId=" +
            

            
            this.spellId +
            
        
            
            ", spellLevel=" +
            

            
            this.spellLevel +
            
        
            ')';
    
    }
}

