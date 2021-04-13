package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1092.dp.adapter.disney.DonaldDuck;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {
        //simulate the game by using the existing characters framework
        SuperHeroCharacter fantasyHeroName =
                new FantasySuperHero("BlueDragon",1000,true);

        fantasyHeroName.move();
        fantasyHeroName.takeAHit(500);
        fantasyHeroName.heal(200);

        //use a Disney character as a SuperHeroCharacter one
        DisneyActions donald = new DonaldDuck(500);
        donald.changeLocation(100,500);
        donald.isWounded(100);
        donald.isHealing(50);

        ArrayList<SuperHeroCharacter> gameHeroes = new ArrayList<>();
        gameHeroes.add(fantasyHeroName);

        DisneyToSuperHeroAdapter donaldAdapter = new DisneyToSuperHeroAdapter(donald);
        gameHeroes.add(donaldAdapter);

        System.out.println("-------------------------------");
        gameHeroes.forEach(hero -> {
            hero.crouch();
            hero.takeAHit(50);
            hero.heal(50);
        });
    }

}
