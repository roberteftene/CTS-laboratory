package ro.ase.csie.cts.g1092.dp.simplefactory;

import ro.ase.csie.cts.g1092.dp.simplefactory.Products.Bazooka;
import ro.ase.csie.cts.g1092.dp.simplefactory.Products.MachineGun;

public class TestFactory {

    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Batman");
//        superHero.setWeapon(new Bazooka("Boom boom boom"));
//        superHero.setWeapon(new MachineGun("MG",50,1));
        superHero.setWeapon(WeaponsFactory.getWeapon(WeaponType.BAZOOKA,"Boom"));
        superHero.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN,"MG"));
    }

}

