package ro.ase.acs.csie.cts.lab5.dp.singleton.enumms;

public enum DBConnection {
    instance;

    String socket;
    String schema;

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
