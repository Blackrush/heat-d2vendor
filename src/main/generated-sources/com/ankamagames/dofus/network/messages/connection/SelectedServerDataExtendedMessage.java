
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SelectedServerDataExtendedMessage extends com.ankamagames.dofus.network.messages.connection.SelectedServerDataMessage {
    public static final int PROTOCOL_ID = 6469;

    
        // array,vi16
        public short[] serverIds;
    

    public SelectedServerDataExtendedMessage() { }

    
        public SelectedServerDataExtendedMessage(boolean ssl, boolean canCreateNewCharacter, short serverId, java.lang.String address, int port, java.lang.String ticket, short[] serverIds) {
            
            super(ssl, canCreateNewCharacter, serverId, address, port, ticket);
            

            
            this.serverIds = serverIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6469;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            
                
                    
                    writer.write_ui16(serverIds.length);
                    
                    writer.write_array_vi16(this.serverIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            

            
                
                int serverIds_length = reader.read_ui16();
                

                
                    this.serverIds = reader.read_array_vi16(serverIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "SelectedServerDataExtendedMessage(" +
        
            
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
            
        
            
            ", serverIds=" +
            

            
            
            java.util.Arrays.toString(this.serverIds) +
            
            
        
            ')';
    
    }
}

