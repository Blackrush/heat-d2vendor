
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SlaveSwitchContextMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6214;

    
        // i32
        public int masterId;
    
        // i32
        public int slaveId;
    
        // array,com.ankamagames.dofus.network.types.game.data.items.SpellItem
        public com.ankamagames.dofus.network.types.game.data.items.SpellItem[] slaveSpells;
    
        // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations
        public com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations slaveStats;
    
        // array,com.ankamagames.dofus.network.types.game.shortcut.Shortcut
        public com.ankamagames.dofus.network.types.game.shortcut.Shortcut[] shortcuts;
    

    public SlaveSwitchContextMessage() { }

    
        public SlaveSwitchContextMessage(int masterId, int slaveId, com.ankamagames.dofus.network.types.game.data.items.SpellItem[] slaveSpells, com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations slaveStats, com.ankamagames.dofus.network.types.game.shortcut.Shortcut[] shortcuts) {
            

            
            this.masterId = masterId;
            
            this.slaveId = slaveId;
            
            this.slaveSpells = slaveSpells;
            
            this.slaveStats = slaveStats;
            
            this.shortcuts = shortcuts;
            
        }

        
        public SlaveSwitchContextMessage(int masterId, int slaveId, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.SpellItem> slaveSpells, com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations slaveStats, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.shortcut.Shortcut> shortcuts) {
            

            
                
                this.masterId = masterId;
                
            
                
                this.slaveId = slaveId;
                
            
                
                this.slaveSpells = slaveSpells.toArray(com.ankamagames.dofus.network.types.game.data.items.SpellItem[]::new);
                
            
                
                this.slaveStats = slaveStats;
                
            
                
                this.shortcuts = shortcuts.toArray(com.ankamagames.dofus.network.types.game.shortcut.Shortcut[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 6214;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.masterId);
            

            

            

            
        
            
                writer.write_i32(this.slaveId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(slaveSpells.length);
                    
                    for (int i = 0; i < slaveSpells.length; i++) {
                        
                        slaveSpells[i].serialize(writer);
                    }
                
            

            

            
        
            

            

            

            
                
            this.slaveStats.serialize(writer);
            
        
            

            
                
                    
                    writer.write_ui16(shortcuts.length);
                    
                    for (int i = 0; i < shortcuts.length; i++) {
                        
                        writer.write_ui16(shortcuts[i].getProtocolId());
                        
                        shortcuts[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.masterId = reader.read_i32();
            

            

            

            
        
            
                this.slaveId = reader.read_i32();
            

            

            

            
        
            

            

            

            
                
                int slaveSpells_length = reader.read_ui16();
                

                
                    this.slaveSpells = new com.ankamagames.dofus.network.types.game.data.items.SpellItem[slaveSpells_length];

                    for (int i = 0; i < slaveSpells_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.data.items.SpellItem slaveSpells_it =
                                    new com.ankamagames.dofus.network.types.game.data.items.SpellItem();
                        

                        slaveSpells_it.deserialize(reader);
                        this.slaveSpells[i] = slaveSpells_it;
                    }
                
            
        
            

            

            
                
                    this.slaveStats = new com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations();
                
                this.slaveStats.deserialize(reader);
            

            
        
            

            

            

            
                
                int shortcuts_length = reader.read_ui16();
                

                
                    this.shortcuts = new com.ankamagames.dofus.network.types.game.shortcut.Shortcut[shortcuts_length];

                    for (int i = 0; i < shortcuts_length; i++) {
                        
                            int shortcuts_it_typeId = reader.read_ui16();
                            com.ankamagames.dofus.network.types.game.shortcut.Shortcut shortcuts_it = (com.ankamagames.dofus.network.types.game.shortcut.Shortcut)
                                    InternalProtocolTypeManager.get(shortcuts_it_typeId);
                        

                        shortcuts_it.deserialize(reader);
                        this.shortcuts[i] = shortcuts_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "SlaveSwitchContextMessage(" +
        
            
            "masterId=" +
            

            
            this.masterId +
            
        
            
            ", slaveId=" +
            

            
            this.slaveId +
            
        
            
            ", slaveSpells=" +
            

            
            
            java.util.Arrays.toString(this.slaveSpells) +
            
            
        
            
            ", slaveStats=" +
            

            
            this.slaveStats +
            
        
            
            ", shortcuts=" +
            

            
            
            java.util.Arrays.toString(this.shortcuts) +
            
            
        
            ')';
    
    }
}

