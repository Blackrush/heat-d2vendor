
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractFightTeamInformations extends NetworkType {
    public static final int PROTOCOL_ID = 116;

    
        // i8
        public byte teamId;
    
        // i32
        public int leaderId;
    
        // i8
        public byte teamSide;
    
        // i8
        public byte teamTypeId;
    
        // i8
        public byte nbWaves;
    

    public AbstractFightTeamInformations() { }

    
        public AbstractFightTeamInformations(byte teamId, int leaderId, byte teamSide, byte teamTypeId, byte nbWaves) {
            

            
            this.teamId = teamId;
            
            this.leaderId = leaderId;
            
            this.teamSide = teamSide;
            
            this.teamTypeId = teamTypeId;
            
            this.nbWaves = nbWaves;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 116;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.teamId);
            

            

            

            
        
            
                writer.write_i32(this.leaderId);
            

            

            

            
        
            
                writer.write_i8(this.teamSide);
            

            

            

            
        
            
                writer.write_i8(this.teamTypeId);
            

            

            

            
        
            
                writer.write_i8(this.nbWaves);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.teamId = reader.read_i8();
            

            

            

            
        
            
                this.leaderId = reader.read_i32();
            

            

            

            
        
            
                this.teamSide = reader.read_i8();
            

            

            

            
        
            
                this.teamTypeId = reader.read_i8();
            

            

            

            
        
            
                this.nbWaves = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "AbstractFightTeamInformations(" +
        
            
            "teamId=" +
            

            
            this.teamId +
            
        
            
            ", leaderId=" +
            

            
            this.leaderId +
            
        
            
            ", teamSide=" +
            

            
            this.teamSide +
            
        
            
            ", teamTypeId=" +
            

            
            this.teamTypeId +
            
        
            
            ", nbWaves=" +
            

            
            this.nbWaves +
            
        
            ')';
    
    }
}

