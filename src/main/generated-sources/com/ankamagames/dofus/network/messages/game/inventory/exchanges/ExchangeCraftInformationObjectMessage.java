
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftInformationObjectMessage extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeCraftResultWithObjectIdMessage {
    public static final int PROTOCOL_ID = 5794;

    
        // vi32
        public int playerId;
    

    public ExchangeCraftInformationObjectMessage() { }

    
        public ExchangeCraftInformationObjectMessage(byte craftResult, short objectGenericId, int playerId) {
            
            super(craftResult, objectGenericId);
            

            
            this.playerId = playerId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5794;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeCraftInformationObjectMessage(" +
        
            
            "craftResult=" +
            

            
            this.craftResult +
            
        
            
            ", objectGenericId=" +
            

            
            this.objectGenericId +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            ')';
    
    }
}

