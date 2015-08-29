
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationMemberInformations extends com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations {
    public static final int PROTOCOL_ID = 376;

    
        // i16
        public short worldX;
    
        // i16
        public short worldY;
    
        // i32
        public int mapId;
    
        // vi16
        public short subAreaId;
    
        // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations[] companions;
    

    public PartyInvitationMemberInformations() { }

    
        public PartyInvitationMemberInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, byte breed, boolean sex, short worldX, short worldY, int mapId, short subAreaId, com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations[] companions) {
            
            super(id, level, name, entityLook, breed, sex);
            

            
            this.worldX = worldX;
            
            this.worldY = worldY;
            
            this.mapId = mapId;
            
            this.subAreaId = subAreaId;
            
            this.companions = companions;
            
        }

        
        public PartyInvitationMemberInformations(int id, short level, java.lang.String name, com.ankamagames.dofus.network.types.game.look.EntityLook entityLook, byte breed, boolean sex, short worldX, short worldY, int mapId, short subAreaId, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations> companions) {
            
            super(id, level, name, entityLook, breed, sex);
            

            
                
                this.worldX = worldX;
                
            
                
                this.worldY = worldY;
                
            
                
                this.mapId = mapId;
                
            
                
                this.subAreaId = subAreaId;
                
            
                
                this.companions = companions.toArray(com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 376;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i16(this.worldX);
            

            

            

            
        
            
                writer.write_i16(this.worldY);
            

            

            

            
        
            
                writer.write_i32(this.mapId);
            

            

            

            
        
            
                writer.write_vi16(this.subAreaId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(companions.length);
                    
                    for (int i = 0; i < companions.length; i++) {
                        
                        companions[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.worldX = reader.read_i16();
            

            

            

            
        
            
                this.worldY = reader.read_i16();
            

            

            

            
        
            
                this.mapId = reader.read_i32();
            

            

            

            
        
            
                this.subAreaId = reader.read_vi16();
            

            

            

            
        
            

            

            

            
                
                int companions_length = reader.read_ui16();
                

                
                    this.companions = new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations[companions_length];

                    for (int i = 0; i < companions_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations companions_it =
                                    new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations();
                        

                        companions_it.deserialize(reader);
                        this.companions[i] = companions_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "PartyInvitationMemberInformations(" +
        
            
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
            
        
            
            ", worldX=" +
            

            
            this.worldX +
            
        
            
            ", worldY=" +
            

            
            this.worldY +
            
        
            
            ", mapId=" +
            

            
            this.mapId +
            
        
            
            ", subAreaId=" +
            

            
            this.subAreaId +
            
        
            
            ", companions=" +
            

            
            
            java.util.Arrays.toString(this.companions) +
            
            
        
            ')';
    
    }
}

