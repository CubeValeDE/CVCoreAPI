package de.cubevale.core.api.events;

import de.cubevale.core.api.User;
import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.moderation.Ban;

public class UserBanEvent extends Event {

    private final Ban ban;
    private final User user;

    public UserBanEvent(Ban ban, User user) {
        this.ban = ban;
        this.user = user;
    }

    public Ban getBan() {
        return ban;
    }

    public User getUser() {
        return user;
    }
}
