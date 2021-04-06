package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponsFactory {


    @Override
    public AbstractWeapon getWeapon(WeaponType type, String description) {
        AbstractWeapon weapon = null;

        switch (type) {
            case BAZOOKA:
                weapon = new WaterBalloon(description);
                break;
            default:
                throw new UnsupportedOperationException("Didnt cover this weapon");
        }
        return  weapon;
    }
}
