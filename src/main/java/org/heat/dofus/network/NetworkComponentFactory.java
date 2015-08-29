package org.heat.dofus.network;

import java.util.Optional;

@FunctionalInterface
public interface NetworkComponentFactory<T extends NetworkComponent> {
    Optional<T> create(int id);

    default NetworkComponentFactory<T> withFallback(final NetworkComponentFactory<T> after) {
        final NetworkComponentFactory<T> before = this;
        return id -> {
            Optional<T> opt = before.create(id);
            if (opt.isPresent()) {
                return opt;
            }
            return after.create(id);
        };
    }
}
