package de.cubevale.core.api.user;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.enums.Group;
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

    /**
     * Check if the user has a specific permission
     * @param permission
     * @return
     */
    boolean hasPermission(String permission);

    /**
     * Add a specific permission to the user
     * @param permission
     */
    void addPermission(String permission);

    /**
     * Remove a specific permission from the user
     * @param permission
     */
    void removePermission(String permission);

    /**
     * Check if is user in group
     * @param group
     * @return
     */
    boolean isInGroup(Group group);

    /**
     * Add a group to the user
     * @param group
     */
    void addGroup(Group group);

    /**
     * Remove a group from the user
     * @param group
     */
    void removeGroup(Group group);

    /**
     * Check if the user is banned
     * @return
     */
    boolean isBanned();

    /**
     * Create a ban for the user
     * @param reason
     * @param staff
     * @param until
     * @return
     */
    boolean createBan(String reason, User staff, long until);

    /**
     * Disable a ban from the user
     * @param staff
     * @return
     */
    boolean disableBan(User staff);

    /**
     * Delete a ban from the user
     * @param banId
     * @return
     */
    boolean deleteBan(int banId);

    /**
     * Get the active user ban
     * @return
     */
    Ban getActiveBan();

    /**
     * Set the active user ban
     * @param ban
     */
    void setActiveBan(Ban ban);

    /**
     * Get all bans from the user
     * @return
     */
    List<Ban> getBans();

    /**
     * Kick the user from the server
     * @param reason
     * @param staff
     */
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

    /**
     * Get all regions from the user
     * @return
     */
    Region getRegions();
}
