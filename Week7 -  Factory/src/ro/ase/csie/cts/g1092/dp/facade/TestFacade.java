package ro.ase.csie.cts.g1092.dp.facade;

import ro.ase.csie.cts.g1092.dp.facade.gameAPI.*;

public class TestFacade {

    public static void main(String[] args) {
        //toward connecting to the game from an external app you need to:

        //1. create player profile and login
//        PlayerProfile playerProfile = new PlayerProfile();
//        playerProfile.login();
//        playerProfile.getUserSettings();
//
        //2. check subscription
//        Subscription subscription = new Subscription();
//        subscription.checkSubscription();

        //using facade
        GameAPIFacade.createProfileAndConnect();

        //3. get the main character
        SuperHero superHero = new SuperHero("Batman", new Helmet(), new SuperPower());
    }

}
