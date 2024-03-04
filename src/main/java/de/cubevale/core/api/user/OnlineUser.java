package de.cubevale.core.api.user;

import de.cubevale.core.api.enums.MessageType;
import de.cubevale.core.api.utils.gui.ChatMenu;
import de.cubevale.core.api.utils.gui.InventoryMenu;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import javax.annotation.CheckReturnValue;
import java.util.List;
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
    void teleport(OnlineUser targetUser);

    /**
     * Teleport user to a location
     * @param location target location
     */
    void teleport(Location location);

    /**
     * Open an inventory for the user
     * @param inventory bukkit inventory
     */
    void openInventory(Inventory inventory);

    /**
     * Close the user's open inventory
     */
    void closeInventory();

    /**
     * Open an inventory menu for the user
     * @param inventoryMenu
     */
    void openInventoryMenu(InventoryMenu inventoryMenu);

    /**
     * Send a standard message without message type to the user
     * @param message message as string
     */
    void sendMessage(String message);

    /**
     * Send a message to the user
     * @param messageType message type enum
     * @param message message or placeholder as string
     */
    void sendMessage(MessageType messageType, String message);

    /**
     * Send a message to the user with details to replace the placeholder variable
     * @param messageType message type enum
     * @param placeholder placeholder as string
     * @param details details as string list
     */
    void sendMessage(MessageType messageType, String placeholder, List<String> details);

    /**
     * Send a standard action bar message without message type to the user
     * @param message message as string
     */
    void sendActionBar(String message);

    /**
     * Send an action bar message to the user
     * @param messageType message type enum
     * @param message message as string
     */
    void sendActionBar(MessageType messageType, String message);

    /**
     * Send a chat menu to the user
     * @param chatMenu
     */
    void sendChatMenu(ChatMenu chatMenu);

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
