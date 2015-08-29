
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.pvp;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateMapPlayersAgressableStatusMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6454;

    
        // array,vi32
        public int[] playerIds;
    
        // array,i8
        public byte[] enable;
    

    public UpdateMapPlayersAgressableStatusMessage() { }

    
        public UpdateMapPlayersAgressableStatusMessage(int[] playerIds, byte[] enable) {
            

            
            this.playerIds = playerIds;
            
            this.enable = enable;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6454;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(playerIds.length);
                    
                    writer.write_array_vi32(this.playerIds);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(enable.length);
                    
                    writer.write_array_i8(this.enable);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int playerIds_length = reader.read_ui16();
                

                
                    this.playerIds = reader.read_array_vi32(playerIds_length);
                
            
        
            

            

            

            
                
                int enable_length = reader.read_ui16();
                

                
                    this.enable = reader.read_array_i8(enable_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "UpdateMapPlayersAgressableStatusMessage(" +
        
            
            "playerIds=" +
            

            
            
            java.util.Arrays.toString(this.playerIds) +
            
            
        
            
            ", enable=" +
            

            
            
            + this.enable.length + "b" +
            
            
        
            ')';
    
    }
}

