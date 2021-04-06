package ro.ase.acs.cts.assignment2.refactor.models;

public class Loan {
    private double loanValue;
    private double rate;

    public Loan(double loanValue, double rate) {
        if(loanValue < 0) {
            throw new IllegalArgumentException("Loan value must pe positive");
        }
        if(rate < 0) {
            throw new IllegalArgumentException("Rate must be positive");
        }
        this.loanValue = loanValue;
        this.rate = rate;
    }

    public double getLoanValue() {
        return loanValue;
    }

    public double getRate() {
        return rate;
    }
}
