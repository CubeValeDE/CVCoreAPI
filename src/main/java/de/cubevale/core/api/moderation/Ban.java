package de.cubevale.core.api.moderation;

import de.cubevale.core.api.User;

public interface Ban {

    /**
     * Get the ban id
     * @return
     */
    int getId();

    /**
     * Check if the ban is active
     * @return
     */
    boolean isActive();

    /**
     * Set the ban active status
     * @param active
     */
    void setActive(boolean active);

    /**
     * Get the banned user
     * @return
     */
    User getUser();

    /**
     * Set the banned user
     * @param user
     */
    void setUser(User user);

    /**
     * Get the reason of the ban
     * @return String reason
     */
    String getReason();

    /**
     * Set the reason for the ban
     * @param  reason
     */
    void setReason(String reason);

    /**
     * Get the team member who created the ban
     * @return User staff
     */
    User getStaff();

    /**
     * Set the team member who created the ban
     * @param user
     */
    void setStaff(User user);

    /**
     * Get the time when the ban was created
     * @return
     */
    long getCreationTime();

    /**
     * Set the time when the ban was created
     * @param time
     */
    void setCreationTime(long time);

    /**
     * Get the time when the ban ends
     * @return
     */
    long getUntilTime();

    /**
     * Set the time when the ban ends
     * @param time
     */
    void setUntilTime(long time);
}
