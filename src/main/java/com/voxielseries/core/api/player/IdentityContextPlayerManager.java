package com.voxielseries.core.api.player;

import com.voxielseries.core.api.context.IdentityContextKeyProvider;
import lombok.NonNull;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface IdentityContextPlayerManager {
    IdentityContextKeyProvider keyProvider();

    @NonNull
    IdentityContextPlayer get(Player target);

    @Nullable
    IdentityContextPlayer get(UUID target);
}
