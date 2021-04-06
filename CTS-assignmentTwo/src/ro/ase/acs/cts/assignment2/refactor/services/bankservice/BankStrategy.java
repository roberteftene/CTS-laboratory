package ro.ase.acs.cts.assignment2.refactor.services.bankservice;

import ro.ase.acs.cts.assignment2.refactor.models.Account;

import java.util.List;

public interface BankStrategy {

    double computeLoanTax(List<Account> accounts);

}
