package ro.ase.acs.cts.assignment2.refactor.models;

import static ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy.BROKER_FEE;
import static ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy.INTEREST_PERIOD;

public enum EAccountType {
    PREMIUM,
    SUPER_PREMIUM;

    public double computeInterestPrincipal(double loan,double rate, int daysSinceOpening) {
       double interestValue = 0.0;
        switch (this) {
            case PREMIUM:
            case SUPER_PREMIUM:
                interestValue =  BROKER_FEE * loan *  (Math.pow(rate,((double)daysSinceOpening/INTEREST_PERIOD)) - 1);
                break;
            default:
                throw new UnsupportedOperationException("Account type not defined");
        }
        return interestValue;
    }

}
