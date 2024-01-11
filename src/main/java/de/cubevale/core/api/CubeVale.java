package de.cubevale.core.api;

import de.cubevale.core.api.business.Company;
import de.cubevale.core.api.command.Command;
import de.cubevale.core.api.database.Database;
import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.economy.BankAccountType;
import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.user.OfflineUser;
import de.cubevale.core.api.user.User;
import de.cubevale.core.api.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class CubeVale {

    private static Core core;

    public CubeVale(Core core) {
        CubeVale.core = core;
    }

    public static User getUser(int id) {
        return core.getUser(id);
    }

    public static User getUser(UUID uuid) {
        return core.getUser(uuid);
    }

    public static User getUser(String name) {
        return core.getUser(name);
    }

    public static OfflineUser getOfflineUser(int id) {
        return core.getOfflineUser(id);
    }

    public static OfflineUser getOfflineUser(UUID uuid) {
        return core.getOfflineUser(uuid);
    }

    public static OfflineUser getOfflineUser(String name) {
        return core.getOfflineUser(name);
    }

    public static Phone getPhone(int id) {
        return core.getPhone(id);
    }

    public static Phone getPhone(String number) {
        return core.getPhone(number);
    }

    public static Phone getPhone(User user) {
        return core.getPhone(user);
    }

    public static BankAccount getBankAccount(int id) {
        return core.getBankAccount(id);
    }

    public static BankAccount getBankAccount(User user) {
        return core.getBankAccount(user);
    }

    public static void createPhone(User owner) {
        core.createPhone(owner);
    }

    public static void createBankAccount(User owner, BankAccountType accountType) {
        core.createBankAccount(owner, accountType);
    }

    public static void createBankAccount(Company owner) {
        core.createBankAccount(owner);
    }

    public static Company getCompany(int id) {
        return core.getCompany(id);
    }

    public static void createCompany(String name, User owner) {
        core.createCompany(name, owner);
    }

    public static ItemBuilder createItem(Material material) {
        return core.createItem(material);
    }

    public static ItemBuilder createItem(ItemStack itemStack) {
        return core.createItem(itemStack);
    }

    public static Inventory createInventory(int size) {
        return core.createInventory(size);
    }

    public static Inventory createInventory(int size, String title) {
        return core.createInventory(size, title);
    }

    public static Inventory createInventory(InventoryType inventoryType) {
        return core.createInventory(inventoryType);
    }

    public static Inventory createInventory(InventoryType inventoryType, String title) {
        return core.createInventory(inventoryType, title);
    }

    public static void registerCommand(Command command) {
        core.registerCommand(command);
    }

    public static void registerListener(EventListener eventListener) {
        core.registerListener(eventListener);
    }

    public static void registerBukkitListener(Listener listener) {
        core.registerBukkitListener(listener);
    }

    public static Database getDatabase() {
        return core.getDatabase();
    }

    public static JavaPlugin getPluginInstance() {
        return core.getPluginInstance();
    }

    public static Core getCore() {
        return core.getCore();
    }
}
