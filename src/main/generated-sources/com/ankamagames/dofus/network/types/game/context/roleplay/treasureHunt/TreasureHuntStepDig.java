
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntStepDig extends com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep {
    public static final int PROTOCOL_ID = 465;

    

    public TreasureHuntStepDig() { }

    

    @Override
    public int getProtocolId() {
        return 465;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
    }

    @Override
    public String toString() {
    
        return "TreasureHuntStepDig(" +
        
            ')';
    
    }
}

