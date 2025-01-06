package com.voxielseries.core.api.event.player;

import com.voxielseries.core.api.event.VoxelEvent;

import java.util.UUID;

public interface PlayerEvent extends VoxelEvent {
    UUID uuid();
}
