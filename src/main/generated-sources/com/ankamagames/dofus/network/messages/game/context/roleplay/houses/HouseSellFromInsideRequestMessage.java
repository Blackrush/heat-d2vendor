
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSellFromInsideRequestMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseSellRequestMessage {
    public static final int PROTOCOL_ID = 5884;

    

    public HouseSellFromInsideRequestMessage() { }

    
        public HouseSellFromInsideRequestMessage(int amount) {
            
            super(amount);
            

            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5884;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
    }

    @Override
    public String toString() {
    
        return "HouseSellFromInsideRequestMessage(" +
        
            
            "amount=" +
            

            
            this.amount +
            
        
            ')';
    
    }
}

