package ro.ase.csie.cts.g1092.dp.simplefactory.Products;

public class Pistol extends AbstractWeapon {

    public Pistol(String description, int power) {
        super();
        this.description = description;
        this.powerLevel = power;
    }

    @Override
    public void pewPew() {
        System.out.println("Pew pew -> -> ->");
    }
}
