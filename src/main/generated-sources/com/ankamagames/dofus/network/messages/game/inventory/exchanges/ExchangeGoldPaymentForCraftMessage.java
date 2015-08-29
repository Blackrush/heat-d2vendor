
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeGoldPaymentForCraftMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5833;

    
        // bool
        public boolean onlySuccess;
    
        // vi32
        public int goldSum;
    

    public ExchangeGoldPaymentForCraftMessage() { }

    
        public ExchangeGoldPaymentForCraftMessage(boolean onlySuccess, int goldSum) {
            

            
            this.onlySuccess = onlySuccess;
            
            this.goldSum = goldSum;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5833;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.onlySuccess);
            

            

            

            
        
            
                writer.write_vi32(this.goldSum);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.onlySuccess = reader.read_bool();
            

            

            

            
        
            
                this.goldSum = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeGoldPaymentForCraftMessage(" +
        
            
            "onlySuccess=" +
            

            
            this.onlySuccess +
            
        
            
            ", goldSum=" +
            

            
            this.goldSum +
            
        
            ')';
    
    }
}

