package ro.ase.csie.cts.g1092.dp.adapter.disney;

public interface DisneyActions {

    void changeLocation(int x, int y);
    void isWounded(int lostLifePoints);
    void isHealing(int recoverPoints);

    String getName();
    int getLifePoints();
}
