
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeGuildTaxCollectorGetMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5762;

    
        // str
        public java.lang.String collectorName;
    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int mapId;
    
        // vi16
        public short subAreaId;
    
        // str
        public java.lang.String userName;
    
        // f64
        public double experience;
    
        // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
        public com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[] objectsInfos;
    

    public ExchangeGuildTaxCollectorGetMessage() { }

    
        public ExchangeGuildTaxCollectorGetMessage(java.lang.String collectorName, short worldX, short worldY, int mapId, short subAreaId, java.lang.String userName, double experience, com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[] objectsInfos) {
            

            
            this.collectorName = collectorName;
            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.mapId = mapId;
            
            this.subAreaId = subAreaId;
            
            this.userName = userName;
            
            this.experience = experience;
            
            this.objectsInfos = objectsInfos;
            
        }

        
        public ExchangeGuildTaxCollectorGetMessage(java.lang.String collectorName, short worldX, short worldY, int mapId, short subAreaId, java.lang.String userName, double experience, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity> objectsInfos) {
            

            
                
                this.collectorName = collectorName;
                
            
                
                this.worldX = worldX;
                
            
                
                this.worldY = worldY;
                
            
                
                this.mapId = mapId;
                
            
                
                this.subAreaId = subAreaId;
                
            
                
                this.userName = userName;
                
            
                
                this.experience = experience;
                
            
                
                this.objectsInfos = objectsInfos.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 5762;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_str(this.collectorName);
            

            

            

            
        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi16(this.subAreaId);
            

            

            

            
        
            
                writer.write_str(this.userName);
            

            

            

            
        
            
                writer.write_f64(this.experience);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(objectsInfos.length);
                    
                    for (int i = 0; i < objectsInfos.length; i++) {
                        
                        objectsInfos[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.collectorName = reader.read_str();
            

            

            

            
        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.subAreaId = reader.read_vi16();
            

            

            

            
        
            
                this.userName = reader.read_str();
            

            

            

            
        
            
                this.experience = reader.read_f64();
            

            

            

            
        
            

            

            

            
                
                int objectsInfos_length = reader.read_ui16();
                

                
                    this.objectsInfos = new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[objectsInfos_length];

                    for (int i = 0; i < objectsInfos_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity objectsInfos_it =
                                    new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity();
                        

                        objectsInfos_it.deserialize(reader);
                        this.objectsInfos[i] = objectsInfos_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeGuildTaxCollectorGetMessage(" +
        
            
            "collectorName=" +
            

            
            this.collectorName +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            
            ", userName=" +
            

            
            this.userName +
            
        
            
            ", experience=" +
            

            
            this.experience +
            
        
            
            ", objectsInfos=" +
            

            
            
            java.util.Arrays.toString(this.objectsInfos) +
            
            
        
            ')';
    
    }
}

