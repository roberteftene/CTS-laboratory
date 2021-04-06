package ro.ase.acs.cts.assignment2.refactor.services.bankservice;

import ro.ase.acs.cts.assignment2.refactor.models.Account;

import java.util.List;

public interface BankStrategy {

    int INTEREST_PERIOD = 365;
    double BROKER_FEE = 0.0125;

    double computeAccountsTotalFees(List<Account> accounts);

}
