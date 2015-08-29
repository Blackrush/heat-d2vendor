
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SelectedServerDataMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 42;

    
        // flag,_loc2_,0
        public boolean ssl;
    
        // flag,_loc2_,1
        public boolean canCreateNewCharacter;
    
        // vi16
        public short serverId;
    
        // str
        public java.lang.String address;
    
        // ui16
        public int port;
    
        // str
        public java.lang.String ticket;
    

    public SelectedServerDataMessage() { }

    
        public SelectedServerDataMessage(boolean ssl, boolean canCreateNewCharacter, short serverId, java.lang.String address, int port, java.lang.String ticket) {
            

            
            this.ssl = ssl;
            
            this.canCreateNewCharacter = canCreateNewCharacter;
            
            this.serverId = serverId;
            
            this.address = address;
            
            this.port = port;
            
            this.ticket = ticket;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 42;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.ssl, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canCreateNewCharacter, 1);
                
                writer.write_i8(_loc2_);
                
            

            
        
            
                writer.write_vi16(this.serverId);
            

            

            

            
        
            
                writer.write_str(this.address);
            

            

            

            
        
            
                writer.write_ui16(this.port);
            

            

            

            
        
            
                writer.write_str(this.ticket);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.ssl = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.canCreateNewCharacter = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            
                this.serverId = reader.read_vi16();
            

            

            

            
        
            
                this.address = reader.read_str();
            

            

            

            
        
            
                this.port = reader.read_ui16();
            

            

            

            
        
            
                this.ticket = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "SelectedServerDataMessage(" +
        
            
            "ssl=" +
            

            
            this.ssl +
            
        
            
            ", canCreateNewCharacter=" +
            

            
            this.canCreateNewCharacter +
            
        
            
            ", serverId=" +
            

            
            this.serverId +
            
        
            
            ", address=" +
            

            
            this.address +
            
        
            
            ", port=" +
            

            
            this.port +
            
        
            
            ", ticket=" +
            

            
            this.ticket +
            
        
            ')';
    
    }
}

