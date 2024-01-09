package de.cubevale.core.api.utils.gui;

import org.bukkit.inventory.ItemStack;

public class ItemButton implements MenuButton {

    private final ItemStack itemStack;

    public ItemButton(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
