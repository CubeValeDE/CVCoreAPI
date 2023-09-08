package de.cubevale.core.api.moderation;

import de.cubevale.core.api.user.User;

public interface Warn {

    /**
     * Get the warn id
     * @return
     */
    int getId();

    /**
     * Check if the warn is active
     * @return
     */
    boolean isActive();

    /**
     * Set the warn active status
     * @param active
     */
    void setActive(boolean active);

    /**
     * Get the team member who created the warning
     * @return
     */
    User getStaffMember();

    /**
     * Set the team member who created the warning
     * @param user
     */
    void setStaffMember(User user);

    /**
     * Get the reason of the warning
     * @return
     */
    String getReason();

    /**
     * Set the reason of the warning
     * @param reason
     */
    void setReason(String reason);

    /**
     * Get the time when the warning was created
     * @return
     */
    long getCreationTime();

    /**
     * Set the time when the warning was created
     * @param time
     */
    void setCreationTime(long time);
}
