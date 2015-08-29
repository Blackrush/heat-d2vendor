
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockContentInformations extends com.ankamagames.dofus.network.types.game.paddock.PaddockInformations {
    public static final int PROTOCOL_ID = 183;

    
        // i32
        public int paddockId;
    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int mapId;
    
        // vi16
        public short subAreaId;
    
        // bool
        public boolean abandonned;
    
        // array,com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock
        public com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock[] mountsInformations;
    

    public PaddockContentInformations() { }

    
        public PaddockContentInformations(short maxOutdoorMount, short maxItems, int paddockId, short worldX, short worldY, int mapId, short subAreaId, boolean abandonned, com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock[] mountsInformations) {
            
            super(maxOutdoorMount, maxItems);
            

            
            this.paddockId = paddockId;
            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.mapId = mapId;
            
            this.subAreaId = subAreaId;
            
            this.abandonned = abandonned;
            
            this.mountsInformations = mountsInformations;
            
        }

        
        public PaddockContentInformations(short maxOutdoorMount, short maxItems, int paddockId, short worldX, short worldY, int mapId, short subAreaId, boolean abandonned, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock> mountsInformations) {
            
            super(maxOutdoorMount, maxItems);
            

            
                
                this.paddockId = paddockId;
                
            
                
                this.worldX = worldX;
                
            
                
                this.worldY = worldY;
                
            
                
                this.mapId = mapId;
                
            
                
                this.subAreaId = subAreaId;
                
            
                
                this.abandonned = abandonned;
                
            
                
                this.mountsInformations = mountsInformations.toArray(com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 183;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.paddockId);
            

            

            

            
        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi16(this.subAreaId);
            

            

            

            
        
            
                writer.write_bool(this.abandonned);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(mountsInformations.length);
                    
                    for (int i = 0; i < mountsInformations.length; i++) {
                        
                        mountsInformations[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.paddockId = reader.read_i32();
            

            

            

            
        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.subAreaId = reader.read_vi16();
            

            

            

            
        
            
                this.abandonned = reader.read_bool();
            

            

            

            
        
            

            

            

            
                
                int mountsInformations_length = reader.read_ui16();
                

                
                    this.mountsInformations = new com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock[mountsInformations_length];

                    for (int i = 0; i < mountsInformations_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock mountsInformations_it =
                                    new com.ankamagames.dofus.network.types.game.paddock.MountInformationsForPaddock();
                        

                        mountsInformations_it.deserialize(reader);
                        this.mountsInformations[i] = mountsInformations_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "PaddockContentInformations(" +
        
            
            "maxOutdoorMount=" +
            

            
            this.maxOutdoorMount +
            
        
            
            ", maxItems=" +
            

            
            this.maxItems +
            
        
            
            ", paddockId=" +
            

            
            this.paddockId +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            
            ", abandonned=" +
            

            
            this.abandonned +
            
        
            
            ", mountsInformations=" +
            

            
            
            java.util.Arrays.toString(this.mountsInformations) +
            
            
        
            ')';
    
    }
}

