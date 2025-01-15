package com.voxelseries.core.api.config;

import com.voxelseries.core.api.config.mappped.codec.ConfigCodecRegistry;
import com.voxelseries.core.api.config.mappped.type.ConfigTypeResolverRegistry;
import org.spongepowered.configurate.loader.AbstractConfigurationLoader;

public interface VoxelConfigs {
    ConfigCodecRegistry codecRegistry();

    ConfigTypeResolverRegistry typeResolverRegistry();

    VoxelConfigProvider providerFor(Class<?> clazz);

    AbstractConfigurationLoader.Builder<?, ?> createLoader();
}
