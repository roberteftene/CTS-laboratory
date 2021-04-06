package ro.ase.csie.cts.g1092.dp.simplefactory.Products;

public class MachineGun extends AbstractWeapon {

    int noBullets;

    public MachineGun(String desc, int power) {
        this.description = desc;
        this.powerLevel = power;
        this.noBullets = noBullets;
    }

    @Override
    public void pewPew() {
        System.out.println("Machine gun ->prrrrr");
    }
}
