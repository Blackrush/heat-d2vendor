
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInformationsGeneralMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5557;

    
        // flag,_loc2_,0
        public boolean enabled;
    
        // flag,_loc2_,1
        public boolean abandonnedPaddock;
    
        // ui8
        public short level;
    
        // vi64
        public long expLevelFloor;
    
        // vi64
        public long experience;
    
        // vi64
        public long expNextLevelFloor;
    
        // i32
        public int creationDate;
    
        // vi16
        public short nbTotalMembers;
    
        // vi16
        public short nbConnectedMembers;
    

    public GuildInformationsGeneralMessage() { }

    
        public GuildInformationsGeneralMessage(boolean enabled, boolean abandonnedPaddock, short level, long expLevelFloor, long experience, long expNextLevelFloor, int creationDate, short nbTotalMembers, short nbConnectedMembers) {
            

            
            this.enabled = enabled;
            
            this.abandonnedPaddock = abandonnedPaddock;
            
            this.level = level;
            
            this.expLevelFloor = expLevelFloor;
            
            this.experience = experience;
            
            this.expNextLevelFloor = expNextLevelFloor;
            
            this.creationDate = creationDate;
            
            this.nbTotalMembers = nbTotalMembers;
            
            this.nbConnectedMembers = nbConnectedMembers;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5557;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.enabled, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.abandonnedPaddock, 1);
                
                writer.write_i8(_loc2_);
                
            

            
        
            
                writer.write_ui8(this.level);
            

            

            

            
        
            
                writer.write_vi64(this.expLevelFloor);
            

            

            

            
        
            
                writer.write_vi64(this.experience);
            

            

            

            
        
            
                writer.write_vi64(this.expNextLevelFloor);
            

            

            

            
        
            
                writer.write_i32(this.creationDate);
            

            

            

            
        
            
                writer.write_vi16(this.nbTotalMembers);
            

            

            

            
        
            
                writer.write_vi16(this.nbConnectedMembers);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.enabled = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.abandonnedPaddock = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            
                this.level = reader.read_ui8();
            

            

            

            
        
            
                this.expLevelFloor = reader.read_vi64();
            

            

            

            
        
            
                this.experience = reader.read_vi64();
            

            

            

            
        
            
                this.expNextLevelFloor = reader.read_vi64();
            

            

            

            
        
            
                this.creationDate = reader.read_i32();
            

            

            

            
        
            
                this.nbTotalMembers = reader.read_vi16();
            

            

            

            
        
            
                this.nbConnectedMembers = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildInformationsGeneralMessage(" +
        
            
            "enabled=" +
            

            
            this.enabled +
            
        
            
            ", abandonnedPaddock=" +
            

            
            this.abandonnedPaddock +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", expLevelFloor=" +
            

            
            this.expLevelFloor +
            
        
            
            ", experience=" +
            

            
            this.experience +
            
        
            
            ", expNextLevelFloor=" +
            

            
            this.expNextLevelFloor +
            
        
            
            ", creationDate=" +
            

            
            this.creationDate +
            
        
            
            ", nbTotalMembers=" +
            

            
            this.nbTotalMembers +
            
        
            
            ", nbConnectedMembers=" +
            

            
            this.nbConnectedMembers +
            
        
            ')';
    
    }
}

