package de.cubevale.core.api.user;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.region.Region;
import org.bukkit.OfflinePlayer;

import javax.annotation.CheckReturnValue;
import java.util.List;
import java.util.UUID;

public interface User {

    /**
     * Get the user id
     * @return user id as integer
     */
    int getId();

    /**
     * Get the player uuid
     * @return player uuid
     */
    UUID getUuid();

    /**
     * Get the username
     * @return player name as string
     */
    String getName();

    /**
     * Get the online user with the same user data
     * @return
     */
    OnlineUser getOnlineUser();

    OfflinePlayer getOfflinePlayer();

    /**
     * Check if the user is online
     * @return online status
     */
    boolean isOnline();

    /**
     * Get the user's locale
     * @return locale as string
     */
    String getLocale();

    /**
     * Set the user's locale
     * @param locale locale as string
     * @return
     */
    @CheckReturnValue
    default User setLocale(String locale) {
        return this;
    }

    /**
     * Get the number of server logins
     * @return logins as integer
     */
    int getLogins();

    /**
     * Set the number of server logins
     * @param logins logins as long
     * @return
     */
    @CheckReturnValue
    default User setLogins(int logins) {
        return this;
    }

    /**
     * Get the first login timestamp
     * @return first login as long millis
     */
    long getFirstLogin();

    /**
     * Get the last logout timestamp
     * @return last logout as long millis
     */
    long getLastLogout();

    /**
     * Set the last logout timestamp
     * @param lastLogout time as long millis
     * @return
     */
    @CheckReturnValue
    default User setLastLogout(long lastLogout) {
        return this;
    }

    /**
     * Get the experience points of the user
     * @return experience points as integer
     */
    int getExperience();

    /**
     * Set the experience points of the user
     * @param points experience points as integer
     * @return
     */
    @CheckReturnValue
    default User setExperience(int points) {
        return this;
    }

    /**
     * Check if the user has a specific permission
     * @param permission permission name as string
     * @return
     */
    boolean hasPermission(String permission);

    /**
     * Add a specific permission to the user
     * @param permission permission name as string
     */
    @CheckReturnValue
    default User setPermission(String permission) {
        return this;
    }

    /**
     * Remove a specific permission from the user
     * @param permission permission name as string
     */
    @CheckReturnValue
    default User removePermission(String permission) {
        return this;
    }

    /**
     * Check if the user is in group with name
     * @param groupName group name as string
     * @return
     */
    boolean isInGroup(String groupName);

    /**
     * Check if the user is in group with id
     * @param groupId group id as integer
     * @return
     */
    boolean isInGroup(int groupId);

    /**
     * Add the user to a specific group by group name
     * @param groupName group name as string
     * @return
     */
    @CheckReturnValue
    default User addGroup(String groupName) {
        return this;
    }

    /**
     * Remove the user from a specific group by group name
     * @param groupName group name as string
     * @return
     */
    @CheckReturnValue
    default User removeGroup(String groupName) {
        return this;
    }

    /**
     * Check if the user is banned
     * @return user ban status
     */
    boolean isBanned();

    /**
     * Ban the user from the server
     * @param reason ban reason as string
     * @param untilTime time as long millis
     * @return
     */
    @CheckReturnValue
    default User ban(String reason, long untilTime) {
        return this;
    }

    /**
     * Ban the user from the server by staff member
     * @param reason ban reason as string
     * @param untilTime time as long millis
     * @param staffMember staff member as user
     * @return
     */
    @CheckReturnValue
    default User ban(String reason, long untilTime, User staffMember) {
        return this;
    }

    /**
     * Get the user's phone
     * @return phone instance
     */
    Phone getPhone();

    /**
     * Get the user's primary bank account
     * @return bank account instance
     */
    BankAccount getBankAccount();

    /**
     * Get all available bank accounts
     * @return list of bank account instances
     */
    List<BankAccount> getAvailableBankAccounts();

    /**
     * Get all regions from the user
     * @return list of region instances
     */
    List<Region> getRegions();

    /**
     * Reload the user data and replace the current user-object
     * @return
     */
    default User refresh() {
        return this;
    }

    void update();
}
