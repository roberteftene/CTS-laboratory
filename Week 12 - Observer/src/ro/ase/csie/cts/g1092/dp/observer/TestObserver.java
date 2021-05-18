package ro.ase.csie.cts.g1092.dp.observer;

public class TestObserver {
    public static void main(String[] args) {
        NetworkModule networkModule = new NetworkModule();
        INetworkEventHandler autosave = new AutoSaveModule();
        INetworkEventHandler notifications = new UINotificationsModule();

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.registerModule(autosave);
        networkModule.registerModule(notifications);

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.unregisterModule(autosave);

        networkModule.networkStatusChanged(NetworkStatus.DOWN);

    }
}
