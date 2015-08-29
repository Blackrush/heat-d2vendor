
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterLightInformations extends NetworkType {
    public static final int PROTOCOL_ID = 413;

    
        // flag,_loc2_,0
        public boolean sex;
    
        // flag,_loc2_,1
        public boolean alive;
    
        // i32
        public int id;
    
        // i8
        public byte wave;
    
        // vi16
        public short level;
    
        // i8
        public byte breed;
    

    public GameFightFighterLightInformations() { }

    
        public GameFightFighterLightInformations(boolean sex, boolean alive, int id, byte wave, short level, byte breed) {
            

            
            this.sex = sex;
            
            this.alive = alive;
            
            this.id = id;
            
            this.wave = wave;
            
            this.level = level;
            
            this.breed = breed;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 413;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.sex, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.alive, 1);
                
                writer.write_i8(_loc2_);
                
            

            
        
            
                writer.write_i32(this.id);
            

            

            

            
        
            
                writer.write_i8(this.wave);
            

            

            

            
        
            
                writer.write_vi16(this.level);
            

            

            

            
        
            
                writer.write_i8(this.breed);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.sex = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.alive = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            
                this.id = reader.read_i32();
            

            

            

            
        
            
                this.wave = reader.read_i8();
            

            

            

            
        
            
                this.level = reader.read_vi16();
            

            

            

            
        
            
                this.breed = reader.read_i8();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameFightFighterLightInformations(" +
        
            
            "sex=" +
            

            
            this.sex +
            
        
            
            ", alive=" +
            

            
            this.alive +
            
        
            
            ", id=" +
            

            
            this.id +
            
        
            
            ", wave=" +
            

            
            this.wave +
            
        
            
            ", level=" +
            

            
            this.level +
            
        
            
            ", breed=" +
            

            
            this.breed +
            
        
            ')';
    
    }
}

