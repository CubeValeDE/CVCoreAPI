package de.cubevale.core.api.user;


import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.phone.Phone;
import de.cubevale.core.api.region.Region;

import javax.annotation.CheckReturnValue;
import java.util.List;
import java.util.UUID;

public interface OfflineUser {

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
    default OfflineUser setLogins(int logins) {
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
    default OfflineUser setLastLogout(long time) {
        return this;
    }

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
    default OfflineUser setExperience(int points) {
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
    default OfflineUser setPermission(String permission) {
        return this;
    }

    /**
     * Remove a specific permission from the user
     * @param permission
     */
    @CheckReturnValue
    default OfflineUser removePermission(String permission) {
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
    default OfflineUser ban(String reason, long until) {
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
