
// Created by Heat the 2015-03-01 20:21:55+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyUpdateLightMessage extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyEventMessage {
    public static final int PROTOCOL_ID = 6054;

    
        // vi32
        public int id;
    
        // vi32
        public int lifePoints;
    
        // vi32
        public int maxLifePoints;
    
        // vi16
        public short prospecting;
    
        // ui8
        public short regenRate;
    

    public PartyUpdateLightMessage() { }

    
        public PartyUpdateLightMessage(int partyId, int id, int lifePoints, int maxLifePoints, short prospecting, short regenRate) {
            
            super(partyId);
            

            
            this.id = id;
            
            this.lifePoints = lifePoints;
            
            this.maxLifePoints = maxLifePoints;
            
            this.prospecting = prospecting;
            
            this.regenRate = regenRate;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6054;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.id);
            

            

            

            
        
            
                writer.write_vi32(this.lifePoints);
            

            

            

            
        
            
                writer.write_vi32(this.maxLifePoints);
            

            

            

            
        
            
                writer.write_vi16(this.prospecting);
            

            

            

            
        
            
                writer.write_ui8(this.regenRate);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.id = reader.read_vi32();
            

            

            

            
        
            
                this.lifePoints = reader.read_vi32();
            

            

            

            
        
            
                this.maxLifePoints = reader.read_vi32();
            

            

            

            
        
            
                this.prospecting = reader.read_vi16();
            

            

            

            
        
            
                this.regenRate = reader.read_ui8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyUpdateLightMessage(" +
        
            
            "partyId=" +
            

            
            this.partyId +
            
        
            
            ", id=" +
            

            
            this.id +
            
        
            
            ", lifePoints=" +
            

            
            this.lifePoints +
            
        
            
            ", maxLifePoints=" +
            

            
            this.maxLifePoints +
            
        
            
            ", prospecting=" +
            

            
            this.prospecting +
            
        
            
            ", regenRate=" +
            

            
            this.regenRate +
            
        
            ')';
    
    }
}

