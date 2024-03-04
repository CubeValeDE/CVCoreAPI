package de.cubevale.core.api.events;

import de.cubevale.core.api.user.OnlineUser;

public class BlockBreakEvent {

    private final OnlineUser user;
    private boolean cancelled;

    public BlockBreakEvent(OnlineUser user) {
        this.user = user;
    }

    public OnlineUser getUser() {
        return user;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
