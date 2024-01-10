package de.cubevale.core.api.utils.gui;

import org.bukkit.inventory.ItemStack;

public class ItemButton implements MenuButton {

    private ItemStack itemStack;

    public ItemButton(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}
