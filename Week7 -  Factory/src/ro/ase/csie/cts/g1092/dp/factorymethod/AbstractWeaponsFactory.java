package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public abstract class AbstractWeaponsFactory {

    public abstract AbstractWeapon getWeapon(WeaponType type, String description);

}
