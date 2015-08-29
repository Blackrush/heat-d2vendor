
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionMark extends NetworkType {
    public static final int PROTOCOL_ID = 351;

    
        // i32
        public int markAuthorId;
    
        // i8
        public byte markTeamId;
    
        // i32
        public int markSpellId;
    
        // i8
        public byte markSpellLevel;
    
        // i16
        public short markId;
    
        // i8
        public byte markType;
    
        // i16
        public short markimpactCell;
    
        // array,com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell
        public com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell[] cells;
    
        // bool
        public boolean active;
    

    public GameActionMark() { }

    
        public GameActionMark(int markAuthorId, byte markTeamId, int markSpellId, byte markSpellLevel, short markId, byte markType, short markimpactCell, com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell[] cells, boolean active) {
            

            
            this.markAuthorId = markAuthorId;
            
            this.markTeamId = markTeamId;
            
            this.markSpellId = markSpellId;
            
            this.markSpellLevel = markSpellLevel;
            
            this.markId = markId;
            
            this.markType = markType;
            
            this.markimpactCell = markimpactCell;
            
            this.cells = cells;
            
            this.active = active;
            
        }

        
        public GameActionMark(int markAuthorId, byte markTeamId, int markSpellId, byte markSpellLevel, short markId, byte markType, short markimpactCell, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell> cells, boolean active) {
            

            
                
                this.markAuthorId = markAuthorId;
                
            
                
                this.markTeamId = markTeamId;
                
            
                
                this.markSpellId = markSpellId;
                
            
                
                this.markSpellLevel = markSpellLevel;
                
            
                
                this.markId = markId;
                
            
                
                this.markType = markType;
                
            
                
                this.markimpactCell = markimpactCell;
                
            
                
                this.cells = cells.toArray(com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell[]::new);
                
            
                
                this.active = active;
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 351;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i32(this.markAuthorId);
            

            

            

            
        
            
                writer.write_i8(this.markTeamId);
            

            

            

            
        
            
                writer.write_i32(this.markSpellId);
            

            

            

            
        
            
                writer.write_i8(this.markSpellLevel);
            

            

            

            
        
            
                writer.write_i16(this.markId);
            

            

            

            
        
            
                writer.write_i8(this.markType);
            

            

            

            
        
            
                writer.write_i16(this.markimpactCell);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(cells.length);
                    
                    for (int i = 0; i < cells.length; i++) {
                        
                        cells[i].serialize(writer);
                    }
                
            

            

            
        
            
                writer.write_bool(this.active);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.markAuthorId = reader.read_i32();
            

            

            

            
        
            
                this.markTeamId = reader.read_i8();
            

            

            

            
        
            
                this.markSpellId = reader.read_i32();
            

            

            

            
        
            
                this.markSpellLevel = reader.read_i8();
            

            

            

            
        
            
                this.markId = reader.read_i16();
            

            

            

            
        
            
                this.markType = reader.read_i8();
            

            

            

            
        
            
                this.markimpactCell = reader.read_i16();
            

            

            

            
        
            

            

            

            
                
                int cells_length = reader.read_ui16();
                

                
                    this.cells = new com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell[cells_length];

                    for (int i = 0; i < cells_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell cells_it =
                                    new com.ankamagames.dofus.network.types.game.actions.fight.GameActionMarkedCell();
                        

                        cells_it.deserialize(reader);
                        this.cells[i] = cells_it;
                    }
                
            
        
            
                this.active = reader.read_bool();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionMark(" +
        
            
            "markAuthorId=" +
            

            
            this.markAuthorId +
            
        
            
            ", markTeamId=" +
            

            
            this.markTeamId +
            
        
            
            ", markSpellId=" +
            

            
            this.markSpellId +
            
        
            
            ", markSpellLevel=" +
            

            
            this.markSpellLevel +
            
        
            
            ", markId=" +
            

            
            this.markId +
            
        
            
            ", markType=" +
            

            
            this.markType +
            
        
            
            ", markimpactCell=" +
            

            
            this.markimpactCell +
            
        
            
            ", cells=" +
            

            
            
            java.util.Arrays.toString(this.cells) +
            
            
        
            
            ", active=" +
            

            
            this.active +
            
        
            ')';
    
    }
}

