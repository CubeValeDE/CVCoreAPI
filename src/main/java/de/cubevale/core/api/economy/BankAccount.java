package de.cubevale.core.api.economy;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface BankAccount {

    /**
     * Get the account id
     * @return id as integer
     */
    int getId();

    /**
     * Get the account type
     * @return bankAccountType enum
     */
    BankAccountType getType();

    /**
     * Set the account type
     * @param accountType bankAccountType enum
     * @return
     */
    @CheckReturnValue
    default BankAccount setType(BankAccountType accountType) {
        return this;
    }

    /**
     * Get the account iban
     * @return iban as string
     */
    String getIban();

    /**
     * Set the account iban
     * @param iban iban as string
     * @return
     */
    @CheckReturnValue
    default BankAccount setIban(String iban) {
        return this;
    }

    /**
     * Get the user account owner
     * @return account owner as user instance
     */
    User getOwner();

    /**
     * Set the user account owner
     * @param owner owner as user instance
     */
    @CheckReturnValue
    default BankAccount setOwner(User owner) {
        return this;
    }

    /**
     * Get the account balance
     * @return balance as double
     */
    Double getBalance();

    /**
     * Set the account balance
     * @param balance account balance as double
     */
    @CheckReturnValue
    default BankAccount setBalance(Double balance) {
        return this;
    }

    /**
     * Get the time the account was created
     * @return creation time as long millis
     */
    long getCreationTime();

    /**
     * Check if the bank account is blocked
     * @return block status as boolean
     */
    boolean isBlocked();

    /**
     * Set the blocking status of the bank account
     * @param blocked as boolean
     * @return
     */
    @CheckReturnValue
    default BankAccount setBlocked(boolean blocked) {
        return this;
    }

    /**
     * Get all account users who have access to the account
     * @return
     */
    List<AccountUser> getAccountUsers();

    /**
     * Add an account user to accessing the account
     * @param accountUser account user instance
     * @return
     */
    @CheckReturnValue
    default BankAccount addAccountUser(AccountUser accountUser) {
        return this;
    }

    /**
     * Remove an account user from accessing the account
     * @param accountUser account user instance
     * @return
     */
    @CheckReturnValue
    default BankAccount removeAccountUser(AccountUser accountUser) {
        return this;
    }

    /**
     * Transfer money to another account
     * @param target bank account instance
     * @param amount amount as double
     * @param reason reason as string
     * @return
     */
    @CheckReturnValue
    default BankAccount transfer(BankAccount target, Double amount, String reason) {
        return this;
    }

    /**
     * Transfer money to another account by account user
     * @param target bank account instance
     * @param amount amount as double
     * @param reason reason as string
     * @param accountUser account user instance
     * @return
     */
    @CheckReturnValue
    default BankAccount transfer(BankAccount target, Double amount, String reason, AccountUser accountUser) {
        return this;
    }

    /**
     * Reload the bank account data and replace the current bank account-object
     * @return
     */
    default BankAccount refresh() {
        return this;
    }

    void update();
}
