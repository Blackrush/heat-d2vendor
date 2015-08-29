
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkNpcShopMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5761;

    
        // i32
        public int npcSellerId;
    
        // vi16
        public short tokenId;
    
        // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop
        public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop[] objectsInfos;
    

    public ExchangeStartOkNpcShopMessage() { }

    
        public ExchangeStartOkNpcShopMessage(int npcSellerId, short tokenId, com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop[] objectsInfos) {
            

            
            this.npcSellerId = npcSellerId;
            
            this.tokenId = tokenId;
            
            this.objectsInfos = objectsInfos;
            
        }

        
        public ExchangeStartOkNpcShopMessage(int npcSellerId, short tokenId, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop> objectsInfos) {
            

            
                
                this.npcSellerId = npcSellerId;
                
            
                
                this.tokenId = tokenId;
                
            
                
                this.objectsInfos = objectsInfos.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 5761;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.npcSellerId);
            

            

            

            
        
            
                writer.write_vi16(this.tokenId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(objectsInfos.length);
                    
                    for (int i = 0; i < objectsInfos.length; i++) {
                        
                        objectsInfos[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.npcSellerId = reader.read_i32();
            

            

            

            
        
            
                this.tokenId = reader.read_vi16();
            

            

            

            
        
            

            

            

            
                
                int objectsInfos_length = reader.read_ui16();
                

                
                    this.objectsInfos = new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop[objectsInfos_length];

                    for (int i = 0; i < objectsInfos_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop objectsInfos_it =
                                    new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInNpcShop();
                        

                        objectsInfos_it.deserialize(reader);
                        this.objectsInfos[i] = objectsInfos_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeStartOkNpcShopMessage(" +
        
            
            "npcSellerId=" +
            

            
            this.npcSellerId +
            
        
            
            ", tokenId=" +
            

            
            this.tokenId +
            
        
            
            ", objectsInfos=" +
            

            
            
            java.util.Arrays.toString(this.objectsInfos) +
            
            
        
            ')';
    
    }
}

