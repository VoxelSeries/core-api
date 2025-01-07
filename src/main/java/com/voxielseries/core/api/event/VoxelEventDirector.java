package com.voxielseries.core.api.event;

import net.endergrid.atom.event.grouped.AtomGroupedEventBus;
import org.bukkit.event.Event;

public interface VoxelEventDirector {
    void call(VoxelEvent event);

    AtomGroupedEventBus<VoxelEvent> voxel();

    AtomGroupedEventBus<Event> spigot();
}
