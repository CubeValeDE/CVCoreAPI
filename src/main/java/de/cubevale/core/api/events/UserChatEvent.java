package de.cubevale.core.api.events;

import de.cubevale.core.api.user.User;
import de.cubevale.core.api.event.Event;

public class UserChatEvent extends Event {

    private final User user;
    private String format;
    private String message;
    private boolean canceled;

    public UserChatEvent(User user, String format, String message) {
        this.user = user;
        this.format = format;
        this.message = message;
    }

    public User getUser() {
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

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
