
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMember extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations {
    public static final int PROTOCOL_ID = 88;

    
        // i8
        public byte breed;
    
        // bool
        public boolean sex;
    
        // vi16
        public short rank;
    
        // vi64
        public long givenExperience;
    
        // i8
        public byte experienceGivenPercent;
    
        // vi32
        public int rights;
    
        // i8
        public byte connected;
    
        // i8
        public byte alignmentSide;
    
        // ui16
        public int hoursSinceLastConnection;
    
        // i8
        public byte moodSmileyId;
    
        // i32
        public int accountId;
    
        // i32
        public int achievementPoints;
    
        // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
        public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;
    

    public GuildMember() { }

    
        public GuildMember(int id, short level, java.lang.String name, byte breed, boolean sex, short rank, long givenExperience, byte experienceGivenPercent, int rights, byte connected, byte alignmentSide, int hoursSinceLastConnection, byte moodSmileyId, int accountId, int achievementPoints, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status) {
            
            super(id, level, name);
            

            
            this.breed = breed;
            
            this.sex = sex;
            
            this.rank = rank;
            
            this.givenExperience = givenExperience;
            
            this.experienceGivenPercent = experienceGivenPercent;
            
            this.rights = rights;
            
            this.connected = connected;
            
            this.alignmentSide = alignmentSide;
            
            this.hoursSinceLastConnection = hoursSinceLastConnection;
            
            this.moodSmileyId = moodSmileyId;
            
            this.accountId = accountId;
            
            this.achievementPoints = achievementPoints;
            
            this.status = status;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 88;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i8(this.breed);
            

            

            

            
        
            
                writer.write_bool(this.sex);
            

            

            

            
        
            
                writer.write_vi16(this.rank);
            

            

            

            
        
            
                writer.write_vi64(this.givenExperience);
            

            

            

            
        
            
                writer.write_i8(this.experienceGivenPercent);
            

            

            

            
        
            
                writer.write_vi32(this.rights);
            

            

            

            
        
            
                writer.write_i8(this.connected);
            

            

            

            
        
            
                writer.write_i8(this.alignmentSide);
            

            

            

            
        
            
                writer.write_ui16(this.hoursSinceLastConnection);
            

            

            

            
        
            
                writer.write_i8(this.moodSmileyId);
            

            

            

            
        
            
                writer.write_i32(this.accountId);
            

            

            

            
        
            
                writer.write_i32(this.achievementPoints);
            

            

            

            
        
            

            

            

            
                
                writer.write_ui16(this.status.getProtocolId());
                
            this.status.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.breed = reader.read_i8();
            

            

            

            
        
            
                this.sex = reader.read_bool();
            

            

            

            
        
            
                this.rank = reader.read_vi16();
            

            

            

            
        
            
                this.givenExperience = reader.read_vi64();
            

            

            

            
        
            
                this.experienceGivenPercent = reader.read_i8();
            

            

            

            
        
            
                this.rights = reader.read_vi32();
            

            

            

            
        
            
                this.connected = reader.read_i8();
            

            

            

            
        
            
                this.alignmentSide = reader.read_i8();
            

            

            

            
        
            
                this.hoursSinceLastConnection = reader.read_ui16();
            

            

            

            
        
            
                this.moodSmileyId = reader.read_i8();
            

            

            

            
        
            
                this.accountId = reader.read_i32();
            

            

            

            
        
            
                this.achievementPoints = reader.read_i32();
            

            

            

            
        
            

            

            
                
                    int status_typeId = reader.read_ui16();
                    this.status = (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus) InternalProtocolTypeManager.get(status_typeId);
                
                this.status.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "GuildMember(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", breed=" +
            

            
            this.breed +
            
        
            
            ", sex=" +
            

            
            this.sex +
            
        
            
            ", rank=" +
            

            
            this.rank +
            
        
            
            ", givenExperience=" +
            

            
            this.givenExperience +
            
        
            
            ", experienceGivenPercent=" +
            

            
            this.experienceGivenPercent +
            
        
            
            ", rights=" +
            

            
            this.rights +
            
        
            
            ", connected=" +
            

            
            this.connected +
            
        
            
            ", alignmentSide=" +
            

            
            this.alignmentSide +
            
        
            
            ", hoursSinceLastConnection=" +
            

            
            this.hoursSinceLastConnection +
            
        
            
            ", moodSmileyId=" +
            

            
            this.moodSmileyId +
            
        
            
            ", accountId=" +
            

            
            this.accountId +
            
        
            
            ", achievementPoints=" +
            

            
            this.achievementPoints +
            
        
            
            ", status=" +
            

            
            this.status +
            
        
            ')';
    
    }
}

