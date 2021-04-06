package ro.ase.acs.cts.assignment2.refactor.models;

import ro.ase.acs.cts.assignment2.refactor.services.bankservice.RateService;

public class Loan implements RateService {
    private double loanValue;
    private double rate;

    public Loan() {
        loanValue = 0.0;
        rate = 0.0;
    }

    public Loan(double loanValue, double rate) {
        if(loanValue < 0) {
            throw new IllegalArgumentException("Loan value must pe positive");
        }
        if(rate < 0 || rate >= 1) {
            throw new IllegalArgumentException("Invalid value for the rate");
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

    @Override
    public String toString() {
        return "Value: " + this.loanValue + " Rate: "  + this.rate + " }";
    }

    @Override
    public double getMonthlyRate() {
        return this.rate * this.loanValue;
    }
}
