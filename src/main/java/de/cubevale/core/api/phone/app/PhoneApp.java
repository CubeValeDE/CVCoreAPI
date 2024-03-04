package de.cubevale.core.api.phone.app;

import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.user.User;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public abstract class PhoneApp {

    private final PhoneAppOptions phoneAppOptions;

    public PhoneApp() {
        this.phoneAppOptions = Objects.requireNonNull(
                getClass().getAnnotation(PhoneAppOptions.class), "PhoneAppOptions annotation is missing!");
    }

    public abstract void onExecute(OnlineUser user);

    public abstract ItemStack getAppIcon();

    public PhoneAppOptions getPhoneAppOptions() {
        return phoneAppOptions;
    }
}
