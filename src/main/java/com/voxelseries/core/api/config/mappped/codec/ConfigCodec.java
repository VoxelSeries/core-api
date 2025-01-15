package com.voxelseries.core.api.config.mappped.codec;

import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextRead;
import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextWrite;
import org.spongepowered.configurate.serialize.SerializationException;

public interface ConfigCodec<INPUT> {
    INPUT read(ConfigMappedContextRead context) throws SerializationException;

    void write(ConfigMappedContextWrite context) throws SerializationException;
}
