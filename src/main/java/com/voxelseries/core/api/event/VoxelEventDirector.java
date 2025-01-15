package com.voxelseries.core.api.event;

import net.endergrid.atom.event.grouped.AtomGroupedEventBus;
import net.endergrid.atom.event.handler.AtomEventRegistration;

public interface VoxelEventDirector {
    void call(VoxelEvent event);

    void register(AtomEventRegistration<?> registration);

    AtomGroupedEventBus<VoxelEvent> voxel();

    AtomGroupedEventBus<VoxelEvent> configs();
}
