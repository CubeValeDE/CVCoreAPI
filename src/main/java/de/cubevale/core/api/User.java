package de.cubevale.core.api;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.moderation.Ban;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.region.Region;
import de.cubevale.core.api.enums.MessageType;
import org.bukkit.Location;

import java.util.List;
import java.util.UUID;

public interface User {

    /**
     * Get the user id
     * @return
     */
    int getId();

    /**
     * Get the user uuid
     * @return
     */
    UUID getUuid();

    /**
     * Get the username
     * @return
     */
    String getName();

    /**
     * Get the first login timestamp
     * @return
     */
    long getFirstLogin();

    /**
     * Get the last logout timestamp
     * @return
     */
    long getLastLogout();

    /**
     * Set the last logout timestamp
     * @param time
     */
    void setLastLogout(long time);

    /**
     * Get the location of the user
     * @return
     */
    Location getLocation();

    /**
     * Teleport user to another user
     * @param target
     */
    void teleport(User target);

    /**
     * Teleport user to a location
     * @param location
     */
    void teleport(Location location);

    /**
     * Send a message to the user
     * @param message
     */
    void sendMessage(MessageType messageType, String message);

    /**
     * Send an action bar message to the user
     * @param message
     */
    void sendActionBar(MessageType messageType, String message);

    /**
     * Get the experience points of the user
     * @return
     */
    int getExperience();

    /**
     * Set the experience points of the user
     * @param points
     */
    void setExperience(int points);

    /**
     * Add experience points to the user
     * @param points
     */
    void addExperience(int points);

    /**
     * Remove experience points from the user
     * @param points
     */
    void removeExperience(int points);

    boolean hasPermission(String permission);

    void addPermission(String permission);

    void removePermission(String permission);

    boolean isBanned();

    boolean createBan(String reason, User staff, long until);

    boolean disableBan(User staff);

    boolean deleteBan(int banId);

    Ban getActiveBan();

    void setActiveBan(Ban ban);

    List<Ban> getBans();

    void kick(String reason, User staff);

    /**
     * Get the user's phone
     * @return
     */
    Phone getPhone();

    /**
     * Get the user's cash
     * @return
     */
    Double getCash();

    /**
     * Set the user's cash
     */
    void setCash(Double amount);

    /**
     * Get the user's primary bank account
     * @return
     */
    BankAccount getBankAccount();

    /**
     * Get all available bank accounts
     * @return
     */
    List<BankAccount> getAvailableBankAccounts();

    Region getRegions();
}
