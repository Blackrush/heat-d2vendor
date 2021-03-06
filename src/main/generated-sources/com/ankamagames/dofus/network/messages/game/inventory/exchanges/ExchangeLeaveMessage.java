
// Created by Heat the 2015-03-01 20:21:58+01:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeLeaveMessage extends com.ankamagames.dofus.network.messages.game.dialog.LeaveDialogMessage {
    public static final int PROTOCOL_ID = 5628;

    
        // bool
        public boolean success;
    

    public ExchangeLeaveMessage() { }

    
        public ExchangeLeaveMessage(byte dialogType, boolean success) {
            
            super(dialogType);
            

            
            this.success = success;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5628;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_bool(this.success);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.success = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ExchangeLeaveMessage(" +
        
            
            "dialogType=" +
            

            
            this.dialogType +
            
        
            
            ", success=" +
            

            
            this.success +
            
        
            ')';
    
    }
}

