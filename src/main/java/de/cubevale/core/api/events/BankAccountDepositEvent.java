package de.cubevale.core.api.events;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.event.Event;

public class BankAccountDepositEvent extends Event {

    private final BankAccount bankAccount;

    public BankAccountDepositEvent(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
