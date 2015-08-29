
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectFoundWhileRecoltingMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6017;

    
        // vi16
        public short genericId;
    
        // vi32
        public int quantity;
    
        // vi32
        public int resourceGenericId;
    

    public ObjectFoundWhileRecoltingMessage() { }

    
        public ObjectFoundWhileRecoltingMessage(short genericId, int quantity, int resourceGenericId) {
            

            
            this.genericId = genericId;
            
            this.quantity = quantity;
            
            this.resourceGenericId = resourceGenericId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6017;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.genericId);
            

            

            

            
        
            
                writer.write_vi32(this.quantity);
            

            

            

            
        
            
                writer.write_vi32(this.resourceGenericId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.genericId = reader.read_vi16();
            

            

            

            
        
            
                this.quantity = reader.read_vi32();
            

            

            

            
        
            
                this.resourceGenericId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ObjectFoundWhileRecoltingMessage(" +
        
            
            "genericId=" +
            

            
            this.genericId +
            
        
            
            ", quantity=" +
            

            
            this.quantity +
            
        
            
            ", resourceGenericId=" +
            

            
            this.resourceGenericId +
            
        
            ')';
    
    }
}

