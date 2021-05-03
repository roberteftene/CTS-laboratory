package robert.eftene.g1092.singleton;

public class DBConnection {

    public static DBConnection instance = null;
    private DBConnection() {
        System.out.println("Connected.");
    }
    public static synchronized DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

}
