package org.heat.dofus.network;

import org.heat.shared.io.DataReader;

public interface NetworkDeserializer {
    void deserialize(DataReader reader);
}
