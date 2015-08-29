
// Created by Heat the 2015-03-01 20:21:54+01:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightLifePointsLostMessage extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
    public static final int PROTOCOL_ID = 6312;

    
        // i32
        public int targetId;
    
        // vi16
        public short loss;
    
        // vi16
        public short permanentDamages;
    

    public GameActionFightLifePointsLostMessage() { }

    
        public GameActionFightLifePointsLostMessage(short actionId, int sourceId, int targetId, short loss, short permanentDamages) {
            
            super(actionId, sourceId);
            

            
            this.targetId = targetId;
            
            this.loss = loss;
            
            this.permanentDamages = permanentDamages;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6312;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            
                writer.write_i32(this.targetId);
            

            

            

            
        
            
                writer.write_vi16(this.loss);
            

            

            

            
        
            
                writer.write_vi16(this.permanentDamages);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            
                this.targetId = reader.read_i32();
            

            

            

            
        
            
                this.loss = reader.read_vi16();
            

            

            

            
        
            
                this.permanentDamages = reader.read_vi16();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "GameActionFightLifePointsLostMessage(" +
        
            
            "actionId=" +
            

            
            this.actionId +
            
        
            
            ", sourceId=" +
            

            
            this.sourceId +
            
        
            
            ", targetId=" +
            

            
            this.targetId +
            
        
            
            ", loss=" +
            

            
            this.loss +
            
        
            
            ", permanentDamages=" +
            

            
            this.permanentDamages +
            
        
            ')';
    
    }
}

