package de.cubevale.core.api.user;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.region.Region;
import de.cubevale.core.api.enums.MessageType;
import org.bukkit.Location;

import javax.annotation.CheckReturnValue;
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
     * Get the number of server logins
     * @return
     */
    int getLogins();

    /**
     * Set the number of server logins
     * @param logins
     */
    @CheckReturnValue
    default User setLogins(int logins) {
        return this;
    }

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
    @CheckReturnValue
    default User setLastLogout(long time) {
     return this;
    }

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
     * Check if the user is online
     * @return
     */
    boolean isOnline();

    /**
     * Get the experience points of the user
     * @return
     */

    int getExperience();

    /**
     * Set the experience points of the user
     * @param points
     */
    @CheckReturnValue
    default User setExperience(int points) {
        return this;
    }

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
    @CheckReturnValue
    default User setPermission(String permission) {
        return this;
    }

    /**
     * Remove a specific permission from the user
     * @param permission
     */
    @CheckReturnValue
    default User removePermission(String permission) {
        return this;
    }

    /**
     * Check if the user is banned
     * @return
     */
    @CheckReturnValue
    boolean isBanned();

    /**
     * Ban the user from the server
     * @param reason
     * @param until
     * @return
     */
    @CheckReturnValue
    default User createBan(String reason, long until) {
        return this;
    }

    /**
     * Kick the user from the server
     * @param reason
     */
    void kick(String reason);

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
    @CheckReturnValue
    default User setCash(Double amount) {
        return this;
    }

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

    UUID getChatInputId();

    @CheckReturnValue
    default User createChatInputId() {
        return this;
    }

    void update();
}
