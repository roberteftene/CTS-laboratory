package ro.ase.acs.csie.cts.lab5.dp.singleton.registry;

import java.util.HashMap;

public class DBConnection {

    String socket;
    String schema;

    private static HashMap<String,DBConnection> conns = new HashMap<>();

    public DBConnection(String socket, String schema) {
        this.socket = socket;
        this.schema = schema;
    }

    public static DBConnection getInstance(String socket, String schema) {
        //We use the socket as the key
        DBConnection connection = conns.get(socket);
        if(connection == null) {
            connection = new DBConnection(socket,schema);
            conns.put(socket,connection);
        }

        return connection;
    }


}
