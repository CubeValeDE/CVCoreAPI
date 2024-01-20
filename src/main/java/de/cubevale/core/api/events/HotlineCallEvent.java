package de.cubevale.core.api.events;

import de.cubevale.core.api.event.Event;
import de.cubevale.core.api.phone.app.Call;
import de.cubevale.core.api.phone.Hotline;
import de.cubevale.core.api.phone.Phone;

import java.util.List;

public class HotlineCallEvent extends Event {

    private final Hotline hotline;
    private final Call call;
    private final List<Phone> availablePhones;

    public HotlineCallEvent(Hotline hotline) {
        this.hotline = hotline;
        this.call = hotline.getCall();
        this.availablePhones = hotline.getAvailablePhones();
    }

    public Hotline getHotline() {
        return hotline;
    }

    public Call getCall() {
        return call;
    }

    public List<Phone> getAvailablePhones() {
        return availablePhones;
    }
}
