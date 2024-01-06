package de.cubevale.core.api.economy;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;

public interface BankAccount {

    /**
     * Get the account id
     * @return
     */
    int getId();

    /**
     * Get the account type
     * @return
     */
    BankAccountType getType();

    /**
     * Set the account type
     * @param type
     * @return
     */
    @CheckReturnValue
    default BankAccount setType(BankAccountType type) {
        return this;
    }

    /**
     * Get the account iban
     * @return
     */
    String getIban();

    /**
     * Set the account iban
     * @param iban
     */
    @CheckReturnValue
    default BankAccount setIban(String iban) {
        return this;
    }

    /**
     * Get the user account owner
     * @return
     */
    User getOwner();

    /**
     * Set the user account owner
     * @param user
     */
    @CheckReturnValue
    default BankAccount setOwner(User user) {
        return this;
    }

    /**
     * Get the account balance
     * @return
     */
    Double getBalance();

    /**
     * Set the account balance
     * @param amount
     */
    @CheckReturnValue
    default BankAccount setBalance(Double amount) {
        return this;
    }

    /**
     * Get the time the account was created
     * @return
     */
    long getCreationTime();

    /**
     * Check if the bank account is blocked
     * @return
     */
    boolean isBlocked();

    /**
     * Set the blocking status of the bank account
     * @param blocked
     * @return
     */
    @CheckReturnValue
    default BankAccount setBlocked(boolean blocked) {
        return this;
    }

    /**
     * Transfer money to another account
     * @param target
     * @param amount
     * @param reason
     * @return
     */
    @CheckReturnValue
    default BankAccount transfer(BankAccount target, Double amount, String reason) {
        return this;
    }

    void update();
}
