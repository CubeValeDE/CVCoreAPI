package de.cubevale.core.api.utils;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class SkullUtils {

    public static ItemStack getCustomTextureSkull(String value) {

        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD, 1);

        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

        PlayerProfile playerProfile = Bukkit.createProfile(UUID.randomUUID());

        playerProfile.setProperty(new ProfileProperty("textures", value));

        skullMeta.setPlayerProfile(playerProfile);
        itemStack.setItemMeta(skullMeta);

        return itemStack;
    }
}
