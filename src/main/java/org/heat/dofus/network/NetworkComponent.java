package org.heat.dofus.network;

public interface NetworkComponent extends NetworkSerializer, NetworkDeserializer {
    int getProtocolId();
}
