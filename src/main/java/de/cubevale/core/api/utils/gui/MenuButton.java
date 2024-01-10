package de.cubevale.core.api.utils.gui;

import org.bukkit.event.inventory.InventoryClickEvent;

public interface MenuButton {

    default void onClick(InventoryClickEvent event) {}
}
