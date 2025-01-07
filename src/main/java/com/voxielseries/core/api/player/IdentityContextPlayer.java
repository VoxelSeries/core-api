package com.voxielseries.core.api.player;

import com.voxielseries.core.api.VoxelCore;
import com.voxielseries.core.api.context.IdentityContext;
import com.voxielseries.core.api.context.IdentityContextKey;
import com.voxielseries.core.api.variable.Variables;
import net.kyori.adventure.audience.ForwardingAudience;
import org.bukkit.entity.Player;

public interface IdentityContextPlayer extends IdentityContext<Player>, ForwardingAudience {
    IdentityContextKey<? extends Variables<IdentityContextPlayer>> VARIABLES = VoxelCore.get().playerManager()
            .keyProvider()
            .get("eval_context");

    static IdentityContextPlayer of(Player player) {
        return VoxelCore.get().playerManager().get(player);
    }
}
