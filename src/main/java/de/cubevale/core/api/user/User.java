package de.cubevale.core.api.user;

import de.cubevale.core.api.enums.MessageType;
import org.bukkit.Location;

import javax.annotation.CheckReturnValue;
import java.util.UUID;

public interface User extends OfflineUser {

    /**
     * Get the location of the user
     * @return player's current location
     */
    Location getLocation();

    /**
     * Teleport user to another user
     * @param target user
     */
    void teleport(User target);

    /**
     * Teleport user to a location
     * @param location target
     */
    void teleport(Location location);

    /**
     * Send a message to the user
     * @param messageType as message type enum
     * @param message as string
     */
    void sendMessage(MessageType messageType, String message);

    /**
     * Send an action bar message to the user
     * @param messageType as message type enum
     * @param message as string
     */
    void sendActionBar(MessageType messageType, String message);

    /**
     * Kick the user from the server
     * @param reason as string
     */
    void kick(String reason);

    /**
     * Kick the user from the server by staff member
     * @param reason as string
     * @param staffMember as user instance
     */
    void kick(String reason, User staffMember);

    UUID getChatInputId();

    @CheckReturnValue
    default User createChatInputId() {
        return this;
    }
}
