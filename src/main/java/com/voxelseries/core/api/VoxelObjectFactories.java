package com.voxelseries.core.api;

import com.voxelseries.core.api.message.VoxelMessageBuilderFactory;
import dev.oop778.blixx.api.replacer.immutable.Replacer;

public interface VoxelObjectFactories {
    Replacer createNumberReplacer(String name, Number number);

    VoxelMessageBuilderFactory message();
}
