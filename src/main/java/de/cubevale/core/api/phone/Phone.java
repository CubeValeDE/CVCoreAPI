package de.cubevale.core.api.phone;

import de.cubevale.core.api.User;

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
    void setNumber(String number);

    /**
     * Get the phone owner
     * @return
     */
    User getOwner();

    /**
     * Activate the phone
     */
    void activate();

    /**
     * Deactivate the phone
     */
    void deactivate();

    /**
     * Check if the phone is activated
     * @return
     */
    boolean isActivated();

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
}
