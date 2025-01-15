package com.voxelseries.core.api.config.mappped.context;

public interface ConfigMappedContextWrite extends ConfigMappedContext {
    <T> T toWrite();
}
