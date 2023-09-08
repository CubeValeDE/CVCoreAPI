package de.cubevale.core.api.economy;

import de.cubevale.core.api.user.User;

public interface BankAccount {

    /**
     * Get the account id
     * @return
     */
    int getId();

    /**
     * Get the account iban
     * @return
     */
    String getIban();

    /**
     * Set the account iban
     * @param iban
     */
    void setIban(String iban);

    /**
     * Get the user account owner
     * @return
     */
    User getOwner();

    /**
     * Set the user account owner
     * @param user
     */
    void setOwner(User user);

    /**
     * Get the account balance
     * @return
     */
    Double getBalance();

    /**
     * Set the account balance
     * @param amount
     */
    void setBalance(Double amount);

    /**
     * Transfer money to another account
     * @param target
     * @param amount
     * @param reason
     * @return
     */
    boolean transfer(BankAccount target, Double amount, String reason);

    /**
     * Withdraw money from bank account
     * @param amount
     * @return
     */
    boolean withdraw(Double amount);

    /**
     * Deposit money into the bank account
     * @param amount
     * @return
     */
    boolean deposit(Double amount);
}
