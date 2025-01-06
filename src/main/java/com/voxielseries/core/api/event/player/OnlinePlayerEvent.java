package com.voxielseries.core.api.event.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface OnlinePlayerEvent extends PlayerEvent {
    @Override
    default UUID uuid() {
        return this.player().getUniqueId();
    }

    Player player();
}
