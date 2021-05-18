package ro.ase.csie.cts.g1092.dp.memento;

public class TestMemento {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Superman",500, "Fly");
        HeroRestorePoint initial = superHero.saveData();

        superHero.lifePoints += 500;

        System.out.println("Lifepoints: " + superHero.lifePoints);

        superHero.restoreData(initial);

        System.out.println("Lifepoints: " + superHero.lifePoints);

    }
}
