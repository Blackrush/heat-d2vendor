
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorMovementMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5633;

    
        // bool
        public boolean hireOrFire;
    
        // com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations
        public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations basicInfos;
    
        // vi32
        public int playerId;
    
        // str
        public java.lang.String playerName;
    

    public TaxCollectorMovementMessage() { }

    
        public TaxCollectorMovementMessage(boolean hireOrFire, com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations basicInfos, int playerId, java.lang.String playerName) {
            

            
            this.hireOrFire = hireOrFire;
            
            this.basicInfos = basicInfos;
            
            this.playerId = playerId;
            
            this.playerName = playerName;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5633;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_bool(this.hireOrFire);
            

            

            

            
        
            

            

            

            
                
            this.basicInfos.serialize(writer);
            
        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            
                writer.write_str(this.playerName);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.hireOrFire = reader.read_bool();
            

            

            

            
        
            

            

            
                
                    this.basicInfos = new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations();
                
                this.basicInfos.deserialize(reader);
            

            
        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            
                this.playerName = reader.read_str();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "TaxCollectorMovementMessage(" +
        
            
            "hireOrFire=" +
            

            
            this.hireOrFire +
            
        
            
            ", basicInfos=" +
            

            
            this.basicInfos +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            
            ", playerName=" +
            

            
            this.playerName +
            
        
            ')';
    
    }
}

