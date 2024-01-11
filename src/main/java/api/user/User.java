package de.cubevale.core.api.user;

import de.cubevale.core.api.enums.MessageType;
import org.bukkit.Location;

import javax.annotation.CheckReturnValue;
import java.util.UUID;

public interface User extends OfflineUser {

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

    UUID getChatInputId();

    @CheckReturnValue
    default User createChatInputId() {
        return this;
    }

    void update();
}
