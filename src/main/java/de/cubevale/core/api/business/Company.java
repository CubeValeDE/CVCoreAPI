package de.cubevale.core.api.business;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;

public interface Company {

    /**
     * Get the company id
     * @return id as integer
     */
    int getId();

    /**
     * Get the company name
     * @return company name as string
     */
    String getName();

    /**
     * Set the company name
     * @param name company name as string
     * @return
     */
    @CheckReturnValue
    Company setName(String name);

    /**
     * Get the owner of the company
     * @return company owner as user instance
     */
    User getOwner();

    /**
     * Set the owner of the company
     * @param user
     * @return
     */
    @CheckReturnValue
    Company setOwner(User user);

    /**
     * Get the primary bank account of the company
     * @return bank account instance
     */
    BankAccount getBankAccount();

    /**
     * Reload the company data and replace the current company-object
     * @return
     */
    default Company refresh() {
        return this;
    }

    void update();
}
