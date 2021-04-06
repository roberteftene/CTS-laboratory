package ro.ase.acs.cts.assignment2.refactor.models;

import ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy;
import ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy2021;

public enum EAccountType {
    PREMIUM,
    SUPER_PREMIUM;

    public double computeInterestPrincipal(double loan,double rate, int daysSinceOpening) {
        switch (this) {
            case PREMIUM:
            case SUPER_PREMIUM:
                return loan * (Math.pow(rate,daysSinceOpening/ BankStrategy2021.INTEREST_PERIOD) - 1);
            default:
                throw new UnsupportedOperationException("Account type not defined");
        }
    }

}
