package de.cubevale.core.api.events;

import de.cubevale.core.api.economy.BankAccount;
import de.cubevale.core.api.event.Event;

public class BankAccountTransferEvent extends Event {

    private final BankAccount bankAccount;
    private final BankAccount targetBankAccount;
    private final Double amount;
    private final String reason;
    private boolean cancelled;

    public BankAccountTransferEvent(BankAccount bankAccount, BankAccount targetBankAccount, Double amount, String reason) {
        this.bankAccount = bankAccount;
        this.targetBankAccount = targetBankAccount;
        this.amount = amount;
        this.reason = reason;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public BankAccount getTargetBankAccount() {
        return targetBankAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
