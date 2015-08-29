
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightMinimalStatsPreparation extends com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats {
    public static final int PROTOCOL_ID = 360;

    
        // vi32
        public int initiative;
    

    public GameFightMinimalStatsPreparation() { }

    
        public GameFightMinimalStatsPreparation(int lifePoints, int maxLifePoints, int baseMaxLifePoints, int permanentDamagePercent, int shieldPoints, short actionPoints, short maxActionPoints, short movementPoints, short maxMovementPoints, int summoner, boolean summoned, short neutralElementResistPercent, short earthElementResistPercent, short waterElementResistPercent, short airElementResistPercent, short fireElementResistPercent, short neutralElementReduction, short earthElementReduction, short waterElementReduction, short airElementReduction, short fireElementReduction, short criticalDamageFixedResist, short pushDamageFixedResist, short dodgePALostProbability, short dodgePMLostProbability, short tackleBlock, short tackleEvade, byte invisibilityState, int initiative) {
            
            super(lifePoints, maxLifePoints, baseMaxLifePoints, permanentDamagePercent, shieldPoints, actionPoints, maxActionPoints, movementPoints, maxMovementPoints, summoner, summoned, neutralElementResistPercent, earthElementResistPercent, waterElementResistPercent, airElementResistPercent, fireElementResistPercent, neutralElementReduction, earthElementReduction, waterElementReduction, airElementReduction, fireElementReduction, criticalDamageFixedResist, pushDamageFixedResist, dodgePALostProbability, dodgePMLostProbability, tackleBlock, tackleEvade, invisibilityState);
            

            
            this.initiative = initiative;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 360;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_vi32(this.initiative);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.initiative = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightMinimalStatsPreparation(" +
        
            
            "lifePoints=" +
            

            
            this.lifePoints +
            
        
            
            ", maxLifePoints=" +
            

            
            this.maxLifePoints +
            
        
            
            ", baseMaxLifePoints=" +
            

            
            this.baseMaxLifePoints +
            
        
            
            ", permanentDamagePercent=" +
            

            
            this.permanentDamagePercent +
            
        
            
            ", shieldPoints=" +
            

            
            this.shieldPoints +
            
        
            
            ", actionPoints=" +
            

            
            this.actionPoints +
            
        
            
            ", maxActionPoints=" +
            

            
            this.maxActionPoints +
            
        
            
            ", movementPoints=" +
            

            
            this.movementPoints +
            
        
            
            ", maxMovementPoints=" +
            

            
            this.maxMovementPoints +
            
        
            
            ", summoner=" +
            

            
            this.summoner +
            
        
            
            ", summoned=" +
            

            
            this.summoned +
            
        
            
            ", neutralElementResistPercent=" +
            

            
            this.neutralElementResistPercent +
            
        
            
            ", earthElementResistPercent=" +
            

            
            this.earthElementResistPercent +
            
        
            
            ", waterElementResistPercent=" +
            

            
            this.waterElementResistPercent +
            
        
            
            ", airElementResistPercent=" +
            

            
            this.airElementResistPercent +
            
        
            
            ", fireElementResistPercent=" +
            

            
            this.fireElementResistPercent +
            
        
            
            ", neutralElementReduction=" +
            

            
            this.neutralElementReduction +
            
        
            
            ", earthElementReduction=" +
            

            
            this.earthElementReduction +
            
        
            
            ", waterElementReduction=" +
            

            
            this.waterElementReduction +
            
        
            
            ", airElementReduction=" +
            

            
            this.airElementReduction +
            
        
            
            ", fireElementReduction=" +
            

            
            this.fireElementReduction +
            
        
            
            ", criticalDamageFixedResist=" +
            

            
            this.criticalDamageFixedResist +
            
        
            
            ", pushDamageFixedResist=" +
            

            
            this.pushDamageFixedResist +
            
        
            
            ", dodgePALostProbability=" +
            

            
            this.dodgePALostProbability +
            
        
            
            ", dodgePMLostProbability=" +
            

            
            this.dodgePMLostProbability +
            
        
            
            ", tackleBlock=" +
            

            
            this.tackleBlock +
            
        
            
            ", tackleEvade=" +
            

            
            this.tackleEvade +
            
        
            
            ", invisibilityState=" +
            

            
            this.invisibilityState +
            
        
            
            ", initiative=" +
            

            
            this.initiative +
            
        
            ')';
    
    }
}

