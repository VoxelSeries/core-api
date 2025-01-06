package com.voxielseries.core.api;

import com.voxielseries.core.api.context.IdentityContextKey;
import com.voxielseries.core.api.eval.EvalContext;

public final class CoreIdentityContextKeys {
    public static IdentityContextKey<EvalContext> PLAYER_EVAL_CONTEXT = VoxelCore.get().playerManager()
            .keyProvider()
            .get("eval_context");
}
