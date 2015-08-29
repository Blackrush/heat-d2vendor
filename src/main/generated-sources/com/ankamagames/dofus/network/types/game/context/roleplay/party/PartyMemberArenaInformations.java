
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberArenaInformations extends com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations {
    public static final int PROTOCOL_ID = 391;

    
        // vi16
        public short rank;
    

    public PartyMemberArenaInformations() { }

    
        public PartyMemberArenaInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, byte breed, boolean sex, int lifePoints, int maxLifePoints, short prospecting, short regenRate, short initiative, byte alignmentSide, short worldX, short worldY, int mapId, short subAreaId, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status, com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionMemberInformations[] companions, short rank) {
            
            super(id, level, name, entityLook, breed, sex, lifePoints, maxLifePoints, prospecting, regenRate, initiative, alignmentSide, worldX, worldY, mapId, subAreaId, status, companions);
            

            
            this.rank = rank;
            
        }

        
        public PartyMemberArenaInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, byte breed, boolean sex, int lifePoints, int maxLifePoints, short prospecting, short regenRate, short initiative, byte alignmentSide, short worldX, short worldY, int mapId, short subAreaId, com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionMemberInformations> companions, short rank) {
            
            super(id, level, name, entityLook, breed, sex, lifePoints, maxLifePoints, prospecting, regenRate, initiative, alignmentSide, worldX, worldY, mapId, subAreaId, status, companions);
            

            
                
                this.rank = rank;
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 391;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi16(this.rank);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.rank = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "PartyMemberArenaInformations(" +
        
            
            "id=" +
            

            
            this.id +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", name=" +
            

            
            this.name +
            
        
            
            ", entityLook=" +
            

            
            this.entityLook +
            
        
            
            ", breed=" +
            

            
            this.breed +
            
        
            
            ", sex=" +
            

            
            this.sex +
            
        
            
            ", lifePoints=" +
            

            
            this.lifePoints +
            
        
            
            ", maxLifePoints=" +
            

            
            this.maxLifePoints +
            
        
            
            ", prospecting=" +
            

            
            this.prospecting +
            
        
            
            ", regenRate=" +
            

            
            this.regenRate +
            
        
            
            ", initiative=" +
            

            
            this.initiative +
            
        
            
            ", alignmentSide=" +
            

            
            this.alignmentSide +
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            
            ", status=" +
            

            
            this.status +
            
        
            
            ", companions=" +
            

            
            
            java.util.Arrays.toString(this.companions) +
            
            
        
            
            ", rank=" +
            

            
            this.rank +
            
        
            ')';
    
    }
}

