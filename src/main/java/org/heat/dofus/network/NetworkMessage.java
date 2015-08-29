package org.heat.dofus.network;

public abstract class NetworkMessage implements NetworkComponent {
    public boolean isAlwaysEmpty() {
        return false;
    }
}
