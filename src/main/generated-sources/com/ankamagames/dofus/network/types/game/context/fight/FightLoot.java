
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightLoot extends NetworkType {
    public static final int PROTOCOL_ID = 41;

    
        // array,vi16
        public short[] objects;
    
        // vi32
        public int kamas;
    

    public FightLoot() { }

    
        public FightLoot(short[] objects, int kamas) {
            

            
            this.objects = objects;
            
            this.kamas = kamas;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 41;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(objects.length);
                    
                    writer.write_array_vi16(this.objects);
                
            

            

            
        
            
                writer.write_vi32(this.kamas);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int objects_length = reader.read_ui16();
                

                
                    this.objects = reader.read_array_vi16(objects_length);
                
            
        
            
                this.kamas = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "FightLoot(" +
        
            
            "objects=" +
            

            
            
            java.util.Arrays.toString(this.objects) +
            
            
        
            
            ", kamas=" +
            

            
            this.kamas +
            
        
            ')';
    
    }
}

