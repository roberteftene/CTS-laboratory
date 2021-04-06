package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.Products.Bazooka;
import ro.ase.csie.cts.g1092.dp.simplefactory.Products.MachineGun;
import ro.ase.csie.cts.g1092.dp.simplefactory.Products.Pistol;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class RealWeaponsFactory extends AbstractWeaponsFactory {
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String description) {
        AbstractWeapon abstractWeapon = null;
        switch (type) {
            case PISTOL:
                abstractWeapon = new Pistol(description,100);
                break;
            case MACHINE_GUN:
                abstractWeapon = new MachineGun(description,500);
                break;
            case BAZOOKA:
                abstractWeapon = new Bazooka(description);
                break;
            default:
                throw new UnsupportedOperationException("Undefined weapon");
        }
        return abstractWeapon;
    }
}
