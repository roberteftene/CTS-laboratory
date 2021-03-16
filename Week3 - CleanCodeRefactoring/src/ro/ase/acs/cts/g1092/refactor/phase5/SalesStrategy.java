package ro.ase.acs.cts.g1092.refactor.phase5;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {

    public static int FIDELITY_YEARS_THRESHOLD = 10;
    public static float MAX_FIDELITY_DISCOUNT = 0.15f;


    public static float getFidelityDiscount(int yearsSinceRegistration) {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }

    public static float getPriceWithDiscount(float initialPrice,float discount, float fidelityDiscount) {
        float initialDiscount = initialPrice - (discount * initialPrice);
        return initialDiscount * ( 1 - fidelityDiscount);
    }

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException {

        if(initialPrice <= 0 
                || yearsSinceRegistration < 0) {
            throw new InvalidValueException();
        }
        
        float fidelityDiscount =
                (productType != ProductType.NEW) ?  getFidelityDiscount(yearsSinceRegistration) : 0;

        return getPriceWithDiscount(initialPrice, productType.getDiscount(),fidelityDiscount);

    }

}
