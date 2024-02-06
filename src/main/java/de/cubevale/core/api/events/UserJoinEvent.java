package de.cubevale.core.api.events;

import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.event.Event;

public class UserJoinEvent extends Event {

    private final OnlineUser user;

    public UserJoinEvent(OnlineUser user) {
        this.user = user;
    }

    public OnlineUser getUser() {
        return user;
    }
}
