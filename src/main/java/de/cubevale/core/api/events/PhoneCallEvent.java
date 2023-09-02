package de.cubevale.core.api.events;

import de.cubevale.core.api.User;
import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.phone.Call;

public class PhoneCallEvent extends Event {

    private final Call call;
    private final User caller;
    private final User partner;

    public PhoneCallEvent(Call call) {
        this.call = call;
        this.caller = call.getCaller();
        this.partner = call.getPartner();
    }

    public Call getCall() {
        return call;
    }

    public User getCaller() {
        return caller;
    }

    public User getPartner() {
        return partner;
    }
}
