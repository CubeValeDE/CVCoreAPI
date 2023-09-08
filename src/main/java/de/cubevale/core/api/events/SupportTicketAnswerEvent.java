package de.cubevale.core.api.events;

import de.cubevale.core.api.user.User;
import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.support.Ticket;

public class SupportTicketAnswerEvent extends Event {

    private final Ticket ticket;
    private final User creator;

    public SupportTicketAnswerEvent(Ticket ticket, User creator) {
        this.ticket = ticket;
        this.creator = creator;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public User getCreator() {
        return creator;
    }
}
