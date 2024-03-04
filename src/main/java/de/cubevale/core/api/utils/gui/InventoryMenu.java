package de.cubevale.core.api.utils.gui;

import org.bukkit.inventory.Inventory;

public interface InventoryMenu {

    Inventory getInventory();

    default boolean onClick() {
        return true;
    }

    ItemButton getButton(int slot);

    void setButton(int slot, ItemButton button);

    void unsetButton(int slot);

    void clearButtons();
}
