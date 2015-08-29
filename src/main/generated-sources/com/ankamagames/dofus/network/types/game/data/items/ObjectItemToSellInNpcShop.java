
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemToSellInNpcShop extends com.ankamagames.dofus.network.types.game.data.items.ObjectItemMinimalInformation {
    public static final int PROTOCOL_ID = 352;

    
        // vi32
        public int objectPrice;
    
        // str
        public java.lang.String buyCriterion;
    

    public ObjectItemToSellInNpcShop() { }

    
        public ObjectItemToSellInNpcShop(short objectGID, com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects, int objectPrice, java.lang.String buyCriterion) {
            
            super(objectGID, effects);
            

            
            this.objectPrice = objectPrice;
            
            this.buyCriterion = buyCriterion;
            
        }

        
        public ObjectItemToSellInNpcShop(short objectGID, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect> effects, int objectPrice, java.lang.String buyCriterion) {
            
            super(objectGID, effects);
            

            
                
                this.objectPrice = objectPrice;
                
            
                
                this.buyCriterion = buyCriterion;
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 352;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.objectPrice);
            

            

            

            
        
            
                writer.write_str(this.buyCriterion);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.objectPrice = reader.read_vi32();
            

            

            

            
        
            
                this.buyCriterion = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ObjectItemToSellInNpcShop(" +
        
            
            "objectGID=" +
            

            
            this.objectGID +
            
        
            
            ", effects=" +
            

            
            
            java.util.Arrays.toString(this.effects) +
            
            
        
            
            ", objectPrice=" +
            

            
            this.objectPrice +
            
        
            
            ", buyCriterion=" +
            

            
            this.buyCriterion +
            
        
            ')';
    
    }
}

