package de.cubevale.core.api.events;

import de.cubevale.core.api.user.User;
import de.cubevale.core.api.event.Event;

public class UserLoginEvent extends Event {

    private final User user;

    public UserLoginEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
