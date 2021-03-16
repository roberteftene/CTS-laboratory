package ro.ase.acs.cts.g1092.test;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.acs.cts.g1092.refactor.phase5.ProductType;
import ro.ase.acs.cts.g1092.refactor.phase5.SalesStrategy;
import ro.ase.acs.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;
import ro.ase.acs.cts.g1092.refactor.phase5.services.Marketing2021Service;
import ro.ase.acs.cts.g1092.refactor.phase5.services.ValidatorService;

public class TestSalesStrategy {

    public static void main(String[] args) {
        Marketing2021Service marketing2021Service = new Marketing2021Service();
        ValidatorService validatorService = new ValidatorService();
        SalesStrategy salesStrategy = new SalesStrategy(marketing2021Service,validatorService);

        try {
            float finalPrice = salesStrategy.computeFinalPrice(ProductType.DISCOUNTED,100,5);
            System.out.println("The final price is: " + finalPrice);

            salesStrategy.setMarketingStrategyInterface(yearsSinceRegistration -> 0.5f);

            finalPrice = salesStrategy.computeFinalPrice(ProductType.DISCOUNTED,100,5);
            System.out.println("The final price is: " + finalPrice);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
