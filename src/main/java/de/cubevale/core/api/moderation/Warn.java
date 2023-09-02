package de.cubevale.core.api.moderation;

import de.cubevale.core.api.User;

public interface Warn {

    int getId();

    boolean isActive();

    void setActive(boolean active);

    User getStaffMember();

    void setStaffMember(User user);

    String getReason();

    void setReason(String reason);

    long getCreationTime();

    void setCreationTime(long time);
}
