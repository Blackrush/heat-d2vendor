
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightJoinMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 702;

    
        // flag,_loc2_,0
        public boolean canBeCancelled;
    
        // flag,_loc2_,1
        public boolean canSayReady;
    
        // flag,_loc2_,2
        public boolean isFightStarted;
    
        // i16
        public short timeMaxBeforeFightStart;
    
        // i8
        public byte fightType;
    

    public GameFightJoinMessage() { }

    
        public GameFightJoinMessage(boolean canBeCancelled, boolean canSayReady, boolean isFightStarted, short timeMaxBeforeFightStart, byte fightType) {
            

            
            this.canBeCancelled = canBeCancelled;
            
            this.canSayReady = canSayReady;
            
            this.isFightStarted = isFightStarted;
            
            this.timeMaxBeforeFightStart = timeMaxBeforeFightStart;
            
            this.fightType = fightType;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 702;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canBeCancelled, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canSayReady, 1);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isFightStarted, 2);
                
                writer.write_i8(_loc2_);
                
            

            
        
            
                writer.write_i16(this.timeMaxBeforeFightStart);
            

            

            

            
        
            
                writer.write_i8(this.fightType);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.canBeCancelled = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.canSayReady = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            

            
                
                this.isFightStarted = BooleanByteWrapper.getFlag(_loc2_, 2);
            

            

            
        
            
                this.timeMaxBeforeFightStart = reader.read_i16();
            

            

            

            
        
            
                this.fightType = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightJoinMessage(" +
        
            
            "canBeCancelled=" +
            

            
            this.canBeCancelled +
            
        
            
            ", canSayReady=" +
            

            
            this.canSayReady +
            
        
            
            ", isFightStarted=" +
            

            
            this.isFightStarted +
            
        
            
            ", timeMaxBeforeFightStart=" +
            

            
            this.timeMaxBeforeFightStart +
            
        
            
            ", fightType=" +
            

            
            this.fightType +
            
        
            ')';
    
    }
}

