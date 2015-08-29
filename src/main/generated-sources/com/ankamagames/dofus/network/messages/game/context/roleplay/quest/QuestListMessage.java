
// Created by Heat the 2015-03-01 20:21:56+01:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestListMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 5626;

    
        // array,vi16
        public short[] finishedQuestsIds;
    
        // array,vi16
        public short[] finishedQuestsCounts;
    
        // array,com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations
        public com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations[] activeQuests;
    

    public QuestListMessage() { }

    
        public QuestListMessage(short[] finishedQuestsIds, short[] finishedQuestsCounts, com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations[] activeQuests) {
            

            
            this.finishedQuestsIds = finishedQuestsIds;
            
            this.finishedQuestsCounts = finishedQuestsCounts;
            
            this.activeQuests = activeQuests;
            
        }

        
        public QuestListMessage(short[] finishedQuestsIds, short[] finishedQuestsCounts, java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations> activeQuests) {
            

            
                
                this.finishedQuestsIds = finishedQuestsIds;
                
            
                
                this.finishedQuestsCounts = finishedQuestsCounts;
                
            
                
                this.activeQuests = activeQuests.toArray(com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations[]::new);
                
            
        }
        
    

    @Override
    public int getProtocolId() {
        return 5626;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_ui16(finishedQuestsIds.length);
                    
                    writer.write_array_vi16(this.finishedQuestsIds);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(finishedQuestsCounts.length);
                    
                    writer.write_array_vi16(this.finishedQuestsCounts);
                
            

            

            
        
            

            
                
                    
                    writer.write_ui16(activeQuests.length);
                    
                    for (int i = 0; i < activeQuests.length; i++) {
                        
                        writer.write_ui16(activeQuests[i].getProtocolId());
                        
                        activeQuests[i].serialize(writer);
                    }
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int finishedQuestsIds_length = reader.read_ui16();
                

                
                    this.finishedQuestsIds = reader.read_array_vi16(finishedQuestsIds_length);
                
            
        
            

            

            

            
                
                int finishedQuestsCounts_length = reader.read_ui16();
                

                
                    this.finishedQuestsCounts = reader.read_array_vi16(finishedQuestsCounts_length);
                
            
        
            

            

            

            
                
                int activeQuests_length = reader.read_ui16();
                

                
                    this.activeQuests = new com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations[activeQuests_length];

                    for (int i = 0; i < activeQuests_length; i++) {
                        
                            int activeQuests_it_typeId = reader.read_ui16();
                            com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations activeQuests_it = (com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations)
                                    InternalProtocolTypeManager.get(activeQuests_it_typeId);
                        

                        activeQuests_it.deserialize(reader);
                        this.activeQuests[i] = activeQuests_it;
                    }
                
            
        
    }

    @Override
    public String toString() {
    
        return "QuestListMessage(" +
        
            
            "finishedQuestsIds=" +
            

            
            
            java.util.Arrays.toString(this.finishedQuestsIds) +
            
            
        
            
            ", finishedQuestsCounts=" +
            

            
            
            java.util.Arrays.toString(this.finishedQuestsCounts) +
            
            
        
            
            ", activeQuests=" +
            

            
            
            java.util.Arrays.toString(this.activeQuests) +
            
            
        
            ')';
    
    }
}

