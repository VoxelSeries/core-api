package com.voxelseries.core.api.config.event;

import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextRead;
import com.voxelseries.core.api.event.VoxelEvent;

public record VoxelConfigObjectReadEvent(Object object, ConfigMappedContextRead context) implements VoxelEvent {
}
