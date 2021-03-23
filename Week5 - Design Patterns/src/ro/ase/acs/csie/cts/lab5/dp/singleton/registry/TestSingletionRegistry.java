package ro.ase.acs.csie.cts.lab5.dp.singleton.registry;

public class TestSingletionRegistry {

    public static void main(String[] args) {
        DBConnection dbConnectionLocal = DBConnection.getInstance("localhost",null);
        DBConnection dbConnectionProd = DBConnection.getInstance("prodDB",null);
        if(dbConnectionLocal.equals(dbConnectionProd)) {
            System.out.println("Same connection");
        }
    }
}
