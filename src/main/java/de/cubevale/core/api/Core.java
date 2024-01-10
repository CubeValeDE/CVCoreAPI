package de.cubevale.core.api;

import de.cubevale.core.api.business.Company;
import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.economy.BankAccountType;
import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.command.Command;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.user.User;
import de.cubevale.core.api.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public interface Core {

    User getUser(int id);

    User getUser(String name);

    User getUser(UUID uuid);

    Phone getPhone(int id);

    Phone getPhone(String number);

    Phone getPhone(User user);

    BankAccount getBankAccount(int id);

    BankAccount getBankAccount(User user);

    void createPhone(User owner);

    void createBankAccount(User owner, BankAccountType accountType);

    void createBankAccount(Company owner);

    Company getCompany(int id);

    void createCompany(String name, User owner);

    ItemBuilder createItem(Material material);

    ItemBuilder createItem(ItemStack itemStack);

    Inventory createInventory(int size);

    Inventory createInventory(int size, String title);

    Inventory createInventory(InventoryType inventoryType);

    Inventory createInventory(InventoryType inventoryType, String title);

    void registerCommand(Command command);

    void registerListener(EventListener eventListener);

    void registerBukkitListener(Listener listener);

    JavaPlugin getPluginInstance();
}
