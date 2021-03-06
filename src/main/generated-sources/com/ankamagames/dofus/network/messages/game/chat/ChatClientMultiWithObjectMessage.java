
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatClientMultiWithObjectMessage extends com.ankamagames.dofus.network.messages.game.chat.ChatClientMultiMessage {
    public static final int PROTOCOL_ID = 862;

    
        // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
        public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;
    

    public ChatClientMultiWithObjectMessage() { }

    
        public ChatClientMultiWithObjectMessage(java.lang.String content, byte channel, com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects) {
            
            super(content, channel);
            

            
            this.objects = objects;
            
        }

        
        public ChatClientMultiWithObjectMessage(java.lang.String content, byte channel, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem> objects) {
            
            super(content, channel);
            

            
                
                this.objects = objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 862;
    }

    @Override
    public void serialize(DataWriter writer) {
        
        super.serialize(writer);
        

        
            

            
                
                    
                    writer.write_ui16(objects.length);
                    
                    for (int i = 0; i < objects.length; i++) {
                        
                        objects[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        
        super.deserialize(reader);
        

        
            

            

            

            
                
                int objects_length = reader.read_ui16();
                

                
                    this.objects = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[objects_length];

                    for (int i = 0; i < objects_length; i++) {
                        
                            com.ankamagames.dofus.network.types.game.data.items.ObjectItem objects_it =
                                    new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();
                        

                        objects_it.deserialize(reader);
                        this.objects[i] = objects_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "ChatClientMultiWithObjectMessage(" +
        
            
            "content=" +
            

            
            this.content +
            
        
            
            ", channel=" +
            

            
            this.channel +
            
        
            
            ", objects=" +
            

            
            
            java.util.Arrays.toString(this.objects) +
            
            
        
            ')';
    
    }
}

