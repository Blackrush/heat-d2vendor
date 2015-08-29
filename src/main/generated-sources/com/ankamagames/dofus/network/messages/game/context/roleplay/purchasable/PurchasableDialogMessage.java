
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.purchasable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PurchasableDialogMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5739;

    
        // bool
        public boolean buyOrSell;
    
        // vi32
        public int purchasableId;
    
        // vi32
        public int price;
    

    public PurchasableDialogMessage() { }

    
        public PurchasableDialogMessage(boolean buyOrSell, int purchasableId, int price) {
            

            
            this.buyOrSell = buyOrSell;
            
            this.purchasableId = purchasableId;
            
            this.price = price;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5739;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.buyOrSell);
            

            

            

            
        
            
                writer.write_vi32(this.purchasableId);
            

            

            

            
        
            
                writer.write_vi32(this.price);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.buyOrSell = reader.read_bool();
            

            

            

            
        
            
                this.purchasableId = reader.read_vi32();
            

            

            

            
        
            
                this.price = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PurchasableDialogMessage(" +
        
            
            "buyOrSell=" +
            

            
            this.buyOrSell +
            
        
            
            ", purchasableId=" +
            

            
            this.purchasableId +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            ')';
    
    }
}

