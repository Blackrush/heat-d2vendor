
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseBuyMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5804;

    
        // vi32
        public int uid;
    
        // vi32
        public int qty;
    
        // vi32
        public int price;
    

    public ExchangeBidHouseBuyMessage() { }

    
        public ExchangeBidHouseBuyMessage(int uid, int qty, int price) {
            

            
            this.uid = uid;
            
            this.qty = qty;
            
            this.price = price;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5804;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi32(this.uid);
            

            

            

            
        
            
                writer.write_vi32(this.qty);
            

            

            

            
        
            
                writer.write_vi32(this.price);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.uid = reader.read_vi32();
            

            

            

            
        
            
                this.qty = reader.read_vi32();
            

            

            

            
        
            
                this.price = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeBidHouseBuyMessage(" +
        
            
            "uid=" +
            

            
            this.uid +
            
        
            
            ", qty=" +
            

            
            this.qty +
            
        
            
            ", price=" +
            

            
            this.price +
            
        
            ')';
    
    }
}

