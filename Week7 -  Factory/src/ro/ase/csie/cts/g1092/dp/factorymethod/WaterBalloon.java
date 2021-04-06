package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.AbstractWeapon;

public class WaterBalloon extends AbstractWeapon {

    public WaterBalloon(String des) {
        this.description = des;
    }

    @Override
    public void pewPew() {
        System.out.printf("Splashh");
    }
}
