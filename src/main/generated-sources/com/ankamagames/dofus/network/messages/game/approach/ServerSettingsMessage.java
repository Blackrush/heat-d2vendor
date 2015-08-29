
// Created by Heat the 2015-03-01 20:21:59+01:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSettingsMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6340;

    
        // str
        public java.lang.String lang;
    
        // i8
        public byte community;
    
        // i8
        public byte gameType;
    

    public ServerSettingsMessage() { }

    
        public ServerSettingsMessage(java.lang.String lang, byte community, byte gameType) {
            

            
            this.lang = lang;
            
            this.community = community;
            
            this.gameType = gameType;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6340;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_str(this.lang);
            

            

            

            
        
            
                writer.write_i8(this.community);
            

            

            

            
        
            
                writer.write_i8(this.gameType);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.lang = reader.read_str();
            

            

            

            
        
            
                this.community = reader.read_i8();
            

            

            

            
        
            
                this.gameType = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ServerSettingsMessage(" +
        
            
            "lang=" +
            

            
            this.lang +
            
        
            
            ", community=" +
            

            
            this.community +
            
        
            
            ", gameType=" +
            

            
            this.gameType +
            
        
            ')';
    
    }
}

