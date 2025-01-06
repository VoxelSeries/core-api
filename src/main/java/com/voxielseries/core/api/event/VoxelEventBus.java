package com.voxielseries.core.api.event;

import com.voxielseries.core.api.event.player.PlayerEvent;
import net.endergrid.atom.event.group.AtomEventGroup;

public interface VoxelEventBus {
    void call(VoxelEvent event);

    AtomEventGroup<PlayerEvent> players();
}
