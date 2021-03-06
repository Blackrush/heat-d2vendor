
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextCreateErrorMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6024;

    

    public GameContextCreateErrorMessage() { }

    
        public static final GameContextCreateErrorMessage i = new GameContextCreateErrorMessage();

        @Override
        public boolean isAlwaysEmpty() {
            return true;
        }
    

    @Override
    public int getProtocolId() {
        return 6024;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
    }

    @Override
    public String toString() {
    
        return "GameContextCreateErrorMessage";
    
    }
}

