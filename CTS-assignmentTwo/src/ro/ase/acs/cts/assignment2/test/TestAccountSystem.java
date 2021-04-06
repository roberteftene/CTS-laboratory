package ro.ase.acs.cts.assignment2.test;

import ro.ase.acs.cts.assignment2.refactor.models.Account;
import ro.ase.acs.cts.assignment2.refactor.models.EAccountType;
import ro.ase.acs.cts.assignment2.refactor.models.Loan;
import ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy;
import ro.ase.acs.cts.assignment2.refactor.services.bankservice.BankStrategy2021;

import java.util.ArrayList;
import java.util.List;

public class TestAccountSystem {
    public static void main(String[] args) throws Exception {

        BankStrategy bankStrategy2021 = new BankStrategy2021();
        List<Account> accounts = new ArrayList<>();
        Account accountOne = new Account(34, EAccountType.PREMIUM,new Loan(200,0.9));
        Account accountTwo = new Account(100, EAccountType.SUPER_PREMIUM,new Loan(100,0.2));
        Account accountThree = new Account(30, EAccountType.SUPER_PREMIUM,new Loan(200,0.5));
        Account accountFour = new Account(30, EAccountType.SUPER_PREMIUM,null);
        accounts.add(accountOne);
        accounts.add(accountTwo);
        accounts.add(accountThree);
        accounts.add(accountFour);
        double totalLoansFees = bankStrategy2021.computeAccountsTotalFees(accounts);
        accounts.forEach(System.out::println);
        System.out.printf("TotalFees:" + totalLoansFees + "$");

    }
}
