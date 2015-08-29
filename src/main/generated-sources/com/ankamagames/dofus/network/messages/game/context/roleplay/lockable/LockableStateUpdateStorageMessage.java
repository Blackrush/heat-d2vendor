
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableStateUpdateStorageMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.lockable.LockableStateUpdateAbstractMessage {
    public static final int PROTOCOL_ID = 5669;

    
        // i32
        public int mapId;
    
        // vi32
        public int elementId;
    

    public LockableStateUpdateStorageMessage() { }

    
        public LockableStateUpdateStorageMessage(boolean locked, int mapId, int elementId) {
            
            super(locked);
            

            
            this.mapId = mapId;
            
            this.elementId = elementId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5669;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi32(this.elementId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.elementId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "LockableStateUpdateStorageMessage(" +
        
            
            "locked=" +
            

            
            this.locked +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", elementId=" +
            

            
            this.elementId +
            
        
            ')';
    
    }
}

