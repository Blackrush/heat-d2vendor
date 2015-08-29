
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServersListMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 30;

    
        // array,com.ankamagames.dofus.network.types.connection.GameServerInformations
        public com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers;
    

    public ServersListMessage() { }

    
        public ServersListMessage(com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers) {
            

            
            this.servers = servers;
            
        }

        
        public ServersListMessage(java.util.stream.Stream<com.ankamagames.dofus.network.types.connection.GameServerInformations> servers) {
            

            
                
                this.servers = servers.toArray(com.ankamagames.dofus.network.types.connection.GameServerInformations[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 30;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(servers.length);
                    
                    for (int i = 0; i < servers.length; i++) {
                        
                        servers[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int servers_length = reader.read_ui16();
                

                
                    this.servers = new com.ankamagames.dofus.network.types.connection.GameServerInformations[servers_length];

                    for (int i = 0; i < servers_length; i++) {
                        
                            com.ankamagames.dofus.network.types.connection.GameServerInformations servers_it =
                                    new com.ankamagames.dofus.network.types.connection.GameServerInformations();
                        

                        servers_it.deserialize(reader);
                        this.servers[i] = servers_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "ServersListMessage(" +
        
            
            "servers=" +
            

            
            
            java.util.Arrays.toString(this.servers) +
            
            
        
            ')';
    
    }
}

