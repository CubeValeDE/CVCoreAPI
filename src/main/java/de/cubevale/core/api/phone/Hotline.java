package de.cubevale.core.api.phone;

import de.cubevale.core.api.phone.app.Call;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface Hotline {

    /**
     * Get the hotline id
     * @return
     */
    int getId();

    /**
     * Get the hotline number
     * @return
     */
    String getNumber();

    /**
     * Set the hotline number
     * @param number
     * @return
     */
    @CheckReturnValue
    default Hotline setNumber(String number) {
        return this;
    }

    /**
     * Get the online phones linked to the hotline
     * @return
     */
    List<Phone> getAvailablePhones();

    /**
     * Link a phone to the hotline
     * @param phone
     * @return
     */
    @CheckReturnValue
    default Hotline addPhone(Phone phone) {
        return this;
    }

    /**
     * Unlink a phone from the hotline
     * @param phone
     * @return
     */
    @CheckReturnValue
    default Hotline removePhone(Phone phone) {
        return this;
    }

    /**
     * Get the hotline's incoming call
     * @return
     */
    Call getCall();

    /**
     * Set the hotline's incoming call
     * @param call
     */
    void setCall(Call call);

    /**
     * Reload the hotline data and replace the current hotline-object
     * @return
     */
    default Hotline refresh() {
        return this;
    }

    void update();
}
