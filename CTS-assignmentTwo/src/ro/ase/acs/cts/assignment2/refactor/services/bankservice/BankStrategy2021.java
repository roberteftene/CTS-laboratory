package ro.ase.acs.cts.assignment2.refactor.services.bankservice;

import ro.ase.acs.cts.assignment2.refactor.models.Account;
import ro.ase.acs.cts.assignment2.refactor.models.EAccountType;
import ro.ase.acs.cts.assignment2.refactor.models.Loan;

import java.util.List;

public class BankStrategy2021 implements BankStrategy {

    public static final int INTEREST_PERIOD = 365;
    public static final double BROKER_FEE = 0.0125;

    @Override
    public double computeLoanTax(List<Account> accounts) {
        if(accounts.size() == 0) {
            throw new IllegalArgumentException("At least one account is required");
        }

        double accountsTotalTax = 0.0;

        for (int i = 0; i < accounts.size(); i++) {
            Loan loan = accounts.get(i).getLoan();
            accountsTotalTax += BROKER_FEE *
                    accounts.get(i).getAccountType().computeInterestPrincipal(
                    loan.getLoanValue(),loan.getRate(),accounts.get(i).getDaysSinceOpened());
        }
        return accountsTotalTax;
    }


}
