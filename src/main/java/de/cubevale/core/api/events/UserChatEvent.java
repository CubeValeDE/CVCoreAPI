package de.cubevale.core.api.events;

import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.event.Event;

public class UserChatEvent extends Event {

    private final OnlineUser user;
    private String format;
    private String message;
    private boolean cancelled;

    public UserChatEvent(OnlineUser user, String format, String message) {
        this.user = user;
        this.format = format;
        this.message = message;
    }

    public OnlineUser getUser() {
        return user;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
