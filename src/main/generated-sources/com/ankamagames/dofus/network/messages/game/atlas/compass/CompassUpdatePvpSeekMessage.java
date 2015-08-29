
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.atlas.compass;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CompassUpdatePvpSeekMessage extends com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdateMessage {
    public static final int PROTOCOL_ID = 6013;

    
        // vi32
        public int memberId;
    
        // str
        public java.lang.String memberName;
    

    public CompassUpdatePvpSeekMessage() { }

    
        public CompassUpdatePvpSeekMessage(byte type, com.ankamagames.dofus.network.types.game.context.MapCoordinates coords, int memberId, java.lang.String memberName) {
            
            super(type, coords);
            

            
            this.memberId = memberId;
            
            this.memberName = memberName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6013;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.memberId);
            

            

            

            
        
            
                writer.write_str(this.memberName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.memberId = reader.read_vi32();
            

            

            

            
        
            
                this.memberName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "CompassUpdatePvpSeekMessage(" +
        
            
            "type=" +
            

            
            this.type +
            
        
            
            ", coords=" +
            

            
            this.coords +
            
        
            
            ", memberId=" +
            

            
            this.memberId +
            
        
            
            ", memberName=" +
            

            
            this.memberName +
            
        
            ')';
    
    }
}

