package de.cubevale.core.api.phone;

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

    List<Phone> getAvailablePhones();

    void addPhone(Phone phone);

    void removePhone(Phone phone);

    Call getCall();

    void setCall(Call call);
}
