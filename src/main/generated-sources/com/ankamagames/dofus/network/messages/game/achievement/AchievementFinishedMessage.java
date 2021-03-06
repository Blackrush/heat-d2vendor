
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementFinishedMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6208;

    
        // vi16
        public short id;
    
        // ui8
        public short finishedlevel;
    

    public AchievementFinishedMessage() { }

    
        public AchievementFinishedMessage(short id, short finishedlevel) {
            

            
            this.id = id;
            
            this.finishedlevel = finishedlevel;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6208;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.id);
            

            

            

            
        
            
                writer.write_ui8(this.finishedlevel);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.id = reader.read_vi16();
            

            

            

            
        
            
                this.finishedlevel = reader.read_ui8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AchievementFinishedMessage(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", finishedlevel=" +
            

            
            this.finishedlevel +
            
        
            ')';
    
    }
}

