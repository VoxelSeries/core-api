package com.voxielseries.core.api.player;

import com.voxielseries.core.api.context.IdentityContextKeyProvider;
import com.voxielseries.core.api.variable.Variables;
import lombok.NonNull;
import org.bukkit.entity.Player;

public interface IdentityContextPlayerManager {
    IdentityContextKeyProvider keyProvider();

    Variables<IdentityContextPlayer> variables();

    @NonNull
    IdentityContextPlayer get(Player target);
}
