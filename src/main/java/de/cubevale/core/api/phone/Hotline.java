package de.cubevale.core.api.phone;

import de.cubevale.core.api.phone.app.Call;

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
     */
    void setNumber(String number);

    /**
     * Get the online phones linked to the hotline
     * @return
     */
    List<Phone> getAvailablePhones();

    /**
     * Link a phone to the hotline
     * @param phone
     */
    void addPhone(Phone phone);

    /**
     * Unlink a phone from the hotline
     * @param phone
     */
    void removePhone(Phone phone);

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
}
