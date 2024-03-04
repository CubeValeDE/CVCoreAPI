package de.cubevale.core.api;

import de.cubevale.core.api.business.Company;
import de.cubevale.core.api.database.Database;
import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.economy.BankAccountType;
import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.command.Command;
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

public interface Core {

    User getUser(int id);

    User getUser(UUID uuid);

    User getUser(String name);

    Set<User> getUsers();

    OnlineUser getOnlineUser(int id);

    OnlineUser getOnlineUser(UUID uuid);

    OnlineUser getOnlineUser(String name);

    Set<OnlineUser> getOnlineUsers();

    Phone getPhone(int id);

    Phone getPhone(String number);

    Phone getPhone(User user);

    Set<Phone> getPhones();

    void createPhone(User owner);

    List<PhoneApp> getRegisteredApps();

    void registerPhoneApp(PhoneApp phoneApp);

    BankAccount getBankAccount(int id);

    BankAccount getBankAccount(User user);

    Set<BankAccount> getBankAccounts();

    void createBankAccount(User owner, BankAccountType accountType);

    void createBankAccount(Company owner);

    String getFormattedMoney(double money);

    Company getCompany(int id);

    void createCompany(String name, User owner);

    Region getRegion(int id);

    Region getRegion(Area area);

    Set<Region> getRegions();

    void createRegion(Area area, User owner);

    void deleteRegion(int id);

    Area getArea(Location minLocation, Location maxLocation);

    Set<Area> getRegionAreas();

    void sendTeamBroadcast(String message);

    String getTranslation(String locale, String placeholder);

    String getTranslation(String locale, String placeholder, List<String> details);

    String getServerDescription();

    void setServerDescription(String description1, String description2);

    boolean isMaintenance();

    void setMaintenance(boolean maintenance);

    ItemBuilder createItem(Material material);

    ItemBuilder createItem(ItemStack itemStack);

    Inventory createInventory(int size);

    Inventory createInventory(int size, String title);

    Inventory createInventory(InventoryType inventoryType);

    Inventory createInventory(InventoryType inventoryType, String title);

    InventoryMenu createInventoryMenu(int size);

    InventoryMenu createInventoryMenu(int size, String title);

    InventoryMenu createInventoryMenu(InventoryType inventoryType);

    InventoryMenu createInventoryMenu(InventoryType inventoryType, String title);

    void registerCommand(Command command);

    void registerListener(EventListener eventListener);

    void registerBukkitListener(Listener listener);

    Database getDatabase();

    JavaPlugin getPluginInstance();

    Core getCore();
}
