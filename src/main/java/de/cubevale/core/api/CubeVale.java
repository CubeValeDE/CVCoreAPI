package de.cubevale.core.api;

import de.cubevale.core.api.business.Company;
import de.cubevale.core.api.command.Command;
import de.cubevale.core.api.database.Database;
import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.economy.BankAccountType;
import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.phone.app.PhoneApp;
import de.cubevale.core.api.region.Area;
import de.cubevale.core.api.region.Region;
import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.user.User;
import de.cubevale.core.api.utils.ItemBuilder;
import de.cubevale.core.api.utils.gui.InventoryMenu;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Set;
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

    public static Set<User> getUsers() {
        return core.getUsers();
    }

    public static OnlineUser getOnlineUser(int id) {
        return core.getOnlineUser(id);
    }

    public static OnlineUser getOnlineUser(UUID uuid) {
        return core.getOnlineUser(uuid);
    }

    public static OnlineUser getOnlineUser(String name) {
        return core.getOnlineUser(name);
    }

    public static Set<OnlineUser> getOnlineUsers() {
        return core.getOnlineUsers();
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

    public static Set<Phone> getPhones() {
        return core.getPhones();
    }

    public static void createPhone(User owner) {
        core.createPhone(owner);
    }

    public static List<PhoneApp> getRegisteredApps() {
        return core.getRegisteredApps();
    }

    public static void registerPhoneApp(PhoneApp phoneApp) {
        core.registerPhoneApp(phoneApp);
    }

    public static BankAccount getBankAccount(int id) {
        return core.getBankAccount(id);
    }

    public static BankAccount getBankAccount(User user) {
        return core.getBankAccount(user);
    }

    public static Set<BankAccount> getBankAccounts() {
        return core.getBankAccounts();
    }

    public static void createBankAccount(User owner, BankAccountType accountType) {
        core.createBankAccount(owner, accountType);
    }

    public static void createBankAccount(Company owner) {
        core.createBankAccount(owner);
    }

    public static String getFormattedMoney(double money) {
        return core.getFormattedMoney(money);
    }

    public static Company getCompany(int id) {
        return core.getCompany(id);
    }

    public static void createCompany(String name, User owner) {
        core.createCompany(name, owner);
    }

    public static Region getRegion(int id) {
        return core.getRegion(id);
    }

    public static Region getRegion(Area area) {
        return core.getRegion(area);
    }

    public static Set<Region> getRegions() {
        return core.getRegions();
    }

    public static void createRegion(Area area, User owner) {
        core.createRegion(area, owner);
    }

    public static void deleteRegion(int id) {
        core.deleteRegion(id);
    }

   public static Area getArea(Location minLocation, Location maxLocation) {
        return core.getArea(minLocation, maxLocation);
   }

   public static Set<Area> getRegionAreas() {
        return core.getRegionAreas();
   }

    public static void sendTeamBroadcast(String message) {
        core.sendTeamBroadcast(message);
    }

    public static String getTranslation(String locale, String placeholder) {
        return core.getTranslation(locale, placeholder);
    }

    public static String getTranslation(String locale, String placeholder, List<String> details) {
        return core.getTranslation(locale, placeholder, details);
    }

    public static String getServerDescription() {
        return core.getServerDescription();
    }

    public static void setServerDescription(String description1, String description2) {
        core.setServerDescription(description1, description2);
    }

    public static boolean isMaintenance() {
        return core.isMaintenance();
    }

    public static void setMaintenance(boolean maintenance) {
        core.setMaintenance(maintenance);
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

    public static InventoryMenu createInventoryMenu(int size) {
        return core.createInventoryMenu(size);
    }

    public static InventoryMenu createInventoryMenu(int size, String title) {
        return core.createInventoryMenu(size, title);
    }

    public static InventoryMenu createInventoryMenu(InventoryType inventoryType) {
        return core.createInventoryMenu(inventoryType);
    }

    public static InventoryMenu createInventoryMenu(InventoryType inventoryType, String title) {
        return core.createInventoryMenu(inventoryType, title);
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
