package ro.ase.csie.cts.g1092.dp.builder;

import ro.ase.csie.cts.g1092.dp.builder.services.WeaponService;

public class TestBuilder {

    public static void main(String[] args) {
        //Bad approach, risk of null values

        //1. Create
//        Superhero superhero = new Superhero();
        //2. Init
        //don't forget to initialize the object with values


        //Not best approach, but it is ish, at least we dont have null values
        WeaponService shotgun = new WeaponService("pistol");
        WeaponService katana = new WeaponService("sword");
        Superhero superhero = new Superhero(
                "Superman",100,false,false,shotgun,katana,"fly","");
        Superhero batman = new Superhero(
                "Batman",100,false,false,null,null,"","");


        //We must implement a way in order to have the posibility to design constructor for specific attributes

        //Best approach
        Superhero hulk =
                new Superhero.SuperheroBuilder("Hulk",100)
                .setLeftWeapon(katana)
                .setSuperPower("Muscle")
                .setSuperPower("Smashing")
                .build();

        Superhero joker =
                new Superhero.SuperheroBuilder("Joker",200)
                .isVillain()
                .setRightWeapon(shotgun)
                .build();

        Superhero dummyHero =
                new Superhero.SuperheroBuilder("Dummy",50).build();

    }
}
