package com.voxelseries.core.api.module;

import com.voxelseries.core.api.VoxelCore;
import com.voxelseries.core.api.module.annotation.VoxelModuleSpec;
import dev.oop778.bindings.type.Bindable;

import java.nio.file.Path;

public interface VoxelModule extends Bindable {
    default void onEnable() {}

    default void onDisable() {}

    default Path getConfigDirectory() {
        return VoxelCore.get().getDirectory().resolve("config").resolve(this.getClass().getAnnotation(VoxelModuleSpec.class).name().toLowerCase());
    }
}
