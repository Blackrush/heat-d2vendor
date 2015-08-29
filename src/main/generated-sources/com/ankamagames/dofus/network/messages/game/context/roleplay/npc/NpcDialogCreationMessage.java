
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcDialogCreationMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5618;

    
        // i32
        public int mapId;
    
        // i32
        public int npcId;
    

    public NpcDialogCreationMessage() { }

    
        public NpcDialogCreationMessage(int mapId, int npcId) {
            

            
            this.mapId = mapId;
            
            this.npcId = npcId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5618;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_i32(this.npcId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.npcId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "NpcDialogCreationMessage(" +
        
            
            "mapId=" +
            

            
            this.mapId +
            
        
            
            ", npcId=" +
            

            
            this.npcId +
            
        
            ')';
    
    }
}

