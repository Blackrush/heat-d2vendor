package org.heat.dofus.network;

import org.heat.shared.io.DataWriter;

public interface NetworkSerializer {
    void serialize(DataWriter writer);
}
