package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTranserException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsException;

public abstract class Account {

    public abstract double getBalance();
    public abstract void deposit(double amount);
    public abstract void transfer(double amount, Account destination) throws InsufficientFundsException, IllegalTranserException;
    public abstract void withdraw(double amount) throws InsufficientFundsException;

}
