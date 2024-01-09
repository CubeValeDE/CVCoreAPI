package de.cubevale.core.api.utils.gui;

import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public abstract class MenuHolder {

    private final Inventory inventory;
    private final Map<Integer, ItemButton> buttons;

    public MenuHolder(Inventory inventory) {
        this.inventory = inventory;
        this.buttons = new HashMap<>();
    }

    public void setButton(int slot, ItemButton button) {
        this.buttons.put(slot, button);
    }

    public ItemButton getButton(int slot) {
        if (slot < 0 || slot >= buttons.size()) return null;

        return buttons.get(slot);
    }

    public void unsetButton(int slot) {
        this.buttons.remove(slot);
    }

    public void clearButtons() {
        this.buttons.clear();
    }

    public Inventory getInventory() {
        return inventory;
    }
}
