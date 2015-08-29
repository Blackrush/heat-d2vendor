
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.atlas.compass;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CompassUpdatePartyMemberMessage extends com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdateMessage {
    public static final int PROTOCOL_ID = 5589;

    
        // vi32
        public int memberId;
    

    public CompassUpdatePartyMemberMessage() { }

    
        public CompassUpdatePartyMemberMessage(byte type, com.ankamagames.dofus.network.types.game.context.MapCoordinates coords, int memberId) {
            
            super(type, coords);
            

            
            this.memberId = memberId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5589;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.memberId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.memberId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CompassUpdatePartyMemberMessage(" +
        
            
            "type=" +
            

            
            this.type +
            
        
            
            ", coords=" +
            

            
            this.coords +
            
        
            
            ", memberId=" +
            

            
            this.memberId +
            
        
            ')';
    
    }
}

