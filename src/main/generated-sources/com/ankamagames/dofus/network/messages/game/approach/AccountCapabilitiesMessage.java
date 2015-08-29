
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountCapabilitiesMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6216;

    
        // i32
        public int accountId;
    
        // bool
        public boolean tutorialAvailable;
    
        // ui16
        public int breedsVisible;
    
        // ui16
        public int breedsAvailable;
    
        // i8
        public byte status;
    

    public AccountCapabilitiesMessage() { }

    
        public AccountCapabilitiesMessage(int accountId, boolean tutorialAvailable, int breedsVisible, int breedsAvailable, byte status) {
            

            
            this.accountId = accountId;
            
            this.tutorialAvailable = tutorialAvailable;
            
            this.breedsVisible = breedsVisible;
            
            this.breedsAvailable = breedsAvailable;
            
            this.status = status;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6216;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
            
                writer.write_bool(this.tutorialAvailable);
            

            

            

            
        
            
                writer.write_ui16(this.breedsVisible);
            

            

            

            
        
            
                writer.write_ui16(this.breedsAvailable);
            

            

            

            
        
            
                writer.write_i8(this.status);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
            
                this.tutorialAvailable = reader.read_bool();
            

            

            

            
        
            
                this.breedsVisible = reader.read_ui16();
            

            

            

            
        
            
                this.breedsAvailable = reader.read_ui16();
            

            

            

            
        
            
                this.status = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AccountCapabilitiesMessage(" +
        
            
            "accountId=" +
            

            
            this.accountId +
            
        
            
            ", tutorialAvailable=" +
            

            
            this.tutorialAvailable +
            
        
            
            ", breedsVisible=" +
            

            
            this.breedsVisible +
            
        
            
            ", breedsAvailable=" +
            

            
            this.breedsAvailable +
            
        
            
            ", status=" +
            

            
            this.status +
            
        
            ')';
    
    }
}

