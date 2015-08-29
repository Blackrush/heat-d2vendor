
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapCoordinatesAndId extends com.ankamagames.dofus.network.types.game.context.MapCoordinates {
    public static final int PROTOCOL_ID = 392;

    
        // i32
        public int mapId;
    

    public MapCoordinatesAndId() { }

    
        public MapCoordinatesAndId(short worldX, short worldY, int mapId) {
            
            super(worldX, worldY);
            

            
            this.mapId = mapId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 392;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "MapCoordinatesAndId(" +
        
            
            "worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            ')';
    
    }
}

