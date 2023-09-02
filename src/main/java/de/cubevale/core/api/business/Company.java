package de.cubevale.core.api.business;

import de.cubevale.core.api.User;

public interface Company {

    /**
     * Get the company id
     * @return
     */
    String getId();

    /**
     * Get the company name
     * @return
     */
    String getName();

    /**
     * Set the company name
     * @param name
     */
    void setName(String name);

    /**
     * Get the owner of the company
     * @return
     */
    User getOwner();

    /**
     * Set the owner of the company
     * @param user
     */
    void setOwner(User user);
}
