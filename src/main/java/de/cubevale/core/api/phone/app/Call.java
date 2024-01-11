package de.cubevale.core.api.phone.app;

import de.cubevale.core.api.user.User;

public interface Call {

    /**
     * Get the caller
     * @return
     */
    User getCaller();

    /**
     * Get the partner
     * @return
     */
    User getPartner();

    /**
     * Check if the call is active
     * @return
     */
    boolean isActive();

    /**
     * Set the active status of the call
     * @param active
     */
    void setActive(boolean active);

    /**
     * Get the duration of the call
     * @return
     */
    int getDuration();

    /**
     * End this call
     */
    void endCall();
}
