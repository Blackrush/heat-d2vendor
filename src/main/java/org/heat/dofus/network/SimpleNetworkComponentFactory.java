package org.heat.dofus.network;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class SimpleNetworkComponentFactory<T extends NetworkComponent> implements NetworkComponentFactory<T> {
    private final Map<Integer, Supplier<T>> suppliers;

    public SimpleNetworkComponentFactory(Map<Integer, Supplier<T>> suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    public Optional<T> create(int id) {
        Supplier<T> supplier = suppliers.get(id);

        if (supplier == null) {
            return Optional.empty();
        }

        return Optional.of(supplier.get());
    }
}
