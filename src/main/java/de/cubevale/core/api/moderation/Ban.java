package de.cubevale.core.api.moderation;

import de.cubevale.core.api.User;

public interface Ban {

    int getId();

    boolean isActive();

    void setActive(boolean active);

    User getUser();

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

    long getCreationTime();

    void setCreationTime(long time);

    long getUntilTime();

    void setUntilTime(long time);
}
