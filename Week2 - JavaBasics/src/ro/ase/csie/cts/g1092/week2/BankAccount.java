package ro.ase.csie.cts.g1092.week2;

public abstract class BankAccount extends Account {

    protected double balance;
    protected final String iban;

    public BankAccount(double initialBalance,String iban) {
        this.balance = initialBalance;
        this.iban = iban;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }


}
