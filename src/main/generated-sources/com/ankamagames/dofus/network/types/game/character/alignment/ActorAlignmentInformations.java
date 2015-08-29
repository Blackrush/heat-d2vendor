
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.types.game.character.alignment;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ActorAlignmentInformations extends NetworkType {
    public static final int PROTOCOL_ID = 201;

    
        // i8
        public byte alignmentSide;
    
        // i8
        public byte alignmentValue;
    
        // i8
        public byte alignmentGrade;
    
        // vi32
        public int characterPower;
    

    public ActorAlignmentInformations() { }

    
        public ActorAlignmentInformations(byte alignmentSide, byte alignmentValue, byte alignmentGrade, int characterPower) {
            

            
            this.alignmentSide = alignmentSide;
            
            this.alignmentValue = alignmentValue;
            
            this.alignmentGrade = alignmentGrade;
            
            this.characterPower = characterPower;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 201;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.alignmentSide);
            

            

            

            
        
            
                writer.write_i8(this.alignmentValue);
            

            

            

            
        
            
                writer.write_i8(this.alignmentGrade);
            

            

            

            
        
            
                writer.write_vi32(this.characterPower);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.alignmentSide = reader.read_i8();
            

            

            

            
        
            
                this.alignmentValue = reader.read_i8();
            

            

            

            
        
            
                this.alignmentGrade = reader.read_i8();
            

            

            

            
        
            
                this.characterPower = reader.read_vi32();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "ActorAlignmentInformations(" +
        
            
            "alignmentSide=" +
            

            
            this.alignmentSide +
            
        
            
            ", alignmentValue=" +
            

            
            this.alignmentValue +
            
        
            
            ", alignmentGrade=" +
            

            
            this.alignmentGrade +
            
        
            
            ", characterPower=" +
            

            
            this.characterPower +
            
        
            ')';
    
    }
}

