
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTemporarySpellBoostEffect extends com.ankamagames.dofus.network.types.game.actions.fight.FightTemporaryBoostEffect {
    public static final int PROTOCOL_ID = 207;

    
        // vi16
        public short boostedSpellId;
    

    public FightTemporarySpellBoostEffect() { }

    
        public FightTemporarySpellBoostEffect(int uid, int targetId, short turnDuration, byte dispelable, short spellId, int effectId, int parentBoostUid, short delta, short boostedSpellId) {
            
            super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid, delta);
            

            
            this.boostedSpellId = boostedSpellId;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 207;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi16(this.boostedSpellId);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.boostedSpellId = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "FightTemporarySpellBoostEffect(" +
        
            
            "uid=" +
            

            
            this.uid +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", turnDuration=" +
            

            
            this.turnDuration +
            
        
            
            ", dispelable=" +
            

            
            this.dispelable +
            
        
            
            ", spellId=" +
            

            
            this.spellId +
            
        
            
            ", effectId=" +
            

            
            this.effectId +
            
        
            
            ", parentBoostUid=" +
            

            
            this.parentBoostUid +
            
        
            
            ", delta=" +
            

            
            this.delta +
            
        
            
            ", boostedSpellId=" +
            

            
            this.boostedSpellId +
            
        
            ')';
    
    }
}

