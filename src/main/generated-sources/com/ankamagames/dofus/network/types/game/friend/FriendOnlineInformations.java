
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendOnlineInformations extends com.ankamagames.dofus.network.types.game.friend.FriendInformations {
    public static final int PROTOCOL_ID = 92;

    
        // vi32
        public int playerId;
    
        // str
        public java.lang.String playerName;
    
        // ui8
        public short level;
    
        // i8
        public byte alignmentSide;
    
        // i8
        public byte breed;
    
        // bool
        public boolean sex;
    
        // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo;
    
        // i8
        public byte moodSmileyId;
    
        // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
        public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;
    

    public FriendOnlineInformations() { }

    
        public FriendOnlineInformations(int accountId, java.lang.String accountName, byte playerState, short lastConnection, int achievementPoints, int playerId, java.lang.String playerName, short level, byte alignmentSide, byte breed, boolean sex, com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo, byte moodSmileyId, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status) {
            
            super(accountId, accountName, playerState, lastConnection, achievementPoints);
            

            
            this.playerId = playerId;
            
            this.playerName = playerName;
            
            this.level = level;
            
            this.alignmentSide = alignmentSide;
            
            this.breed = breed;
            
            this.sex = sex;
            
            this.guildInfo = guildInfo;
            
            this.moodSmileyId = moodSmileyId;
            
            this.status = status;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 92;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.playerId);
            

            

            

            
        
            
                writer.write_str(this.playerName);
            

            

            

            
        
            
                writer.write_ui8(this.level);
            

            

            

            
        
            
                writer.write_i8(this.alignmentSide);
            

            

            

            
        
            
                writer.write_i8(this.breed);
            

            

            

            
        
            
                writer.write_bool(this.sex);
            

            

            

            
        
            

            

            

            
                
            this.guildInfo.serialize(writer);
            
        
            
                writer.write_i8(this.moodSmileyId);
            

            

            

            
        
            

            

            

            
                
                writer.write_ui16(this.status.getProtocolId());
                
            this.status.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.playerId = reader.read_vi32();
            

            

            

            
        
            
                this.playerName = reader.read_str();
            

            

            

            
        
            
                this.level = reader.read_ui8();
            

            

            

            
        
            
                this.alignmentSide = reader.read_i8();
            

            

            

            
        
            
                this.breed = reader.read_i8();
            

            

            

            
        
            
                this.sex = reader.read_bool();
            

            

            

            
        
            

            

            
                
                    this.guildInfo = new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
                
                this.guildInfo.deserialize(reader);
            

            
        
            
                this.moodSmileyId = reader.read_i8();
            

            

            

            
        
            

            

            
                
                    int status_typeId = reader.read_ui16();
                    this.status = (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus) InternalProtocolTypeManager.get(status_typeId);
                
                this.status.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "FriendOnlineInformations(" +
        
            
            "accountId=" +
            

            
            this.accountId +
            
        
            
            ", accountName=" +
            

            
            this.accountName +
            
        
            
            ", playerState=" +
            

            
            this.playerState +
            
        
            
            ", lastConnection=" +
            

            
            this.lastConnection +
            
        
            
            ", achievementPoints=" +
            

            
            this.achievementPoints +
            
        
            
            ", playerId=" +
            

            
            this.playerId +
            
        
            
            ", playerName=" +
            

            
            this.playerName +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", alignmentSide=" +
            

            
            this.alignmentSide +
            
        
            
            ", breed=" +
            

            
            this.breed +
            
        
            
            ", sex=" +
            

            
            this.sex +
            
        
            
            ", guildInfo=" +
            

            
            this.guildInfo +
            
        
            
            ", moodSmileyId=" +
            

            
            this.moodSmileyId +
            
        
            
            ", status=" +
            

            
            this.status +
            
        
            ')';
    
    }
}

