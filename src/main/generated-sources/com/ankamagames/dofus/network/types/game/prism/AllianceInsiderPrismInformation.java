
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInsiderPrismInformation extends com.ankamagames.dofus.network.types.game.prism.PrismInformation {
    public static final int PROTOCOL_ID = 431;

    
        // i32
        public int lastTimeSlotModificationDate;
    
        // vi32
        public int lastTimeSlotModificationAuthorGuildId;
    
        // vi32
        public int lastTimeSlotModificationAuthorId;
    
        // str
        public java.lang.String lastTimeSlotModificationAuthorName;
    
        // array,vi32
        public int[] modulesItemIds;
    

    public AllianceInsiderPrismInformation() { }

    
        public AllianceInsiderPrismInformation(byte typeId, byte state, int nextVulnerabilityDate, int placementDate, int rewardTokenCount, int lastTimeSlotModificationDate, int lastTimeSlotModificationAuthorGuildId, int lastTimeSlotModificationAuthorId, java.lang.String lastTimeSlotModificationAuthorName, int[] modulesItemIds) {
            
            super(typeId, state, nextVulnerabilityDate, placementDate, rewardTokenCount);
            

            
            this.lastTimeSlotModificationDate = lastTimeSlotModificationDate;
            
            this.lastTimeSlotModificationAuthorGuildId = lastTimeSlotModificationAuthorGuildId;
            
            this.lastTimeSlotModificationAuthorId = lastTimeSlotModificationAuthorId;
            
            this.lastTimeSlotModificationAuthorName = lastTimeSlotModificationAuthorName;
            
            this.modulesItemIds = modulesItemIds;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 431;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.lastTimeSlotModificationDate);
            

            

            

            
        
            
                writer.write_vi32(this.lastTimeSlotModificationAuthorGuildId);
            

            

            

            
        
            
                writer.write_vi32(this.lastTimeSlotModificationAuthorId);
            

            

            

            
        
            
                writer.write_str(this.lastTimeSlotModificationAuthorName);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(modulesItemIds.length);
                    
                    writer.write_array_vi32(this.modulesItemIds);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.lastTimeSlotModificationDate = reader.read_i32();
            

            

            

            
        
            
                this.lastTimeSlotModificationAuthorGuildId = reader.read_vi32();
            

            

            

            
        
            
                this.lastTimeSlotModificationAuthorId = reader.read_vi32();
            

            

            

            
        
            
                this.lastTimeSlotModificationAuthorName = reader.read_str();
            

            

            

            
        
            

            

            

            
                
                int modulesItemIds_length = reader.read_ui16();
                

                
                    this.modulesItemIds = reader.read_array_vi32(modulesItemIds_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "AllianceInsiderPrismInformation(" +
        
            
            "typeId=" +
            

            
            this.typeId +
            
        
            
            ", state=" +
            

            
            this.state +
            
        
            
            ", nextVulnerabilityDate=" +
            

            
            this.nextVulnerabilityDate +
            
        
            
            ", placementDate=" +
            

            
            this.placementDate +
            
        
            
            ", rewardTokenCount=" +
            

            
            this.rewardTokenCount +
            
        
            
            ", lastTimeSlotModificationDate=" +
            

            
            this.lastTimeSlotModificationDate +
            
        
            
            ", lastTimeSlotModificationAuthorGuildId=" +
            

            
            this.lastTimeSlotModificationAuthorGuildId +
            
        
            
            ", lastTimeSlotModificationAuthorId=" +
            

            
            this.lastTimeSlotModificationAuthorId +
            
        
            
            ", lastTimeSlotModificationAuthorName=" +
            

            
            this.lastTimeSlotModificationAuthorName +
            
        
            
            ", modulesItemIds=" +
            

            
            
            java.util.Arrays.toString(this.modulesItemIds) +
            
            
        
            ')';
    
    }
}

