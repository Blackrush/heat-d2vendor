
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntFlag extends NetworkType {
    public static final int PROTOCOL_ID = 473;

    
        // i32
        public int mapId;
    
        // i8
        public byte state;
    

    public TreasureHuntFlag() { }

    
        public TreasureHuntFlag(int mapId, byte state) {
            

            
            this.mapId = mapId;
            
            this.state = state;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 473;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_i8(this.state);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.state = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "TreasureHuntFlag(" +
        
            
            "mapId=" +
            

            
            this.mapId +
            
        
            
            ", state=" +
            

            
            this.state +
            
        
            ')';
    
    }
}

