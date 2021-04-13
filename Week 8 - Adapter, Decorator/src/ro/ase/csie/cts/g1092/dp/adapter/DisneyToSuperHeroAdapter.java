package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;

public class DisneyToSuperHeroAdapter extends SuperHeroCharacter {

    DisneyActions disneyCharacter = null;

    public DisneyToSuperHeroAdapter(DisneyActions disneyCharacter) {
        super(disneyCharacter.getName(),disneyCharacter.getLifePoints());
        this.disneyCharacter = disneyCharacter;
    }

    @Override
    public void move() {
        this.disneyCharacter.changeLocation(0,0);
    }

    @Override
    public void crouch() {
        System.out.println(String.format("%s is crouching",this.disneyCharacter.getName()));
    }

    @Override
    public void takeAHit(int points) {
        this.disneyCharacter.isWounded(points);
    }

    @Override
    public void heal(int points) {
        this.disneyCharacter.isHealing(points);
    }
}
