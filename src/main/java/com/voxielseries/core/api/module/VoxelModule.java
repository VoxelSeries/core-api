package com.voxielseries.core.api.module;

import dev.oop778.bindings.type.Bindable;

public interface VoxelModule extends Bindable {
    default void onEnable() {}

    default void onDisable() {}
}
