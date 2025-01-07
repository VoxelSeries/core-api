package com.voxielseries.core.api;

import com.voxielseries.core.api.context.IdentityContextKey;
import com.voxielseries.core.api.variable.Variables;

public final class CoreIdentityContextKeys {
    public static IdentityContextKey<Variables> PLAYER_EVAL_CONTEXT = VoxelCore.get().playerManager()
            .keyProvider()
            .get("eval_context");
}
