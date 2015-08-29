
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.action.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightDispellableEffectExtendedInformations extends NetworkType {
    public static final int PROTOCOL_ID = 208;

    
        // vi16
        public short actionId;
    
        // i32
        public int sourceId;
    
        // com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect
        public com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect effect;
    

    public FightDispellableEffectExtendedInformations() { }

    
        public FightDispellableEffectExtendedInformations(short actionId, int sourceId, com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect effect) {
            

            
            this.actionId = actionId;
            
            this.sourceId = sourceId;
            
            this.effect = effect;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 208;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.actionId);
            

            

            

            
        
            
                writer.write_i32(this.sourceId);
            

            

            

            
        
            

            

            

            
                
                writer.write_ui16(this.effect.getProtocolId());
                
            this.effect.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.actionId = reader.read_vi16();
            

            

            

            
        
            
                this.sourceId = reader.read_i32();
            

            

            

            
        
            

            

            
                
                    int effect_typeId = reader.read_ui16();
                    this.effect = (com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect) InternalProtocolTypeManager.get(effect_typeId);
                
                this.effect.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "FightDispellableEffectExtendedInformations(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", effect=" +
            

            
            this.effect +
            
        
            ')';
    
    }
}

