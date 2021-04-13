package ro.ase.csie.cts.g1092.dp.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        SuperHeroCharacter fantasyHeroName =
                new FantasySuperHero("BlueDragon",1000,true);

        fantasyHeroName.move();
        fantasyHeroName.takeAHit(500);
        //The hero should behave as a wounded one
        SuperHeroCharacter woundedHero =
                new WoundedDecorator(fantasyHeroName);
        woundedHero.move();

        fantasyHeroName.heal(200);

        SuperHeroCharacter heroWithShield = new ShieldDecorator(fantasyHeroName,200);
        heroWithShield.takeAHit(500);

        SuperHeroCharacter woundedHeroWithShield = new ShieldDecorator(woundedHero,200);
        woundedHeroWithShield.move();
        woundedHeroWithShield.takeAHit(260);
    }

}
