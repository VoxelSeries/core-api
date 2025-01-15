package com.voxelseries.core.api.config;

import lombok.NonNull;
import org.spongepowered.configurate.reference.ConfigurationReference;

import java.nio.file.Path;

public interface VoxelConfigProvider {
    Path getDirectory();

    ConfigurationReference<?> raw(@NonNull String path);

    ConfigurationReference<?> raw(@NonNull Path path);

    <T extends ConfigElement> ConfigReference<T> getOrLoad(Class<T> clazz);

    void reload();

    void onPreReload(Runnable preReload);

    void onPostReload(Runnable postReload);
}
