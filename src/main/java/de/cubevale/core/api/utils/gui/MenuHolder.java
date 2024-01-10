package de.cubevale.core.api.utils.gui;

import de.cubevale.core.api.Core;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.HashMap;
import java.util.Map;

public abstract class MenuHolder implements InventoryHolder {

    private final Inventory inventory;
    private final Map<Integer, ItemButton> buttons;

    public MenuHolder(Core core, int size) {
        this.inventory = core.getPluginInstance().getServer().createInventory(this, size);
        this.buttons = new HashMap<>();
    }

    public MenuHolder(Core core, int size, String title) {
        this.inventory = core.getPluginInstance().getServer().createInventory(this, size, title);
        this.buttons = new HashMap<>();
    }

    public MenuHolder(Core core, InventoryType inventoryType) {
        this.inventory = core.getPluginInstance().getServer().createInventory(this, inventoryType);
        this.buttons = new HashMap<>();
    }

    public MenuHolder(Core core, InventoryType inventoryType, String title) {
        this.inventory = core.getPluginInstance().getServer().createInventory(this, inventoryType, title);
        this.buttons = new HashMap<>();
    }

    public void onClick(InventoryClickEvent event) {
        if (!buttons.containsKey(event.getRawSlot())) return;

        buttons.get(event.getRawSlot()).onClick(event);
    }

    public void setButton(int slot, ItemButton button) {
        if (button == null) return;

        this.buttons.put(slot, button);
        this.inventory.setItem(slot, button.getItemStack());
    }

    public ItemButton getButton(int slot) {
        if (!buttons.containsKey(slot)) return null;

        return buttons.get(slot);
    }

    public void unsetButton(int slot) {
        if (!buttons.containsKey(slot)) return;
        this.buttons.remove(slot);
        this.inventory.setItem(slot, null);
    }

    public void clearButtons() {
        if (buttons.isEmpty()) return;

        this.buttons.clear();
    }

    public Inventory getInventory() {
        return inventory;
    }
}
