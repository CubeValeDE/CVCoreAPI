package de.cubevale.core.api.user;

import de.cubevale.core.api.enums.MessageType;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import javax.annotation.CheckReturnValue;
import java.util.UUID;

public interface OnlineUser extends User {

    User getUser();

    Player getPlayer();

    /**
     * Get the location of the user
     * @return player's current location
     */
    Location getLocation();

    /**
     * Teleport user to another user
     * @param targetUser target user
     */
    void teleport(User targetUser);

    /**
     * Teleport user to a location
     * @param location target location
     */
    void teleport(Location location);

    /**
     * Send a message to the user
     * @param messageType message type enum
     * @param message message as string
     */
    void sendMessage(MessageType messageType, String message);

    /**
     * Send an action bar message to the user
     * @param messageType message type enum
     * @param message message as string
     */
    void sendActionBar(MessageType messageType, String message);

    /**
     * Kick the user from the server
     * @param reason as string
     */
    void kick(String reason);

    /**
     * Kick the user from the server by staff member
     * @param reason kick reason as string
     * @param staffMember staff member as user instance
     */
    void kick(String reason, User staffMember);

    UUID getChatInputId();

    @CheckReturnValue
    default OnlineUser createChatInputId() {
        return this;
    }
}
