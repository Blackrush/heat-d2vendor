
// Created by Heat the 2015-03-01 20:21:57+01:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarAddRequestMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6225;

    
        // i8
        public byte barType;
    
        // com.ankamagames.dofus.network.types.game.shortcut.Shortcut
        public com.ankamagames.dofus.network.types.game.shortcut.Shortcut shortcut;
    

    public ShortcutBarAddRequestMessage() { }

    
        public ShortcutBarAddRequestMessage(byte barType, com.ankamagames.dofus.network.types.game.shortcut.Shortcut shortcut) {
            

            
            this.barType = barType;
            
            this.shortcut = shortcut;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6225;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            
                writer.write_i8(this.barType);
            

            

            

            
        
            

            

            

            
                
                writer.write_ui16(this.shortcut.getProtocolId());
                
            this.shortcut.serialize(writer);
            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            
                this.barType = reader.read_i8();
            

            

            

            
        
            

            

            
                
                    int shortcut_typeId = reader.read_ui16();
                    this.shortcut = (com.ankamagames.dofus.network.types.game.shortcut.Shortcut) InternalProtocolTypeManager.get(shortcut_typeId);
                
                this.shortcut.deserialize(reader);
            

            
        
    }

    @Override
    public String toString() {
    
        return "ShortcutBarAddRequestMessage(" +
        
            
            "barType=" +
            

            
            this.barType +
            
        
            
            ", shortcut=" +
            

            
            this.shortcut +
            
        
            ')';
    
    }
}

