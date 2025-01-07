package com.voxielseries.core.api;

import com.voxielseries.core.api.event.VoxelEventDirector;
import com.voxielseries.core.api.player.IdentityContextPlayerManager;
import lombok.NonNull;
import net.kyori.adventure.audience.Audience;
import org.incendo.cloud.CommandManager;

public interface VoxelCore {
    IdentityContextPlayerManager playerManager();

    VoxelEventDirector eventBus();

    CommandManager<Audience> commandManager();

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
