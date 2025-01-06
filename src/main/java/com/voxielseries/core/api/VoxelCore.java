package com.voxielseries.core.api;

import com.voxielseries.core.api.event.VoxelEventBus;
import com.voxielseries.core.api.player.IdentityContextPlayerManager;
import lombok.NonNull;

public interface VoxelCore {
    IdentityContextPlayerManager playerManager();

    VoxelEventBus eventBus();

    static VoxelCore get() {
        return Instance.INSTANCE;
    }

    class Instance {
        protected static VoxelCore INSTANCE;

        protected static synchronized void setInstance(@NonNull VoxelCore core) {
            if (INSTANCE != null) {
                throw new IllegalStateException("VoxelCore already initialized");
            }

            INSTANCE = core;
        }
    }
}
