package com.voxielseries.core.api.event.player;

import com.voxielseries.core.api.player.IdentityContextPlayer;
import org.bukkit.entity.Player;

public record PlayerContextCreatedEvent(Player player, IdentityContextPlayer context) implements OnlinePlayerEvent {
}
