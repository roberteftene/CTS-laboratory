package ro.ase.acs.cts.assignment2.refactor.models;

import ro.ase.acs.cts.assignment2.refactor.services.bankservice.RateService;

public class Account implements RateService {

    private int daysSinceOpened;
    private EAccountType accountType;
    private Loan loan;

    private Account(){}

    public Account(int daysSinceOpened, EAccountType accountType, Loan loan) {
        if(daysSinceOpened < 0)
        {
            throw new IllegalArgumentException("Accounts must be opened by at least one day");
        }else {
            this.daysSinceOpened = daysSinceOpened;
        }
        this.accountType = accountType;
        this.setLoan(loan);
    }

    public void setLoan(Loan loan) {
        if(loan == null) {
            this.loan = new Loan();
        } else {
            this.loan = loan;
        }
    }


    public int getDaysSinceOpened() {
        return daysSinceOpened;
    }

    public EAccountType getAccountType() {
        return accountType;
    }

    public Loan getLoan() {
        return loan;
    }

    @Override
    public String toString() {
        return "{ Number of days: " + this.daysSinceOpened + " Account type: " + this.accountType + " Loan: " + this.loan.toString();
    }

    @Override
    public double getMonthlyRate() {
        return this.loan.getMonthlyRate();
    }
}
