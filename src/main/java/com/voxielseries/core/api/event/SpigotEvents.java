package com.voxielseries.core.api.event;

import net.endergrid.atom.event.AtomEventObjectFactory;
import net.endergrid.atom.event.group.AtomEventGroup;
import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.world.WorldEvent;

public interface SpigotEvents {
    AtomEventGroup<Event> ROOT = AtomEventObjectFactory.get().createEventGroup(Event.class);
    AtomEventGroup<EntityEvent> ENTITY = ROOT.subGroup(EntityEvent.class);
    AtomEventGroup<PlayerEvent> PLAYER = ROOT.subGroup(PlayerEvent.class);
    AtomEventGroup<WorldEvent> WORLD = ROOT.subGroup(WorldEvent.class);
    AtomEventGroup<InventoryEvent> INVENTORY = ROOT.subGroup(InventoryEvent.class);
}
