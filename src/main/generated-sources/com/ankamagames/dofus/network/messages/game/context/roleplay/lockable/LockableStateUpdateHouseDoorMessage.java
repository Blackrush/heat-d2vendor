
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableStateUpdateHouseDoorMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.lockable.LockableStateUpdateAbstractMessage {
    public static final int PROTOCOL_ID = 5668;

    
        // vi32
        public int houseId;
    

    public LockableStateUpdateHouseDoorMessage() { }

    
        public LockableStateUpdateHouseDoorMessage(boolean locked, int houseId) {
            
            super(locked);
            

            
            this.houseId = houseId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5668;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.houseId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.houseId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "LockableStateUpdateHouseDoorMessage(" +
        
            
            "locked=" +
            

            
            this.locked +
            
        
            
            ", houseId=" +
            

            
            this.houseId +
            
        
            ')';
    
    }
}

