package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponsFactory;

public class TestFactoryMethod {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Batman");
        boolean kidsMode = false;
        AbstractWeaponsFactory abstractWeaponsFactory = null;

        if(kidsMode) {
            abstractWeaponsFactory = new WaterWeaponsFactory();
        } else {
            abstractWeaponsFactory = new RealWeaponsFactory();
        }
        superHero.setWeapon(abstractWeaponsFactory.getWeapon(WeaponType.BAZOOKA,"Boom"));
        superHero.getWeapon().pewPew();
    }
}
