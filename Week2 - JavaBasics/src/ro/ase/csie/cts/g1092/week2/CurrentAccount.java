package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTranserException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

    public static final double MAX_CREDIT = 5000;

    public CurrentAccount(String iban) {
        super(CurrentAccount.MAX_CREDIT, iban);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void transfer(double amount, Account destination) throws InsufficientFundsException, IllegalTranserException {
        if(this == destination) {
            throw new IllegalTranserException();
        } else {
        this.withdraw(amount);
        destination.deposit(amount);
        }

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > this.balance) {
            throw new InsufficientFundsException("You dont have the available amount");
        } else {
            this.balance -= amount;
        }
    }
}
