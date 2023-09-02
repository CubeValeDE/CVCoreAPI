package de.cubevale.core.api.events;

import de.cubevale.core.api.User;
import de.cubevale.core.api.event.Event;

public class UserQuitEvent extends Event {

    private final User user;

    public UserQuitEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
