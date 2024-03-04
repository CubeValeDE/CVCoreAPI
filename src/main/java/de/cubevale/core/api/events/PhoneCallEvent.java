package de.cubevale.core.api.events;

import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.phone.app.Call;

public class PhoneCallEvent extends Event {

    private final Call call;
    private final OnlineUser caller;
    private final OnlineUser partner;

    public PhoneCallEvent(Call call) {
        this.call = call;
        this.caller = call.getCaller();
        this.partner = call.getPartner();
    }

    public Call getCall() {
        return call;
    }

    public OnlineUser getCaller() {
        return caller;
    }

    public OnlineUser getPartner() {
        return partner;
    }
}
