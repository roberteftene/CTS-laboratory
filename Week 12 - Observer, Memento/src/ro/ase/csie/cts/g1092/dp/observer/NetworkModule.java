package ro.ase.csie.cts.g1092.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {
    List<INetworkEventHandler> modules = new ArrayList<>();

    public void registerModule(INetworkEventHandler module) {
        modules.add(module);
    }

    public void unregisterModule(INetworkEventHandler module) {
        modules.remove(module);
    }

    public void networkStatusChanged(NetworkStatus status) {
        if(status == NetworkStatus.UP) {
            modules.forEach(module -> module.notifyNetworkUp());
        } else {
            modules.forEach(module -> module.notifyNetworkDown());
        }
    }
}
