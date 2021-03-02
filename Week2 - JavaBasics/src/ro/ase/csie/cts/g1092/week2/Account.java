package ro.ase.csie.cts.g1092.week2;

public abstract class Account {

    public abstract double getBalance();
    public abstract void deposit(double amount);
    public abstract void transfer(double amount, Account destination);
    public abstract void withdraw(double amount);

}
