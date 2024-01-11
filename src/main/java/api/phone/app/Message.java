package de.cubevale.core.api.phone.app;

import de.cubevale.core.api.user.User;

public interface Message {

    int getId();

    boolean isRead();

    void setRead(boolean read);

    User getSender();

    User getRecipient();

    String getMessage();
}
