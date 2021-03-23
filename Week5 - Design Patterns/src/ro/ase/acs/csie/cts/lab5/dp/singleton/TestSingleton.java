package ro.ase.acs.csie.cts.lab5.dp.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        System.out.println("The app started");

        DBConnection connection1 = DBConnection.getInstance();
        //miss leading -> same connection
        DBConnection connection2 = DBConnection.getInstance(
                "localhost", "ctsDB"
        );

    }
}
