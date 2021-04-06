package ro.ase.acs.cts.assignment2.refactor.services.bankservice;

import ro.ase.acs.cts.assignment2.refactor.models.Account;
import ro.ase.acs.cts.assignment2.refactor.models.Loan;

import java.util.List;

public class BankStrategy2021 implements BankStrategy {

    @Override
    public double computeAccountsTotalFees(List<Account> accounts) {
        if(accounts.size() == 0) {
            throw new IllegalArgumentException("At least one account is required");
        }

        double accountsTotalFees = 0.0;

        for (int i = 0; i < accounts.size(); i++) {
               double loanValue = accounts.get(i).getLoan().getLoanValue();
               double loanRate = accounts.get(i).getLoan().getRate();

            accountsTotalFees += accounts.get(i).getAccountType()
                    .computeInterestPrincipal(loanValue,loanRate,accounts.get(i).getDaysSinceOpened());
        }

        return Math.floor(accountsTotalFees * 1000)/1000;
    }


}
