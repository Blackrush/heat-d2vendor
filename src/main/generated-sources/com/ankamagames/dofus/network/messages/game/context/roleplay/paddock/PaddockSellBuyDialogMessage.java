
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockSellBuyDialogMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6018;

    
        // bool
        public boolean bsell;
    
        // vi32
        public int ownerId;
    
        // vi32
        public int price;
    

    public PaddockSellBuyDialogMessage() { }

    
        public PaddockSellBuyDialogMessage(boolean bsell, int ownerId, int price) {
            

            
            this.bsell = bsell;
            
            this.ownerId = ownerId;
            
            this.price = price;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6018;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.bsell);
            

            

            

            
        
            
                writer.write_vi32(this.ownerId);
            

            

            

            
        
            
                writer.write_vi32(this.price);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.bsell = reader.read_bool();
            

            

            

            
        
            
                this.ownerId = reader.read_vi32();
            

            

            

            
        
            
                this.price = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PaddockSellBuyDialogMessage(" +
        
            
            "bsell=" +
            

            
            this.bsell +
            
        
            
            ", ownerId=" +
            

            
            this.ownerId +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            ')';
    
    }
}

