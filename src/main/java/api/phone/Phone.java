package de.cubevale.core.api.phone;

import de.cubevale.core.api.phone.app.Call;
import de.cubevale.core.api.phone.app.Message;
import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface Phone {

    /**
     * Get the phone id
     * @return
     */
    int getId();

    /**
     * Get the phone number
     * @return
     */
    String getNumber();

    /**
     * Set the phone number
     * @param number
     */
    @CheckReturnValue
    default Phone setNumber(String number) {
        return this;
    }

    /**
     * Get the phone owner
     * @return
     */
    User getOwner();

    /**
     * Check if the phone is active
     * @return
     */
    boolean isActive();

    /**
     * Set the phone active status
     */
    @CheckReturnValue
    default Phone setActive(boolean active) {
        return this;
    }

    /**
     * Send a message to the phone messenger of this phone
     * @param sender
     * @param message
     * @return
     */
    @CheckReturnValue
    default Phone sendMessage(User sender, String message) {
        return this;
    }

    /**
     * Get a message from phone messenger by message id
     * @param id
     * @return
     */
    Message getMessage(int id);

    /**
     * Update an exists message in phone messenger
     * @param message
     * @return
     */
    @CheckReturnValue
    default Phone setMessage(Message message) {
        return this;
    }

    /**
     * Delete an exists message from the phone messenger
     * @param message
     * @return
     */
    @CheckReturnValue
    default Phone deleteMessage(Message message) {
        return this;
    }

    /**
     * Get all messages of phone messenger
     * @return
     */
    List<Message> getMessages();

    /**
     * Get the running call
     * @return
     */
    Call getCall();

    /**
     * Set a call
     * @param call
     */
    void setCall(Call call);

    /**
     * Start a call
     * @param phone
     */
    boolean call(Phone phone);

    /**
     * End a running call
     * @return
     */
    boolean endCall();

    /**
     * Check if the phone has an ongoing call
     * @return
     */
    boolean isInCall();

    void update();
}