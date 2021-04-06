package ro.ase.csie.cts.g1092.dp.facade.gameAPI;

public class GameAPIFacade {

    public static void createProfileAndConnect() {
        PlayerProfile playerProfile = new PlayerProfile();
        playerProfile.login();
        playerProfile.getUserSettings();

        Subscription subscription = new Subscription();
        subscription.checkSubscription();
    }

}
