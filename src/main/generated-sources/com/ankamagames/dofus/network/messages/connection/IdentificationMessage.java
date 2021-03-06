
// Created by Heat the 2015-03-01 20:22:00+01:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 4;

    
        // flag,_loc2_,0
        public boolean autoconnect;
    
        // flag,_loc2_,1
        public boolean useCertificate;
    
        // flag,_loc2_,2
        public boolean useLoginToken;
    
        // com.ankamagames.dofus.network.types.version.VersionExtended
        public com.ankamagames.dofus.network.types.version.VersionExtended version;
    
        // str
        public java.lang.String lang;
    
        // array,i8
        public byte[] credentials;
    
        // i16
        public short serverId;
    
        // f64
        public double sessionOptionalSalt;
    

    public IdentificationMessage() { }

    
        public IdentificationMessage(boolean autoconnect, boolean useCertificate, boolean useLoginToken, com.ankamagames.dofus.network.types.version.VersionExtended version, java.lang.String lang, byte[] credentials, short serverId, double sessionOptionalSalt) {
            

            
            this.autoconnect = autoconnect;
            
            this.useCertificate = useCertificate;
            
            this.useLoginToken = useLoginToken;
            
            this.version = version;
            
            this.lang = lang;
            
            this.credentials = credentials;
            
            this.serverId = serverId;
            
            this.sessionOptionalSalt = sessionOptionalSalt;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 4;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            

            
                
                int _loc2_ = 0;
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.autoconnect, 0);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.useCertificate, 1);
                
            

            
        
            

            

            
                
                _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.useLoginToken, 2);
                
                writer.write_i8(_loc2_);
                
            

            
        
            

            

            

            
                
            this.version.serialize(writer);
            
        
            
                writer.write_str(this.lang);
            

            

            

            
        
            

            
                
                    
                    writer.write_ui16(credentials.length);
                    
                    writer.write_array_i8(this.credentials);
                
            

            

            
        
            
                writer.write_i16(this.serverId);
            

            

            

            
        
            
                writer.write_f64(this.sessionOptionalSalt);
            

            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            
                
                    int _loc2_ = reader.read_i8();
                
                this.autoconnect = BooleanByteWrapper.getFlag(_loc2_, 0);
            

            

            
        
            

            
                
                this.useCertificate = BooleanByteWrapper.getFlag(_loc2_, 1);
            

            

            
        
            

            
                
                this.useLoginToken = BooleanByteWrapper.getFlag(_loc2_, 2);
            

            

            
        
            

            

            
                
                    this.version = new com.ankamagames.dofus.network.types.version.VersionExtended();
                
                this.version.deserialize(reader);
            

            
        
            
                this.lang = reader.read_str();
            

            

            

            
        
            

            

            

            
                
                int credentials_length = reader.read_ui16();
                

                
                    this.credentials = reader.read_array_i8(credentials_length);
                
            
        
            
                this.serverId = reader.read_i16();
            

            

            

            
        
            
                this.sessionOptionalSalt = reader.read_f64();
            

            

            

            
        
    }

    @Override
    public String toString() {
    
        return "IdentificationMessage(" +
        
            
            "autoconnect=" +
            

            
            this.autoconnect +
            
        
            
            ", useCertificate=" +
            

            
            this.useCertificate +
            
        
            
            ", useLoginToken=" +
            

            
            this.useLoginToken +
            
        
            
            ", version=" +
            

            
            this.version +
            
        
            
            ", lang=" +
            

            
            this.lang +
            
        
            
            ", credentials=" +
            

            
            
            + this.credentials.length + "b" +
            
            
        
            
            ", serverId=" +
            

            
            this.serverId +
            
        
            
            ", sessionOptionalSalt=" +
            

            
            this.sessionOptionalSalt +
            
        
            ')';
    
    }
}

