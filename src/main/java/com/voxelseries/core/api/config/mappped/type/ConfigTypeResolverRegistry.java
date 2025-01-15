package com.voxelseries.core.api.config.mappped.type;

import com.voxelseries.core.api.config.mappped.context.ConfigMappedContextRead;
import net.endergrid.atom.typetoken.TypeToken;

public interface ConfigTypeResolverRegistry {
    TypeToken<?> resolve(ConfigMappedContextRead context);

    void register(ConfigTypeResolver resolver);
}
