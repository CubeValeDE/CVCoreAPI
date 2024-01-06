package de.cubevale.core.api.phone;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;

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
