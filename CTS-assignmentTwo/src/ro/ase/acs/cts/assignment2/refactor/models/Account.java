package ro.ase.acs.cts.assignment2.refactor.models;

public class Account {

    private int daysSinceOpened;
    private EAccountType accountType;
    private Loan loan;

    public Account(int daysSinceOpened, EAccountType accountType, Loan loan) {
        this.daysSinceOpened = daysSinceOpened;
        this.accountType = accountType;
        this.loan = loan;
    }

    @Override
    public String toString() {
        //TODO Implement to string
        return super.toString();
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
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
}
