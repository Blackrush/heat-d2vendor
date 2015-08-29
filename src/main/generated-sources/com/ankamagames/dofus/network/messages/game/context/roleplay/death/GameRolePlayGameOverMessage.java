
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.death;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayGameOverMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 746;

    

    public GameRolePlayGameOverMessage() { }

    
        public static final GameRolePlayGameOverMessage i = new GameRolePlayGameOverMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 746;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "GameRolePlayGameOverMessage";
    
    }
}

