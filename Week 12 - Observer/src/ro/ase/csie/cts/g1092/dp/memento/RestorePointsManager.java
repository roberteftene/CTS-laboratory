package ro.ase.csie.cts.g1092.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {
    List<HeroRestorePoint> restorePoints = new ArrayList<>();

    public void addRestorePoint(HeroRestorePoint restorePoint) {
        restorePoints.add(restorePoint);
    }

    public void removeRestorePoint(HeroRestorePoint restorePoint) {
        restorePoints.remove(restorePoint);
    }

    public HeroRestorePoint getRestorePoint(int index) {
        if(index < 0 && index >= restorePoints.size()) {
            throw new UnsupportedOperationException();
        } else {
            return restorePoints.get(index);
        }
    }
}
