package com.voxelseries.core.api;

import com.voxelseries.core.api.config.VoxelConfigs;
import com.voxelseries.core.api.event.VoxelEventDirector;
import dev.oop778.keyedinstances.api.KeyedRegistry;
import lombok.NonNull;
import net.kyori.adventure.audience.Audience;
import org.incendo.cloud.CommandManager;

import java.nio.file.Path;

public interface VoxelCore {
    static VoxelCore get() {
        return Instance.INSTANCE;
    }

    VoxelEventDirector eventDirector();

    CommandManager<? extends Audience> commandManager();

    Path getDirectory();

    VoxelConfigs configs();

    VoxelObjectFactories objectFactory();

    KeyedRegistry keyedRegistry();

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
