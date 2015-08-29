
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcDialogQuestionMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5617;

    
        // vi16
        public short messageId;
    
        // array,str
        public java.lang.String[] dialogParams;
    
        // array,vi16
        public short[] visibleReplies;
    

    public NpcDialogQuestionMessage() { }

    
        public NpcDialogQuestionMessage(short messageId, java.lang.String[] dialogParams, short[] visibleReplies) {
            

            
            this.messageId = messageId;
            
            this.dialogParams = dialogParams;
            
            this.visibleReplies = visibleReplies;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 5617;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_vi16(this.messageId);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(dialogParams.length);
                    
                    writer.write_array_str(this.dialogParams);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(visibleReplies.length);
                    
                    writer.write_array_vi16(this.visibleReplies);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.messageId = reader.read_vi16();
            

            

            

            
        
            

            

            

            
                
                int dialogParams_length = reader.read_ui16();
                

                
                    this.dialogParams = reader.read_array_str(dialogParams_length);
                
            
        
            

            

            

            
                
                int visibleReplies_length = reader.read_ui16();
                

                
                    this.visibleReplies = reader.read_array_vi16(visibleReplies_length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "NpcDialogQuestionMessage(" +
        
            
            "messageId=" +
            

            
            this.messageId +
            
        
            
            ", dialogParams=" +
            

            
            
            java.util.Arrays.toString(this.dialogParams) +
            
            
        
            
            ", visibleReplies=" +
            

            
            
            java.util.Arrays.toString(this.visibleReplies) +
            
            
        
            ')';
    
    }
}

