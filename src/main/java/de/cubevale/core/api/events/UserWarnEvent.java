package de.cubevale.core.api.events;

import de.cubevale.core.api.user.User;
import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.moderation.Warn;

public class UserWarnEvent extends Event {

    private final Warn warn;
    private final User user;

    public UserWarnEvent(Warn warn, User user) {
        this.warn = warn;
        this.user = user;
    }

    public Warn getWarn() {
        return warn;
    }

    public User getUser() {
        return user;
    }
}
