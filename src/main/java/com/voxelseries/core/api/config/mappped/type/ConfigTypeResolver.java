package com.voxelseries.core.api.config.mappped.type;

import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextRead;
import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextWrite;
import net.endergrid.atom.typetoken.TypeToken;
import org.jetbrains.annotations.Nullable;

public interface ConfigTypeResolver {
    @Nullable
    TypeToken<?> resolve(ConfigMappedContextRead context, TypeToken<?> typeToken);

    String serializeType(ConfigMappedContextWrite write);

    boolean accepts(TypeToken<?> typeToken);
}
