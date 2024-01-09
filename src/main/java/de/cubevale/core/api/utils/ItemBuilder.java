package de.cubevale.core.api.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ItemBuilder {

    ItemBuilder amount(int amount);

    ItemBuilder enchant(Enchantment enchantment, int level);

    ItemBuilder unEnchant(Enchantment enchantment);

    ItemBuilder damage(int damage);

    ItemBuilder type(Material type);

    ItemBuilder name(String displayName);

    ItemBuilder lore(List<String> lore);

    ItemBuilder addLore(String line);

    ItemBuilder unbreakable(boolean unbreakable);

    ItemBuilder customModelData(Integer customModelData);

    ItemStack build();
}
