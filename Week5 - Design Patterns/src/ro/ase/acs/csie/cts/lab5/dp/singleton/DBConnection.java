package ro.ase.acs.csie.cts.lab5.dp.singleton;

public class DBConnection {

    String socket;
    String schema;
    //eager loading
    //private static DBConnection instance = new DBConnection();

    //lazy loading
    private static DBConnection instance = null;

    //the method used to return the reference to the unique object
    public static DBConnection getInstance() {
        if(instance == null)  {
            instance = new DBConnection();
        }
        return instance;
    }

    //class static initializr
    //uses the class lazy-loading approach
    static  {
        //executed only once when the class is loaded by the JVM
        System.out.println("Loading database connection string");
    }

    //constructor initializr
    {
        //executed before each constructor call
        System.out.println("Init database connection string");
    }

    private DBConnection() {
        System.out.println("Creating a DB connection");
        //Access a local settings file to get credentials and connection string
    }

    private DBConnection(String socket, String schema) {
        this.socket = socket;
        this.schema = schema;
    }
}
